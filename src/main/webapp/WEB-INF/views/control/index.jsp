<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/index.css" rel="stylesheet">


<title>温暖英语-主页</title>
</head>
<body style="overflow:scroll;overflow-y:hidden;overflow-x: hidden">

	<nav class="navbar navbar-inverse navbar-static-top">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>>
			<a class="navbar-brand" href="#">欢迎，${logined_user.name} 老师</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a role="button"><span class="glyphicon glyphicon-home"></span></a></li>
                <li><a role="button" id="personinfo" data-toggle="popover" data-container="body" data-trigger="focus" title="个人信息" data-placement="bottom" data-content="真实姓名：${logined_user.name}用户名：${logined_user.username}">
                <span class="glyphicon glyphicon-user"></span></a></li>
                <li><a role="button"><span class="glyphicon glyphicon-info-sign"></span></a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a role="button"><span class="glyphicon glyphicon-off"></span></a></li>
            </ul>
        </div>
	</div>
	</nav>

	<div class="thumb" style="overflow: hidden">
		<div class="sign">
			<p>Warm Your Life</p>
		</div>
		<img src="../resources/images/splash-home.png" alt="splash-home.png"
			style="left: -1px; top: 0; width: 100%; height: auto; position: absolute;: relative;"
			data-image-dimensions="1501x961" data-image-focal-point="0.5,0.5">
	</div>

	<div class="main">
		<div class="col-md-4 col-sm-4" >
			<a href="main?type=homework"><input type="image" src="../resources/images/1.png" width="200px"></a>
			<p>作业管理</p>
		</div>
		<div class="col-md-4 col-sm-4">
			<a href="main?type=send_message"><input type="image" src="../resources/images/2.png" width="200px"></a>
			<p>通知管理</p>
		</div>
		<div class="col-md-4 col-sm-4">
			<a href="main?type=add_class"><input type="image" src="../resources/images/3.png" width="200px"></a>
			<p>班级管理</p>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../resources/js/jquery.min.js"></script>
	<script>
	$(".glyphicon-user").click(function(){
		$(document).ready(function(){
			$(".glyphicon-user").click(function(){
				$('#personinfo').popover('toggle');
			})
		})
	})
	</script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>