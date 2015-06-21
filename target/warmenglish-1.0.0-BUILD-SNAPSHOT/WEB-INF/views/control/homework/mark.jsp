<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
    <h2>批改作业<br/><small>你可以在这里给学生上传的作业打分</small></h2>
    <hr/>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th class="col-md-3">班级</th>
                <th class="col-md-3">小组</th>
                <th class="col-md-3">姓名</th>
                <th class="col-md-2"></th>
            </tr>
            </thead>
            <tbody>
            <tr class="main">
                <td>软工二班</td>
                <td>第一组</td>
                <td>关艺竹</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">批改作业</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <div class="homework col-md-8">
                            <img src="img/1.png">
                        </div>
                        <div class="clearfix"></div>
                        <form class="form-inline">
                            <label for="grade1">分数</label>
                            <input type="text" class="form-control" id="grade1">
                        </form>
                        <button class="btn btn-default btn-primary">确定</button>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>软工二班</td>
                <td>第二组</td>
                <td>张云洁</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">批改作业</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <div class="homework col-md-8">
                            <img src="img/1.png">
                        </div>
                        <div class="clearfix"></div>
                        <form class="form-inline">
                            <label for="grade2">分数</label>
                            <input type="text" class="form-control" id="grade2">
                        </form>
                        <button class="btn btn-default btn-primary">确定</button>
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