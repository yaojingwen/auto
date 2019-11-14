package com.auto.components.exception;

import com.alibaba.fastjson.JSON;
import com.auto.util.ResultBase;
import com.auto.util.StatusCode;
import org.apache.log4j.Logger;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器
 * 
 * @author Administrator
 *
 */
@ControllerAdvice
public class CustomExceptionResolver extends DefaultHandlerExceptionResolver {

	private Logger logger = Logger.getLogger(CustomExceptionResolver.class);

	@ExceptionHandler(value = Exception.class)
	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {

		if (null == ex) {
			System.out.println("ex:----------null");
		} else {
			// logger.info(ex.getMessage());
			logger.error("错误", ex);
			// 操作异常 设置返回信息。
			ResultBase res = new ResultBase();
			res.setSuccess(false);

			// 异常类型判断
			if (ex instanceof CustomException) {
				// 自定义异常
				CustomException e = (CustomException) ex;
				res.setMessage(e.getMessage());
				if (null == e.getStatusCode()) {
					res.setCode(StatusCode.ERROR); // 错误码
				} else {
					res.setCode(e.getStatusCode()); // 错误码
				}
				logger.info(e.getMessage());
			} else if (ex instanceof HttpMessageNotReadableException) {
				// 请求参数解析异常
				String msg = ex.getMessage();
				if (msg.indexOf("field") > 0) {
					String param = msg.substring(msg.indexOf("field") + 5, msg.indexOf("(")).replace("\"", "");
					res.setMessage("参数" + param + "不存在");
				} else {
					res.setMessage("参数不能为空");
				}
				res.setCode(StatusCode.URL_PARAM_ERROR); // 错误码
				logger.error("请求发生异常!", ex);
			} else {
				// 未知异常
				res.setCode(StatusCode.ERROR);
				res.setMessage("系统异常");
			}

//			// 发送数据到前端。
//			try {
//				// 设置返回类型 为 json
//				response.setContentType("application/json; charset=utf-8");
//				// 设置返回编码类型为 utf-8
//				response.setCharacterEncoding("utf-8");
//				// 发送数据
//				response.getWriter().write(JSON.toJSONString(res));
//				response.getWriter().flush();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//				try {
//					// 关闭流
//					response.getWriter().close();
//				} catch (IOException e) {
//				}
//			}
//			// 不需要返回数据
//			return null;


			// 返回一个友好的错误页面，并显示错误消息
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("msg", JSON.toJSONString(res));
			modelAndView.setViewName("404");
			return modelAndView;
		}

		return super.doResolveException(request, response, handler, ex);
	}

}
