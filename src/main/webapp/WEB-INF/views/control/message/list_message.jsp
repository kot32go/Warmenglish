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
<title>�鿴��ʷ֪ͨ</title>
</head>
<body>
<div class="container">
    <h2>�鿴��ʷ֪ͨ<br/><small>�����������鿴֪ͨ���������ݺ�ʱ��</small></h2>
    <hr/>
    <div class="row">
        <div class="col-md-5">
            <div class="form-inline">
                <label for="pointClass">�༶</label>
                <select class="form-control form-pointClass" id="pointClass">
                    <option value="volvo">2012����2��</option>
                    <option value="saab">�ƿ�1��</option>
                    <option value="fiat">�Զ���1��</option>
                </select>
            </div>
        </div>
    </div>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th class="col-md-3">֪ͨ����</th>
                <th class="col-md-3">����ʱ��</th>
                <th class="col-md-3">�����༶</th>
                <th class="col-md-2"></th>
            </tr>
            </thead>
            <tbody>
            <tr class="main">
                <td>��һ��֪ͨ</td>
                <td>2015-6-12</td>
                <td>��2��</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">�鿴</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>���ǵ�һ��֪ͨ������������~</p>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>�ڶ���֪ͨ</td>
                <td>2015-6-20</td>
                <td>�Զ���1��</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">�鿴</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>Ҫ�����ˣ���������~~~~(>_<)~~~~ </p>
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