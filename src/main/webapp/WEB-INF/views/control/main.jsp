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
<link href="../resources/css/control_main.css" rel="stylesheet">

<title>控制面板</title>
</head>
<body style="overflow: scroll; overflow-y: hidden; overflow-x: hidden">
	<nav class="navbar navbar-inverse navbar-static-top">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
			data-toggle="collapse" data-target="#navbar" aria-expanded="false"
			aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="#">欢迎，${logined_user.name} 老师</a>
	</div>
	<div id="navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav">
			<li><a role="button" href="index"><span class="glyphicon glyphicon-home"></span></a></li>
			<li><a role="button" id="personinfo" data-toggle="popover" data-container="body" data-trigger="focus" title="个人信息" data-placement="bottom" data-content="真实姓名：${logined_user.name}用户名：${logined_user.username}">
			<span class="glyphicon glyphicon-user"></span>
			</a></li>
			<li><a role="button"><span
					class="glyphicon glyphicon-info-sign"></span></a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a role="button"><span class="glyphicon glyphicon-off"></span></a></li>
		</ul>
	</div>
	</nav>

	<div class="content" style="overflow: hidden">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li>作业管理</li>
				<li><a id="homework">发布作业</a></li>
				<li><a id="mark">批改作业</a></li>
				<li><a id="grade">查看学生成绩</a></li>
			</ul>
			<ul class="nav nav-sidebar">
				<li>班级管理</li>
				<li><a id="addClass">添加班级</a></li>
				<li><a id="addGroup">添加分组</a></li>
				<li><a id="setClass">管理班级信息</a></li>
				<li><a id="setGroup">管理分组信息</a></li>
			</ul>
			<ul class="nav nav-sidebar">
				<li>通知管理</li>
				<li><a id="sendMessage">发布通知</a></li>
				<li><a id="listMessage">查看历史通知</a></li>
			</ul>
		</div>

		<iframe class="myFrame col-md-10" src=${type}></iframe>
	</div>
	<!--Placed at the end of the document so the pages lo…-->
	<script src="../resources/js/jquery.min.js"></script>
	<script>
		var current;
		$(document).ready(function() {
			$(".nav-sidebar li a").click(function() {
				$("#" + current).parent("li").removeAttr("class");
				$(this).parent("li").addClass("active");
				current = $(this).attr("id");
			})
			$(".glyphicon-user").click(function(){
				$('#personinfo').popover('toggle');
			})
			$("#addClass").click(function() {
				$(".myFrame").attr("src", "../control/add_class");
			});
			$("#mark").click(function() {
				$(".myFrame").attr("src", "../control/mark");
			});
			$("#homework").click(function() {
				$(".myFrame").attr("src", "../control/homework");
			});
			$("#setClass").click(function() {
				$(".myFrame").attr("src", "../control/set_class");
			});
			$("#sendMessage").click(function() {
				$(".myFrame").attr("src", "../control/send_message");
			});
			$("#listMessage").click(function() {
				$(".myFrame").attr("src", "../control/list_message");
			})
			$("#grade").click(function() {
				$(".myFrame").attr("src", "../control/grade");
			});
			$("#addGroup").click(function() {
				$(".myFrame").attr("src", "../control/add_group.html");
			});
			$("#setGroup").click(function() {
				$(".myFrame").attr("src", "../control/set_group.html");
			});
		});
	</script>
	<!-- Bootstrap core JavaScript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../resources/js/jquery.min.js"></script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>