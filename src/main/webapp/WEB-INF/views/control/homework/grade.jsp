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
<link href="../resources/css/AdminLTE.css" rel="stylesheet">
<link href="../resources/css/grade.css" rel="stylesheet">
<title>查看成绩</title>
</head>
<body>
	<div class="container">
		<h2>
			查看学生成绩<br /> <small>你可以在这里查看学生到目前为止的成绩统计</small>
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
					<button class="btn btn-primary" type="submit" id="confirmGroup"
						style="margin-top: 30px">查看</button>
				</div>
			</form>
		</div>
		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<th class="col-md-9">学生姓名</th>
						<th class="col-md-3"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${grades}" var="grade">

						<tr class="main">
							<td>${grade.student.name}</td>
							<td style="padding: 3px 0 0 0">
								<button class="actions btn btn-default btn-primary">查看成绩</button>

							</td>
						</tr>
						<tr class="child">
							<td class="col-md-8 taber" colspan="4">
								<div class="box-body">
									<table class="table">
										<thead>
											<tr>
												<th style="width: 10px">#</th>
												<th style="width: 150px">题型</th>
												<th>正确率</th>
												<th style="width: 100px">分数</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1.</td>
												<td>选择题</td>
												<td>
													<div class="progress xs progress-striped active">
														<div class="progress-bar progress-bar-danger"
															style="width: ${grade.selectGrade}%"></div>
													</div>
												</td>
												<td><span class="badge bg-red">${grade.selectGrade}分</span></td>
											</tr>
											<tr>
												<td>2.</td>
												<td>阅读题</td>
												<td>
													<div class="progress xs progress-striped active">
														<div class="progress-bar progress-bar-yellow"
															style="width: 0%"></div>
													</div>
												</td>
												<td><span class="badge bg-yellow">正在开发..</span></td>
											</tr>
											<tr>
												<td>3.</td>
												<td>完形填空</td>
												<td>
													<div class="progress xs progress-striped active">
														<div class="progress-bar progress-bar-yellow"
															style="width: 0%"></div>
													</div>
												</td>
												<td><span class="badge bg-light-blue">正在开发..</span></td>
											</tr>
											<tr>
												<td>4.</td>
												<td>作文</td>
												<td>
													<div class="progress xs progress-striped active">
														<div class="progress-bar progress-bar-success"
															style="width: ${grade.essayGrade}%"></div>
													</div>
												</td>
												<td><span class="badge bg-green">${grade.essayGrade}分</span></td>
											</tr>
											<tr>
												<td></td>
												<td><button
														onclick="sendMail('${grade.student.adult_email}','${grade.homework.date}','${grade.selectGrade}','${grade.essayGrade}')">将成绩发送给家长</button></td>
												<td></td>
												<td></td>

											</tr>

											<tr>
										</tbody>
									</table>

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

		$('table').on('mouseleave', 'tr', function() {
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
		function sendMail(mail, date, selectGrade, essayGrade) {
			who = prompt("Enter recipient's email address: ", mail);
			what = prompt("Enter the subject: ", "您孩子在"+date+"测试的成绩单,选择题成绩："+selectGrade+"分，作文："+essayGrade+"分");
			if (confirm("Are you sure you want to mail " + who
					+ " with the subject of " + what + "?") == true) {
				parent.location.href = 'mailto:' + who + '?subject=' + what
						+ '';
			}
		}
	</script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>