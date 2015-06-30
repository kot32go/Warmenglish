<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/mark.css" rel="stylesheet">
<title>批改作业</title>
</head>
<body>
	<div class="container">
		<h2>
			批改作业<br /> <small>你可以在这里给学生上传的作业打分</small>
		</h2>
		<hr />
		<div class="row">
			<form method="post">
				<div class="col-md-3">
					<label for="homeworkClass">班级</label> <select
						class="form-control form-homeworkClass" id="homeworkClass">
						<c:forEach items="${classes}" var="class">
							<option id="sss" value=${class.id }>${class.name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-md-3">
					<label for="homeworkGroup">小组</label> <select
						class="form-control form-homeworkGroup" id="homeworkGroup">
					</select>
				</div>
				<div class="col-md-3">
					<label for="homeworkGroup">作业</label> <select
						class="form-control form-homeworkGroup" id="homework"
						name="homework_uuid">
					</select>
				</div>
				<div class="col-md-3">
					<button class="btn btn-primary" type="submit" id="confirmGroup" style="margin-top: 30px">开始批改</button>
				</div>
			</form>
		</div>
		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<th class="col-md-3">作业id</th>
						<th class="col-md-3">小组</th>
						<th class="col-md-3">姓名</th>
						<th class="col-md-2"></th>
					</tr>
				</thead>
				<tbody id="bodys">
					<c:forEach items="${essayanswers}" var="essay">
						<tr class="main">
							<td id="uuid">${essay.essayProblem.homework.uuid}</td>
							<td>${essay.student.group.name}</td>
							<td>${essay.student.name}</td>
							<td style="padding: 3px 0 0 0">
								<button class="actions btn btn-default btn-primary">批改作业</button>
							</td>
						</tr>
						<tr class="child">
							<td colspan="4">
								<div class="content">
									<div class="homework col-md-8">
										<img width="800px" height="500px"
											src="../resources/upload/${essay.essayAnswerFileName}.jpg" />
									</div>
									<div class="clearfix"></div>
									<form class="form-inline">
										<label for="grade1">分数</label> <input type="text" id="fenshuu"
											class="form-control">
									</form>
									<button class="btn btn-default btn-primary" id="confirm"
										onclick='dafen("${essay.essayProblem.homework.uuid}","${essay.student.id}",$(this).parent().find("#fenshuu").val())'>确定</button>
								</div>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
	<script src="../resources/js/jquery.min.js"></script>
	<script>
		$("tr.main").on('mouseenter', function() {
			$(this).addClass('hover');
			$('.btn-primary').click(function() {
				$(this).parents('.main').next("tr.child").slideToggle();
				event.cancelBubble();
			});
			event.cancelBubble();
		});
		$('tr.main').on('mouseleave', function() {
			$(this).removeClass('hover');
		});
		//logic
		var class_id;
		var group_id;
		var homework_uuid;
		$(document).ready(function() {
			class_id = $("#homeworkClass").val();
			myAjax();
		});
		$("#homeworkClass").change(function() {
			class_id = $(this).val();
			$("#homeworkGroup option").remove();
			myAjax();
		});
		$("#homeworkGroup").change(function() {
			group_id = $(this).val();
			$("#homework option").remove();
			getHomeworks();
		});
		function myAjax() {
			$.ajax({
				url : "../homework/list_groups", //请求的url地址
				dataType : "json", //返回格式为json
				async : true, //请求是否异步
				data : {
					"class_id" : class_id,
					"format" : "json"
				}, //参数值
				type : "GET", //请求方式
				success : function(msg) {
					$.each(msg.groups, function(index, item) {
						$("#homeworkGroup").append(
								"<option value='" + item.id+"'>" + item.name
										+ "</option>");
						if (index == 0) {
							group_id = item.id;
							getHomeworks();
						}
					})

				},
				error : function() {
					alert("error")
				}
			});
		}
		function getHomeworks() {
			group_id=$("#homeworkGroup").val();
			$.ajax({
				url : "../homework/list_homeworks", //请求的url地址
				dataType : "json", //返回格式为json
				async : true, //请求是否异步
				data : {
					"group_id" : group_id,
					"format" : "json"
				}, //参数值
				type : "GET", //请求方式
				success : function(msg) {
					$.each(msg.homeworks, function(index, item) {
						$("#homework").append(
								"<option value='" + item.uuid+"'>" + item.des
										+ "</option>");

					})

				},
				error : function() {
					alert("error")
				}
			});
		}

		function dafen(homeworkuuid, studentid,fenshu) {
			$.ajax({
				url : "../homework/essayDafen", //请求的url地址
				dataType : "json", //返回格式为json
				async : true, //请求是否异步
				data : {
					"homeworkuuid" : homeworkuuid,
					"studentid" : studentid,
					"fenshu":fenshu
				}, //参数值
				type : "GET", //请求方式
				success : function(msg) {
					alert("成功!");
				},
				error : function() {
					alert("成功!")
				}
			});
		}
	</script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>