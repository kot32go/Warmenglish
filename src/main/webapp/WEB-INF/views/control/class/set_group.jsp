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
<link href="../resources/css/setGroup.css" rel="stylesheet">
<title>���������Ϣ</title>
</head>
<body>
<div class="modal fade" id="addMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">���С���Ա</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">���</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="deleteMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabe2">ɾ��С���Ա</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">ɾ��</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <h2>���������Ϣ<br/><small>�����������ɾ�����޸�С�����ƺͱ�ע�����߹���С���Ա</small></h2>
    <hr/>
    <div class="row">
        <div class="col-md-5">
            <div class="form-inline">
                <label for="groupClass">�༶</label>
                <select class="form-control" id="groupClass">
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
                <th class="col-md-4">С������</th>
                <th class="col-md-4">��ע</th>
                <th class="col-md-4"></th>
            </tr>
            </thead>
            <tbody>
            <tr class="main">
                <td>��һ��</td>
                <td>��ѧ��</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                    <button class="actions btn btn-default btn-info">�����Ա</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>С���Ա��</p>
                        <table class="table ta">
                            <tr>
                                <td>����</td>
                                <td>������</td>
                                <td>��Ρ</td>
                                <td>���ƽ�</td>
                                <td>����</td>
                                <td>������</td>
                            </tr>
                            <tr>
                                <td>�����</td>
                                <td>����</td>
                            </tr>
                        </table>
                    </div>
                    <div class="member">
                        <a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary">��ӳ�Ա</a>
                        <a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger">ɾ����Ա</a>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>�ڶ���</td>
                <td>��ѧ��</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                    <button class="actions btn btn-default btn-info">�����Ա</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>С���Ա��</p>
                        <table class="table ta">
                            <tr>
                                <td>��һ��</td>
                                <td>�ڶ���</td>
                                <td>������</td>
                                <td>������</td>
                                <td>������</td>
                                <td>������</td>
                            </tr>
                            <tr>
                                <td>�����</td>
                                <td>����</td>
                            </tr>
                        </table>
                    </div>
                    <div class="member">
                        <a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary">��ӳ�Ա</a>
                        <a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger">ɾ����Ա</a>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<scr<body>
<div class="modal fade" id="addMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">���С���Ա</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">���</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="deleteMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabe2">ɾ��С���Ա</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">ɾ��</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">ȡ��</button>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <h2>���������Ϣ<br/><small>�����������ɾ�����޸�С�����ƺͱ�ע�����߹���С���Ա</small></h2>
    <hr/>
    <div class="row">
        <div class="col-md-5">
            <div class="form-inline">
                <label for="groupClass">�༶</label>
                <select class="form-control" id="groupClass">
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
                <th class="col-md-4">С������</th>
                <th class="col-md-4">��ע</th>
                <th class="col-md-4"></th>
            </tr>
            </thead>
            <tbody>
            <tr class="main">
                <td>��һ��</td>
                <td>��ѧ��</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                    <button class="actions btn btn-default btn-info">�����Ա</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>С���Ա��</p>
                        <table class="table ta">
                            <tr>
                                <td>����</td>
                                <td>������</td>
                                <td>��Ρ</td>
                                <td>���ƽ�</td>
                                <td>����</td>
                                <td>������</td>
                            </tr>
                            <tr>
                                <td>�����</td>
                                <td>����</td>
                            </tr>
                        </table>
                    </div>
                    <div class="member">
                        <a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary">��ӳ�Ա</a>
                        <a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger">ɾ����Ա</a>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>�ڶ���</td>
                <td>��ѧ��</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">�༭</button>
                    <button class="actions btn btn-default btn-danger">ɾ��</button>
                    <button class="actions btn btn-default btn-info">�����Ա</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>С���Ա��</p>
                        <table class="table ta">
                            <tr>
                                <td>��һ��</td>
                                <td>�ڶ���</td>
                                <td>������</td>
                                <td>������</td>
                                <td>������</td>
                                <td>������</td>
                            </tr>
                            <tr>
                                <td>�����</td>
                                <td>����</td>
                            </tr>
                        </table>
                    </div>
                    <div class="member">
                        <a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary">��ӳ�Ա</a>
                        <a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger">ɾ����Ա</a>
                    </div>
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
        $('.actions.btn-info').click(function() {
            $(this).parents('.main').next("tr.child").slideToggle();
            event.cancelBubble();
        });
        $('.actions.btn-danger').click(function(){
            if(window.confirm("ȷ��ɾ������༶��")){
                window.location="/"
            }
            else{}
            event.cancelBubble();

        });
        event.cancelBubble();
    });
    $('table').on('mouseleave', 'tr', function(){
        $(this).removeClass('hover');
    });
</script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>