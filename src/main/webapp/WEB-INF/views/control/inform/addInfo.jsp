<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../resources/css/addInfo.css" rel="stylesheet">
<title>����֪ͨ</title>
</head>
<body>
<div class="container">
    <h2>����֪ͨ<br/><small>������������д֪ͨ��ѡ����Ӧ�İ༶</small></h2>
    <hr/>
    <form class="form-inline">
        <div class="form-group">
            <label for="infoClass">�����༶</label>
            <select class="form-control form-infoClass" id="infoClass">
                <option value="volvo">Volvo</option>
                <option value="saab">Saab</option>
                <option value="fiat">Fiat</option>
                <option value="audi">Audi</option>
            </select>
        </div>
        <div class="form-group">
            <label for="infoDes">֪ͨ����</label>
            <textarea type="text" class="form-control form-infoDes" id="infoDes" placeholder="����֪ͨ����">
                </textarea>
        </div>
    </form>
    <button type="submit" class="btn btn-default">����</button>
</div>
</body>
</html>