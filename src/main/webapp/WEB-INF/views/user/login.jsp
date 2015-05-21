<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"rel="stylesheet">
<link href="../resources/css/login.css" rel="stylesheet">
<title>请登录</title>
</head>
<body background="../resources/images/splash-home.png">

	<div class="container">
		<div class="col-md-6 letters">
			<h>With Warm English,you can:</h>
			<p></p>
		</div>
		<div class="col-md-offset-8 taber">
			<ul id="myTab" class="nav nav-tabs">
				<li class="active"><a href="#login" data-toggle="tab">登录</a></li>
				<li><a href="#register" data-toggle="tab">注册</a></li>
			</ul>
			<div id="myTabContent" class="tab-content">
				<div class="tab-pane fade in active" id="login">
					<sf:form class="form-signin" method="post" modelAttribute="user" action="login">
						<h2 class="form-signin-heading">请登录</h2>
						<label for="inputEmail" class="sr-only">用户名</label>
						<sf:input type="text" class="form-control" path="username"
							placeholder="请输入用户名" />
						<sf:errors path="username" />
						<br />
						<sf:input type="password" class="form-control" path="password"
							placeholder="请输入密码" />
						<sf:errors path="password" />
						<input class="btn btn-lg btn-primary btn-block" type="submit" />
					</sf:form>
				</div>
				<div class="tab-pane fade" id="register">
					<sf:form method="post" modelAttribute="user" action="register">
						<div class="form-group">
							<label for="InputName">真实姓名</label>
							<sf:input type="text" class="form-control" id="InputName"
								placeholder="Enter Name" path="name" />
						</div>
						<div class="form-group">
							<lable for="InputUsername">用户名</lable>
							<sf:input type="text" class="form-control" id="InputUsername"
								placeholder="Enter Uesername" path="username" />
						</div>
						<div class="form-group">
							<label for="InputPassword">密码</label>
							<sf:input type="password" class="form-control" id="InputPassword"
								placeholder="Password" path="password" />
						</div>

						<div class="form-group">
							<button type="submit" class="btn btn-default btn-group-justified">注册</button>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</div>
	<script src="../resources/js/jquery.min.js"></script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>