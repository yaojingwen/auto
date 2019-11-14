package com.auto.util;

/**
 * 
 * @ClassName: ResultCode
 * @Description: 返回结果码。 SUCCESS 成功，ERROR 错误，NULL 缺少参数, NOT_LOGIN 未登录,
 *               AUTHENTICATION 身份认证失败
 * @author DDM
 * @date 2018年1月18日 下午4:20:18
 *
 */
public enum StatusCode {
	/**
	 * 路径错误
	 */
	URL_ERROR(404),
	/**
	 * 参数不匹配接收
	 */
	URL_PARAM_ERROR(400),
	/**
	 * 成功
	 */
	SUCCESS(1000),
	/**
	 * 错误
	 */
	ERROR(1001),
	/**
	 * 操作失败
	 */
	FAIL(1002),
	/**
	 * 操作过于频繁
	 */
	FREQUENTLY(1003),
	/**
	 * 未登录
	 */
	NOT_LOGIN(2001),
	/**
	 * 身份认证失败
	 */
	AUTHENTICATION(2002),
	/**
	 * 缺少参数
	 */
	PARAM_NULL(2003),
	/**
	 * 参数错误
	 */
	PARAM_ERROR(2004),
	/**
	 * 不存在
	 */
	NULL(3001),
	/**
	 * 重复
	 */
	REPEAT(3002),

	/**
	 * 非空
	 */
	NOT_NULL(3003);

	private int i;

	private StatusCode(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return this.i + "";
	}

	/**
	 * 获取 Integer 型 enum
	 * 
	 * @author DDM 2018年1月18日
	 */
	public Integer toInteger() {
		return this.i;
	}

}
