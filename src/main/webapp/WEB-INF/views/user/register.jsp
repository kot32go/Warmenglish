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
<link href="../resources/css/register.css" rel="stylesheet">
<title>请注册</title>
</head>
<body>
    <div class="container">
        <sf:form method="post"  modelAttribute="user">
            <div class="form-group">
                <label for="InputName">真实姓名</label>
                <sf:input type="text" class="form-control" id="InputName" placeholder="Enter Name" path="name"/>
            </div>
            <div class="form-group">
                <lable for="InputUsername">用户名</lable>
                <sf:input type="text" class="form-control" id="InputUsername" placeholder="Enter Uesername" path="username"/>
            </div>
            <div class="form-group">
                <label for="InputPassword">密码</label>
                <sf:input type="password" class="form-control" id="InputPassword" placeholder="Password" path="password"/>
            </div>

            <div class="form-group">
                <button type="submit" class="btn btn-default btn-group-justified">注册</button>
            </div>
        </sf:form>
    </div>
</body>