<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/addClass.css" rel="stylesheet">
<title>添加班级</title>
</head>
<body>
	<div class="container">
		<h2>
			添加班级 <br /> <small>你可以在这里编写班级信息</small>
		</h2>
		<hr />
		<form class="form-inline" method="post">
			<div class="form-group">
				<label for="className">班级名称</label> <input type="text"
					class="form-control" id="className" name="className"
					placeholder="软工2班">
			</div>
			<div class="form-group">
				<label for="classDes">班级概述</label>
				<textarea type="text" class="form-control" id="classDes"
					name="classDes" placeholder="输入班级概况">
            </textarea>
			</div>
			<br />
			<button type="submit" class="btn btn-default">添加</button>
		</form>

	</div>
</body>
</html>