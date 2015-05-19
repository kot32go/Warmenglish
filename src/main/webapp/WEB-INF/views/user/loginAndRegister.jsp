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
<link href="../resources/css/loginAndRegister.css" rel="stylesheet">
<title>��¼��ע��</title>
</head>
<body background="img/splash-home.png">

<div class="container">
    <div class="col-md-6 letters">
        <h>With Warm English,you can:</h>
        <p></p>
    </div>
    <div class="col-md-offset-8 taber">
        <ul id="myTab" class="nav nav-tabs">
            <li class="active"><a href="#login" data-toggle="tab">��¼</a></li>
            <li><a href="#register" data-toggle="tab">ע��</a></li>
        </ul>
        <div id="myTabContent" class="tab-content">
            <div class="tab-pane fade in active" id="login">
                <form class="form-control">
                    <div class="form-group">
                        <label for="InputUsername">�û���</label>
                        <input type="text" class="form-control" id="InputUsername" placeholder="Enter Uesername">
                    </div>
                    <div class="form-group">
                        <label for="InputPassword">����</label>
                        <input type="password" class="form-control" id="InputPassword" placeholder="Password">
                    </div>
                    <button type="submit" class="btn btn-default btn-group-justified">��¼</button>
                </form>
            </div>
            <div class="tab-pane fade" id="register">
                <form class="form-control">
                    <div class="form-group">
                        <label for="InputName">��ʵ����</label>
                        <input type="text" class="form-control" id="InputName" placeholder="Enter Name">
                    </div>
                    <div class="form-group">
                        <label for="InputUsername">�û���</label>
                        <input type="text" class="form-control" id="InputUsername" placeholder="Enter Uesername">
                    </div>
                    <div class="form-group">
                        <label for="InputPassword">����</label>
                        <input type="password" class="form-control" id="InputPassword" placeholder="Password">
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-default btn-group-justified">ע��</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>