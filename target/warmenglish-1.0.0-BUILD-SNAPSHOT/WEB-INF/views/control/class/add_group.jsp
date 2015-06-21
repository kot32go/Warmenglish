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
<link href="../resources/css/addGroup.css" rel="stylesheet">
<title>添加分组</title>
</head>
<body>
	<div class="container">
		<h2>
			添加分组<br /> <small>你可以在这里编写分组信息</small>
		</h2>
		<hr />
		<form class="form-inline" method="post">
			<div class="form-group">
				<label for="groupClass">班级名称</label> <select name="class_uuid"
					class="form-control form-infoClass" id="groupClass">
					<c:forEach items="${classes}" var="class">
						<option value="${class.uuid}">${class.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="groupName">小组名称</label> <input type="text"
					class="form-control" id="groupName" placeholder="输入组名" name="name" />
			</div>
			<div class="form-group">
				<label for="groupTip" style="margin-right: 56px">备注</label> <input type="text"
					class="form-control" id="groupTip" placeholder="输入备注" name="tips" />
			</div>
			<button type="submit" class="btn btn-default">添加</button>
		</form>

	</div>
</body>
</html>