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
<title>管理分组信息</title>
</head>
<body>
<div class="modal fade" id="addMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加小组成员</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">添加</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="deleteMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabe2">删除小组成员</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">删除</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <h2>管理分组信息<br/><small>你可以在这里删除或修改小组名称和备注，或者管理小组成员</small></h2>
    <hr/>
    <div class="row">
        <div class="col-md-5">
            <div class="form-inline">
                <label for="groupClass">班级</label>
                <select class="form-control" id="groupClass">
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
                <th class="col-md-4">小组名称</th>
                <th class="col-md-4">备注</th>
                <th class="col-md-4"></th>
            </tr>
            </thead>
            <tbody>
            <tr class="main">
                <td>第一组</td>
                <td>好学生</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">编辑</button>
                    <button class="actions btn btn-default btn-danger">删除</button>
                    <button class="actions btn btn-default btn-info">管理成员</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>小组成员：</p>
                        <table class="table ta">
                            <tr>
                                <td>王柯</td>
                                <td>关艺竹</td>
                                <td>刘巍</td>
                                <td>张云洁</td>
                                <td>范宁</td>
                                <td>第六名</td>
                            </tr>
                            <tr>
                                <td>许佳清</td>
                                <td>范宁</td>
                            </tr>
                        </table>
							<div class="member">
								<a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary">添加成员</a>
								<a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger">删除成员</a>
							</div>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>第二组</td>
                <td>差学生</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">编辑</button>
                    <button class="actions btn btn-default btn-danger">删除</button>
                    <button class="actions btn btn-default btn-info">管理成员</button>
                </td>
            </tr>
            <tr class="child">
                <td colspan="4">
                    <div class="content">
                        <p>小组成员：</p>
                        <table class="table ta">
                            <tr>
                                <td>第一名</td>
                                <td>第二名</td>
                                <td>第三名</td>
                                <td>第四名</td>
                                <td>第五名</td>
                                <td>第六名</td>
                            </tr>
                            <tr>
                                <td>许佳清</td>
                                <td>范宁</td>
                            </tr>
                        </table>
							<div class="member">
								<a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary">添加成员</a>
								<a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger">删除成员</a>
							</div>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<div class="modal fade" id="addMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加小组成员</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">添加</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="deleteMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabe2">删除小组成员</h4>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">删除</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </div>
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
            if(window.confirm("确认删除这个分组吗？")){
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