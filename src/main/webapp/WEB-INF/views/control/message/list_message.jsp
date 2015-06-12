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
<link href="../resources/css/listMessage.css" rel="stylesheet">
<title>查看历史通知</title>
</head>
<body>
	<div class="container">
		<h2>
			查看历史通知<br />
			<small>你可以在这里查看通知发布的内容和时间</small>
		</h2>
		<hr />
		<div class="row">
			<div class="col-md-5">
				<div class="form-inline">
					<label for="pointClass">班级</label>
					<select name="class_uuid"
					class="form-control form-infoClass" id="pointClass">
					<c:forEach items="${classes}" var="class">
						<option value="${class.uuid}">${class.name}</option>
					</c:forEach>
				</select>
				</div>
			</div>
		</div>
		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<th class="col-md-3">通知标题</th>
						<th class="col-md-3">发布时间</th>
						<th class="col-md-3">发布班级</th>
						<th class="col-md-2"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${messages}" var="message">
						<tr class="main">
							<td>${message.title}</td>
							<td>${message.date}</td>
							<td>${message.clazz.name}</td>
							<td style="padding: 3px 0 0 0">
								<button class="actions btn btn-default btn-primary">查看</button>
							</td>
						</tr>
						<tr class="child">
							<td colspan="4">
								<div class="content">
									<p>${message.content}</p>
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
			$(this).click(function() {
				$(this).next("tr.child").slideToggle();
				 event.cancelBunble();
			});
		});

		$('table').on('mouseleave', 'tr', function() {
			$(this).removeClass('hover');
		});
	</script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>