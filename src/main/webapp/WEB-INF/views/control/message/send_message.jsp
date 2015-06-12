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
<link href="../resources/css/sendMessage.css" rel="stylesheet">
<title>发送通知</title>
</head>
<body>
	<div class="container">
		<h2>
			发布通知<br /> <small>你可以在这里编写通知并选择相应的班级</small>
		</h2>
		<hr />
		<form class="form-inline" method="post">
			<div class="form-group">
				<label for="infoClass">发布班级</label> 
				<select name="class_uuid"
					class="form-control form-infoClass" id="infoClass">
					<c:forEach items="${classes}" var="class">
						<option value="${class.uuid}">${class.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="infoDes">通知标题</label> <input type="text" name="title"
					class="form-control form-infoDes" id="infoDes" placeholder="输入通知标题" />
			</div>

			<div class="form-group">
				<label for="infoDes">通知内容</label>
				<textarea type="text" name="content"
					class="form-control form-infoDes" id="infoDes" placeholder="输入通知内容">
                </textarea>
			</div>
			<button type="submit" class="btn btn-default">发布</button>
		</form>

	</div>

</body>
</html>