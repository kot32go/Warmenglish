<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/setClass.css" rel="stylesheet">
<title>����༶��Ϣ</title>
</head>
<body>
<div class="container">
    <h2>����༶��Ϣ<br/><small>�����������ɾ�����޸İ༶���ƺ�����</small></h2>
    <hr/>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="col-md-4">�༶����</th>
                <th class="col-md-5">�༶����</th>
                <th class="col-md-3"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>��2��</td>
                <td>2012��40��</td>
                <td>
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                </td>
            </tr>
            <tr>
                <td>�ƿ�1��</td>
                <td>2013��34��</td>
                <td>
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                </td>
            </tr>
            <tr>
                <td>�Զ���2��</td>
                <td>2013��45��</td>
                <td>
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                </td>
            </tr>
            </tbody>
        </table>
        </div>
</div>
<script src="../resources/js/jquery.min.js"></script>
<script>
    $('table').on('mouseenter', 'tr', function(){
        $(this).addClass('hover');
        $('.btn-danger').click(function(){
            alert("��ȷ��Ҫɾ������༶��");
        })
    }).on('mouseleave', 'tr', function(){
        $(this).removeClass('hover');
    })
</script>
</body>
</html>