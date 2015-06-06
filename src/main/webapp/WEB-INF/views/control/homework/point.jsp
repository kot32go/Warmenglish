<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/point.css" rel="stylesheet">
<title>查看学生成绩</title>
</head>
<body>
<div class="container">
    <h2>查看学生成绩<br/><small>你可以在这里查看学生到目前为止的成绩统计</small></h2>
    <hr/>
        <div class="row">
            <div class="col-md-5">
                <div class="form-inline">
                    <label for="pointClass">班级</label>
                    <select class="form-control form-pointClass" id="pointClass">
                        <option value="volvo">2012级软工2班</option>
                        <option value="saab">计科1班</option>
                        <option value="fiat">自动化1班</option>
                    </select>
                </div>
            </div>
            <div class="col-md-3" style="float: right">
                <div class="input-group">
                    <input type="text" class="form-control">
               <span class="input-group-btn">
                  <button class="btn btn-default btn-primary" type="button">
                      <span class="glyphicon glyphicon-search"></span>
                  </button>
               </span>
                </div>
            </div>
        </div>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="col-md-3">学生姓名</th>
                <th class="col-md-3">交作业次数</th>
                <th class="col-md-3">最后提交时间</th>
                <th class="col-md-3"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>关艺竹</td>
                <td>5</td>
                <td>2015-6-5</td>
                <td>
                    <button class="actions btn btn-default btn-primary">查看成绩</button>
                </td>
            </tr>
            <tr>
                <td>王柯</td>
                <td>6</td>
                <td>2015-6-1</td>
                <td>
                    <button class="actions btn btn-default btn-primary">查看成绩</button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<script src="../resources/js/jquery.min.js"></script>
<script>
    $('table').on('mouseenter', 'tr', function(){
        $(this).addClass('hover')
    }).on('mouseleave', 'tr', function(){
        $(this).removeClass('hover');
    })
</script>
</body>