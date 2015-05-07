<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/signin.css" rel="stylesheet">
<title>请登录</title>
</head>
<body>
	<div class="container">

		<sf:form class="form-signin" method="post" modelAttribute="user">
			<h2 class="form-signin-heading">请登录</h2>
			<label for="inputEmail" class="sr-only">用户名</label>
			<sf:input type="text"  class="form-control" path="username"
				 placeholder="请输入用户名" />
			<sf:errors path="username" />
			<br/>
			<sf:input type="password" class="form-control" path="password"
				 placeholder="请输入密码" />
			<sf:errors path="password" />
			<div class="register">
				<a href="register">注册>></a>
			</div>
			<input class="btn btn-lg btn-primary btn-block" type="submit"/>
		</sf:form>

	</div>
</body>
</html>