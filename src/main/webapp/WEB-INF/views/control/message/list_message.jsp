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
    <h2>查看历史通知<br/><small>你可以在这里查看通知发布的内容和时间</small></h2>
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
            <tr class="main">
                <td>第一次通知</td>
                <td>2015-6-12</td>
                <td>软工2班</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">查看</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>这是第一个通知，啦啦啦啦啦~</p>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>第二次通知</td>
                <td>2015-6-20</td>
                <td>自动化1班</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">查看</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>要考试了，呜呜呜呜~~~~(>_<)~~~~ </p>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<script src="../resources/js/jquery.min.js"></script>
<script>

    $("tr.main").on('mouseenter',function(){
        $(this).addClass('hover');
        $('.btn-primary').click(function() {
            $(this).parents('.main').next("tr.child").slideToggle();
            event.cancelBubble();
        });
        event.cancelBubble();
    });

    $('tr.main').on('mouseleave', function(){
        $(this).removeClass('hover');
    });
</script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>