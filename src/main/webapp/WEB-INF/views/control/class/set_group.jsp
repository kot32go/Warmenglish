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
<!-- 两个模态框 -->
<div class="modal fade" id="addMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加小组成员</h4>
            </div>
            <div class="modal-body">
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" data-dismiss="modal" id="add">添加</button>
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
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" data-dismiss="modal" id="delete">删除</button>
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
            <form method="post" class="form-inline">
                <label for="groupClass">班级</label>
	                <select class="form-control" name="class_uuid" id="groupClass" >
	                    <c:forEach items="${classes}" var="class">
							<option value="${class.uuid}">${class.name}</option>
						</c:forEach>
	                </select>
	                <button type="submit" class="btn btn-default btn-primary">选择</button>
            </form>
        </div>
    </div>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
            	<th class="col-md-1"></th>
            	<th class="col-md-2">班级名称</th>
            	<th class="col-md-1"></th>
                <th class="col-md-2">小组名称</th>
                <th class="col-md-3">备注</th>
                <th class="col-md-3"></th>
            </tr>
            </thead>
            <tbody>
            	<c:forEach items="${groups}" var="group">
						<tr class="main">
							<td id="clazz_id">${group.clazz.id}</td>
							<td>${group.clazz.name}</td>
							<td id="group_id">${group.id}</td>
							<td>${group.name}</td>
							<td>${group.tips}</td>
							<td style="padding: 3px 0 0 0">
								<button class="actions btn btn-default btn-primary">编辑</button>
                    			<button class="actions btn btn-default btn-danger">删除</button>
                    			<button class="actions btn btn-default btn-info" id="listMember">管理成员</button>
							</td>
						</tr>
						<tr class="child">
							<td colspan="6">
								<div class="content">
									<p>小组成员：</p>
		                        	<table class="table${group.id}">
			                            <tr></tr>
		                        	</table>
									<div class="member">
										<a  data-target="#addMember" data-toggle='modal' class="btn btn-sm btn-primary" id="listUnmember">添加成员</a>
										<a  data-target="#deleteMember" data-toggle='modal' class="btn btn-sm btn-danger" id="listIsmember">删除成员</a>
									</div>
								</div>
							</td>
						</tr>
				</c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script src="../resources/js/jquery.min.js"></script>
<script>
	var group;
	var clazz;
	//var chk_value =[];
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
    
    //列出组员
    $('table').on('click', '#listMember', function(e) {
    	group=$(this).parents(".main").children("td").eq(2).text();
    	clazz=$(this).parents(".main").children("td").eq(0).text();
    	if($(this).parents(".main").children("td").eq(3).text()=='默认小组'){
    		$("#listUnmember").attr({"disabled":"disabled"});
    		$("#listIsmember").attr({"disabled":"disabled"});
    	}
    	$(".table"+group+" tr td").remove();
    	listMember();
    	event.cancelBubble();
    });
    
    //管理，列出非组员，添加
    $('table').on('click', '#listUnmember', function(e) {
    	clazz=$(this).parents(".child").prev(".main").children("td").eq(0).text();
    	group=$(this).parents(".child").prev(".main").children("td").eq(2).text();
    	$("#addMember .modal-body label").remove();
    	listUnmember();
    	event.cancelBubble();
    });
    
    //管理，列出组员，删除
    $('table').on('click', '#listIsmember', function(e) {
    	group=$(this).parents(".child").prev(".main").children("td").eq(2).text();
    	clazz=$(this).parents(".child").prev(".main").children("td").eq(0).text();
    	$("#deleteMember .modal-body label").remove();
    	listIsMember();
    	event.cancelBubble();
    });
    
    //添加组员
    $('#add').click(function(){
    	  var chk_value_add=new Array();
    	  $('#addMember input[name="student"]:checked').each(function(){    
    	   chk_value_add.push($(this).val());    
    	  });
    	  if(chk_value_add.length==0){
    		  alert("你还没有选择任何内容！");
    	  }
    	  else{
    		  var value='*';
    		  for(var i=0;i<chk_value_add.length;i++){
    			  value+=chk_value_add[i]+'*'
    		  }
    		  addMember(value);
    	  };  
    })
    
    //删除组员
    $('#delete').click(function(){
    	  var chk_value_delete=new Array();
    	  $('#deleteMember input[name="student"]:checked').each(function(){    
    	   chk_value_delete.push($(this).val());    
    	  });
    	  if(chk_value_delete.length==0){
    		  alert("你还没有选择任何内容！");
    	  }
    	  else{
    		  var value='*';
    		  for(var i=0;i<chk_value_delete.length;i++){
    			  value+=chk_value_delete[i]+'*'
    		  }
    		  deleteMember(value);
    	  };
    })
    
    //把组员列在表格里
    function listMember() {
		$.ajax({
			url : "../set_group/list_members", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"group_id" : group,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			success : function(msg) {
				$.each(msg.students, function(index, item) {
					$(".table"+group+" tr").append("<td class='col-sm-3'>" + item.name+"</td>")
				})

			},
			error : function() {
				alert("error")
			}
		});
	}
    
    //把组员列在模态框里
    function listIsMember() {
    		$.ajax({
    			url : "../set_group/list_members", //请求的url地址
    			dataType : "json", //返回格式为json
    			async : true, //请求是否异步
    			data : {
    				"group_id" : group,
    				"format" : "json"
    			}, //参数值
    			type : "GET", //请求方式
    			success : function(msg) {
    				$.each(msg.students, function(index, item) {
    					$("#deleteMember .modal-body").append("<label class='col-sm-3'><input name='student' type='checkbox' value="+item.id+">"+item.name+"</label>");
    				})
    			},
    			error : function() {
    				alert("error")
    			}
    		});
    	}
    
    //把非组员列在模态框里
    function listUnmember() {
		$.ajax({
			url : "../set_group/list_unmembers", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"clazz_id" : clazz,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			success : function(msg) {
				$.each(msg.students, function(index, item) {
					$("#addMember .modal-body").append("<label class='col-sm-3'><input name='student' type='checkbox' value="+item.id+">"+item.name+"</label>");
				})
			},
			error : function() {
				alert("error")
			}
		});
	}
    
    //删除组员
    function deleteMember(chk) {
		$.ajax({
			url : "../set_group/delete_members", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"json" : chk,
				"clazz_id":clazz,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			success : function(msg) {
				
			},
			error : function() {
				alert("error");
			}
		});
	}
    
	//添加组员
    function addMember(chk) {
		$.ajax({
			url : "../set_group/add_members", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"json" : chk,
				"group_id":group,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			success : function(msg) {
	
			},
			error : function() {
				alert("error");
			}
		});
	}
</script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>