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
<link href="../resources/css/setClass.css" rel="stylesheet">
<title>添加班级</title>
</head>
<body>
	<div class="container">
		<h2>
			管理班级信息<br /> <small>你可以在这里删除或修改班级名称和描述</small>
		</h2>
		<hr />
		<div class="table-responsive">
			<table class="table table-hover table-striped">
				<thead>
					<tr>
						<th class="col-md-4">班级名称</th>
						<th class="col-md-5">班级描述</th>
						<th class="col-md-3"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${classes}" var="class">
						<tr>
							<td>${class.name}</td>
							<td>${class.des}</td>
							<td>
								<button class="actions btn btn-default btn-primary">编辑</button>
								<button class="actions btn btn-default btn-danger">删除</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<script src="../resources/js/jquery.min.js"></script>
	<script>
		$('table').on('mouseenter', 'tr', function() {
			$(this).addClass('hover');
			$('.btn-danger').click(function() {
				alert("你确定要删除这个班级吗？");
			})
		}).on('mouseleave', 'tr', function() {
			$(this).removeClass('hover');
		})
	</script>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../resources/js/jquery.min.js"></script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>