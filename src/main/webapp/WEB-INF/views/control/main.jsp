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
<link href="../resources/css/main.css" rel="stylesheet">

<title>控制面板</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">欢迎，${logined_user.name} 老师</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a role="button"><span class="glyphicon glyphicon-home"></span></a></li>
				<li><a role="button"><span class="glyphicon glyphicon-user"></span></a></li>
				<li><a role="button"><span class="glyphicon glyphicon-info-sign"></span></a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a role="button"><span class="glyphicon glyphicon-off"></span></a></li>
			</ul>
		</div>
</nav>

<div class="content">
    <div class="col-sm-3 col-md-2 sidebar">
        <ul class="nav nav-sidebar">
            <li>作业管理</li>
            <li><a href="#">发布作业</a></li>
            <li><a href="#">查看历史记录</a></li>
            <li><a href="#">批改作业</a></li>
        </ul>
        <ul class="nav nav-sidebar">
            <li>班级管理</li>
            <li><a id="addClass">添加班级</a></li>
            <<li><a id="setClass">管理班级信息</a></li>
        </ul>
        <ul class="nav nav-sidebar">
            <li>通知管理</li>
            <li><a id="addInfo">发布公告</a></li>
            <li><a href="">查看历史公告</a></li>
        </ul>
    </div>

    <iframe class="myFrame col-md-10"></iframe>
</div>
<!--Bootstrap core JavaScript-->

<!--Placed at the end of the document so the pages lo…-->

<script src="../resources/js/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $("#addClass").click(function(){
            $(".myFrame").attr("src","addClass.html");
        })
    });
	$(document).ready(function(){
        $("#setClass").click(function(){
            $(".myFrame").attr("src","setClass.html");
        })
    });
    $(document).ready(function(){
        $("#addInfo").click(function(){
            $(".myFrame").attr("src","addInfo.html");
        })
    });
</script>
<script src="../resources/js/bootstrap.min.js"></script>


<!-- Bootstrap core JavaScript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../resources/js/jquery.min.js"></script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>