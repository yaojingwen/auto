<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<body class="hold-transition skin-blue sidebar-mini">

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
				产品管理 <small>全部产品</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a
					href="${pageContext.request.contextPath}/pages/product-list.jsp">产品管理</a></li>

				<li class="active">全部产品</li>
			</ol>
			</section>
			<!-- 内容头部 /-->

			<!-- 正文区域 -->
			<section class="content"> <!-- .box-body -->
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">列表</h3>
				</div>

				<div class="box-body">

					<!-- 界面表格 -->
					<div class="table-box">

						<!--工具栏-->
						<div class="pull-left">
							<div class="form-group form-inline">
								<div class="btn-group">
									<button type="button" class="btn btn-default" title="新建"
										onclick='location.href="${pageContext.request.contextPath}/pages/product-add.jsp"'>
										<i class="fa fa-file-o"></i> 新建
									</button>
									<button type="button" class="btn btn-default" title="删除"
										onclick='confirm("你确认要删除吗？")'>
										<i class="fa fa-trash-o"></i> 删除
									</button>
									<button type="button" class="btn btn-default" title="开启"
										onclick='confirm("你确认要开启吗？")'>
										<i class="fa fa-check"></i> 开启
									</button>
									<button type="button" class="btn btn-default" title="屏蔽"
										onclick='confirm("你确认要屏蔽吗？")'>
										<i class="fa fa-ban"></i> 屏蔽
									</button>
									<button type="button" class="btn btn-default" title="刷新"
										onclick="window.location.reload();">
										<i class="fa fa-refresh"></i> 刷新
									</button>
								</div>
							</div>
						</div>
						<div class="box-tools pull-right">
							<div class="has-feedback">
								<input type="text" class="form-control input-sm"
									placeholder="搜索"> <span
									class="glyphicon glyphicon-search form-control-feedback"></span>
							</div>
						</div>
						<!--工具栏/-->

						<!--界面列表-->
						<table id="dataList"
							class="table table-bordered table-striped table-hover dataTable">
							<thead>
								<tr>
									<th class="" style="padding-right: 0px;"><input
										id="selall" type="checkbox" class="icheckbox_square-blue">
									</th>
									<th class="sorting_asc">ID</th>

									<th class="sorting">订单号</th>
									<th class="sorting">路线名称</th>
									<th class="sorting">购买会员</th>
									<th class="sorting">出发日期</th>
									<th class="sorting">状态</th>

									<th class="text-center">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${pageBean.list}" var="pd">
									<tr>
										<td><input name="ids" type="checkbox"></td>
										<td>${pd.id}</td>

										<td>${pd.productNum}</td>
										<td>${pd.productName}</td>
										<td>${pd.cityName}</td>
										<td>
											${pd.departureTimeStr}
											<fmt:formatDate value="${pd.departureTime}" pattern="yyyy-MM-dd HH:mm:ss" />
										</td>
										<td>
											<c:choose>
												<c:when test="${pd.productStatus==0}">
													关闭
												</c:when>
												<c:otherwise>启用</c:otherwise>
											</c:choose>
										</td>

										<td class="text-center">
											<button type="button" class="btn bg-olive btn-xs"
													onclick='location.href="/product/modify/${pd.id}"'>修改</button>
											<button type="button" class="btn bg-olive btn-xs"
													onclick='location.href="/product/delete/${pd.id}"'>删除</button>
										</td>
									</tr>
								</c:forEach>

							</tbody>

						</table>
						<!--界面列表/-->

						<!--工具栏-->
						<div class="pull-left">
							<div class="form-group form-inline">
								<div class="btn-group">
									<button type="button" class="btn btn-default" title="新建"
										onclick='location.href="all-order-manage-edit.html"'>
										<i class="fa fa-file-o"></i> 新建
									</button>
									<button type="button" class="btn btn-default" title="删除"
										onclick='confirm("你确认要删除吗？")'>
										<i class="fa fa-trash-o"></i> 删除
									</button>
									<button type="button" class="btn btn-default" title="开启"
										onclick='confirm("你确认要开启吗？")'>
										<i class="fa fa-check"></i> 开启
									</button>
									<button type="button" class="btn btn-default" title="屏蔽"
										onclick='confirm("你确认要屏蔽吗？")'>
										<i class="fa fa-ban"></i> 屏蔽
									</button>
									<button type="button" class="btn btn-default" title="刷新"
										onclick="window.location.reload();">
										<i class="fa fa-refresh"></i> 刷新
									</button>
								</div>
							</div>
						</div>
						<div class="box-tools pull-right">
							<div class="has-feedback">
								<input type="text" class="form-control input-sm"
									placeholder="搜索"> <span
									class="glyphicon glyphicon-search form-control-feedback"></span>
							</div>
						</div>
						<!--工具栏/-->


					</div>
					<!-- 界面表格 /-->

				</div>
				<!-- /.box-body -->

				<!-- .box-footer-->
				<div class="box-footer">
					<div class="pull-left">
						<div class="form-group form-inline">
							总共${pageBean.pages}页，共${pageBean.total}条界面。 每页
							<select class="form-control" onchange="goPage(this.value)">
								<option <c:if test="${pageBean.pageSize==1}">selected="selected"</c:if> value="1">1</option>
								<option <c:if test="${pageBean.pageSize==2}">selected="selected"</c:if> value="2">2</option>
								<option <c:if test="${pageBean.pageSize==3}">selected="selected"</c:if> value="3">3</option>
							</select> 条
						</div>
					</div>
					<script>
						function  goPage(size) {
							location.href='/product/page/list?pageNum=1&rows='+size;
                        }
					</script>

					<div class="box-tools pull-right">
						<ul class="pagination">
							<li><a href="/product/page/list?pageNum=1&rows=${pageBean.pageSize}" aria-label="Previous">首页</a></li>
							<li><a href="/product/page/list?pageNum=${pageBean.prePage}&rows=${pageBean.pageSize}">上一页</a></li>

							<c:forEach begin="${pageBean.navigateFirstPage}" end="${pageBean.navigateLastPage}" var="p">
								<li><a href="/product/page/list?pageNum=${p}&rows=${pageBean.pageSize}">${p}</a></li>
							</c:forEach>
							<li><a href="/product/page/list?pageNum=${pageBean.nextPage}&rows=${pageBean.pageSize}">下一页</a></li>
							<li><a href="/product/page/list?pageNum=${pageBean.pages}&rows=${pageBean.pageSize}" aria-label="Next">尾页</a></li>
						</ul>
					</div>

				</div>
				<!-- /.box-footer-->

			</div>

			</section>
			<!-- 正文区域 /-->

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

		$(document).ready(function() {

			// 激活导航位置
			setSidebarActive("order-manage");

			// 列表按钮 
			$("#dataList td input[type='checkbox']").iCheck({
				checkboxClass : 'icheckbox_square-blue',
				increaseArea : '20%'
			});
			// 全选操作 
			$("#selall").click(function() {
				var clicks = $(this).is(':checked');
				if (!clicks) {
					$("#dataList td input[type='checkbox']").iCheck("uncheck");
				} else {
					$("#dataList td input[type='checkbox']").iCheck("check");
				}
				$(this).data("clicks", !clicks);
			});
		});
	</script>
</body>

</html>