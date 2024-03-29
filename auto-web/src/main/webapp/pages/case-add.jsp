<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>界面自动化</title>
<meta name="description" content="界面自动化">
<meta name="keywords" content="界面自动化">

<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
	name="viewport">


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/morris/morris.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/select2/select2.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

	<div class="wrapper">

		<!-- 页面头部 -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- 页面头部 /-->
		<!-- 导航侧栏 -->
		<jsp:include page="aside.jsp"></jsp:include>
		<!-- 导航侧栏 /-->

		<!-- 内容区域 -->
		<div class="content-wrapper">

			<!-- 内容头部 -->
			<section class="content-header">
			<h1>
				管理视图 <small>CASE管理</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a
					href="${pageContext.request.contextPath}/user/findAll.do">管理视图</a></li>
				<li class="active">CASE管理</li>
			</ol>
			</section>
			<!-- 内容头部 /-->

			<form action="/case/add"
				method="post">
				<!-- 正文区域 -->
				<section class="content"> <!--产品信息-->

				<div class="panel panel-default">
					<div class="panel-heading">用例详情</div>
					<div class="row data-type">

						<input type="hidden" name="operatorId" value="${admin.operatorId}">
						<div class="col-md-1 title">业务模块</div>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userAdmin"
								   placeholder="业务模块" value="${admin.userAdmin}">
						</div>
						<div class="col-md-1 title">测试人员</div>
						<div class="col-md-5 data">
							<input type="password" class="form-control" name="userPass"
								   placeholder="测试人员" value="${admin.userPass}">
						</div>
						<div class="col-md-1 title">业务菜单</div>
						<input type="hidden" name="operatorId" value="${admin.operatorId}"/>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userName"
								   placeholder="业务菜单" value="${admin.userName}">
						</div>
						<div class="col-md-1 title">菜单编码</div>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userMobile"
								   placeholder="菜单编码" value="${admin.userMobile}">
						</div>
						<div class="col-md-1 title">用例名称</div>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userStaff"
								   placeholder="用例名称" value="${admin.userStaff}">
						</div>
						<div class="col-md-1 title">用例编码</div>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userEmail"
								   placeholder="用例编码" value="${admin.userEmail}">
						</div>
						<div class="col-md-1 title">用例参数名</div>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userEmail"
								   placeholder="用例参数名" value="${admin.userEmail}">
						</div>
						<div class="col-md-1 title">用例级别</div>
						<div class="col-md-5 data">
							<input type="text" class="form-control" name="userEmail"
								   placeholder="用例级别" value="${admin.userEmail}">
						</div>
						<div class="col-md-1 title">用例参数值</div>
						<div class="col-md-11 data">
							<input type="text" class="form-control" name="userEmail"
								   placeholder="用例参数值" value="${admin.userEmail}">
						</div>

					<%--	<div class="col-md-2 title rowHeight2x" STYLE="height: 257px;"
						>页面定义<br>(同一菜单编码共用,<br>修改请慎重)</div>
						<div class="col-md-10 data rowHeight2x" STYLE="height: 257px;">
							<textarea class="form-control" rows="3" placeholder="页面定义" STYLE="height: 257px;"></textarea>
						</div>
						<div class="col-md-2 title rowHeight2x" STYLE="height: 257px;"><br>操作步骤：</div>
						<div class="col-md-10 data rowHeight2x"  STYLE="height: 257px;">
							<textarea class="form-control" rows="3" placeholder="操作步骤："  STYLE="height: 257px;"></textarea>
						</div>--%>


							<div class="col-md-1 title rowHeight2x" STYLE="height: 666px;"
							><br><br>页面定义<br>(同一菜单编码共用,<br>修改请慎重)</div>
							<div class="col-md-5 data rowHeight2x" STYLE="height: 666px;">
								<textarea class="form-control" rows="3" placeholder="页面定义" STYLE="height: 666px;"></textarea>
							</div>
							<div class="col-md-1 title rowHeight2x" STYLE="height: 666px;"><br><br><br>操作步骤：</div>
							<div class="col-md-5 data rowHeight2x"  STYLE="height: 666px;">
								<textarea class="form-control" rows="3" placeholder="操作步骤："  STYLE="height: 666px;"></textarea>
							</div>




						<div class="col-md-1 title rowHeight2x" STYLE="height: 333px;"><br><br>校验步骤: </div>
						<div class="col-md-11 data rowHeight2x"  STYLE="height: 333px;">
							<textarea class="form-control" rows="3" placeholder="校验步骤："  STYLE="height: 333px;"></textarea>
						</div>


					<%--老的--%>
					</div>
				</div>

				<!--订单信息/--> <!--工具栏-->
				<div class="box-tools text-center">
					<c:if test="${admin.operatorId==null}">
						<button type="submit" class="btn bg-maroon">保存</button>
					</c:if>
					<c:if test="${admin.operatorId!=null}">
						<button type="submit" class="btn bg-maroon">修改</button>
					</c:if>
					<button type="button" class="btn bg-default"
						onclick="history.back(-1);">返回</button>
				</div>
				<!--工具栏/--> </section>
				<!-- 正文区域 /-->
			</form>
		</div>
		<!-- 内容区域 /-->

		<!-- 底部导航 -->
		<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 1.0.8
		</div>
		<strong>Copyright &copy; 2019-2020 <a
			href="#">研究院研发部</a>.
		</strong> All rights reserved. </footer>
		<!-- 底部导航 /-->

	</div>


	<script
		src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
	<script>
		$.widget.bridge('uibutton', $.ui.button);
	</script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>

	<script>
		$(document).ready(function() {
			// 选择框
			$(".select2").select2();

			// WYSIHTML5编辑器
			$(".textarea").wysihtml5({
				locale : 'zh-CN'
			});
		});

		// 设置激活菜单
		function setSidebarActive(tagUri) {
			var liObj = $("#" + tagUri);
			if (liObj.length > 0) {
				liObj.parent().parent().addClass("active");
				liObj.addClass("active");
			}
		}
	</script>


</body>

</html>