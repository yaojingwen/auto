<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
	<title>界面自动化运维平台</title>
	<link rel="icon" href="https://www.asiainfo.com/static/favicon.ico">


	<link rel="stylesheet" type="text/css" href="css/webbase.css" />
	<link rel="stylesheet" type="text/css" href="css/pages-login-manage.css" />
</head>

<body class="hold-transition login-page">

<div class="loginmanage">
	<div>
		<span class="manage-title" style="text-align:center;font-size:85px;border-bottom-width: 3000px;margin-left: 460px; ">界面自动化运维平台</span>
	</div>
	<div class="py-container">

		<div class="loginform"style="
			                  margin-right:9cm;
			                  margin-top: 225px;
			                  height: 260px;
			                  float:left;
			                  left: 300px;
			                  border-bottom-width:
			                  100px;
			                  margin-bottom: 160px;
			                  padding-right: 90px;
			                  padding-left: 120px;
			                  width: 480px;
			                  margin-left: 50px;
			                  padding-top: 40px;
			                  border-right-width: 40px;
			                  ">

			<div id="profile" class="tab-pane  active">

				<form class="sui-form" style="
						margin-top: 115px;
						" action="/login" method="post">
					<div class="input-prepend"><span class="add-on loginname"></span>
						<input id="prependedInput" name="username" type="text" placeholder="邮箱/用户名/手机号" class="span2 input-xfat">
					</div>
					<div class="input-prepend"><span class="add-on loginpwd"></span>
						<input id="prependedInput" name="password" type="password" placeholder="请输入密码" class="span2 input-xfat">
					</div>
					<div class="logined">
						<%--<a class="sui-btn btn-block btn-xlarge btn-danger" href="admin/index.html" target="_blank" style="
                                border-left-width: 1px; width: 339px;">登&nbsp;&nbsp;录</a>--%>
                        <%-- <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>--%>
							<button type="submit" class="sui-btn btn-block btn-xlarge btn-danger" href="admin/index.html" target="_blank" style="
                                border-left-width: 1px; width: 339px;">登&nbsp;&nbsp;录</button>

					</div>

				</form>

			</div>
		</div>
	</div>
	<div class="clearfix"></div>
</div>
	<!-- /.login-box -->

	<!-- jQuery 2.2.3 -->
	<!-- Bootstrap 3.3.6 -->
	<!-- iCheck -->
	<script
		src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
	<script>
		$(function() {
			$('input').iCheck({
				checkboxClass : 'icheckbox_square-blue',
				radioClass : 'iradio_square-blue',
				increaseArea : '20%' // optional
			});
		});
	</script>
</body>

</html>