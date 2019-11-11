<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<%--<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>
					<security:authentication property="principal.username" />
				</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>
--%>
		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header"></li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>功能视图</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="/product/page/list">
						<i class="fa fa-circle-o"></i> CASE执行
					</a></li>

				</ul></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>管理视图</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/pages/case-list.jsp">
						<i class="fa fa-circle-o"></i> CASE管理
					</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/pages/syslog-list.jsp">
						<i class="fa fa-circle-o"></i> 组件开发
					</a></li>

				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>配置视图</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
							href="/product/page/list">
						<i class="fa fa-circle-o"></i> 配置管理
					</a></li>
					<li id="system-setting"><a
							href="/orders/list">
						<i class="fa fa-circle-o"></i> 数据查询
					</a></li>

				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>用户视图</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>


			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
						href="/user/list"> <i
							class="fa fa-circle-o"></i> 用户管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/pages/role-list.jsp"> <i
							class="fa fa-circle-o"></i> 角色管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/pages/permission-list.jsp">
							<i class="fa fa-circle-o"></i> 权限管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/pages/syslog-list.jsp"> <i
							class="fa fa-circle-o"></i> 访问日志
					</a></li>
				</ul></li>


		</ul>
	</section>
	<!-- /.sidebar -->
</aside>