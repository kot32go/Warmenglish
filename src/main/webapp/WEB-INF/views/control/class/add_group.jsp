<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
    <h2>添加分组<br/><small>你可以在这里编写分组信息</small></h2>
    <hr/>
    <form class="form-inline">
        <div class="form-group">
            <label for="groupClass">班级</label>
            <select class="form-control form-groupClass" id="groupClass">
                <option value="volvo">软工2班</option>
                <option value="saab">自动化1班</option>
                <option value="fiat">计科1班</option>
            </select>
        </div>
        <div class="form-group">
            <label for="groupName">组名</label>
            <input type="text" class="form-control" id="groupName" placeholder="输入组名">
        </div>
    </form>
    <button type="submit" class="btn btn-default">添加 </button>
</div>
</body>
</html>