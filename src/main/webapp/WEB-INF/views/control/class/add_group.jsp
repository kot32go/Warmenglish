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
<title>��ӷ���</title>
</head>
<body>
<div class="container">
    <h2>��ӷ���<br/><small>������������д������Ϣ</small></h2>
    <hr/>
    <form class="form-inline">
        <div class="form-group">
            <label for="groupClass">�༶</label>
            <select class="form-control form-groupClass" id="groupClass">
                <option value="volvo">��2��</option>
                <option value="saab">�Զ���1��</option>
                <option value="fiat">�ƿ�1��</option>
            </select>
        </div>
        <div class="form-group">
            <label for="groupName">����</label>
            <input type="text" class="form-control" id="groupName" placeholder="��������">
        </div>
		<div class="form-group">
            <label for="groupTip">��ע</label>
            <input type="text" class="form-control" id="groupTip" placeholder="���뱸ע">
        </div>
    </form>
    <button type="submit" class="btn btn-default">��� </button>
</div>
</body>
</html>