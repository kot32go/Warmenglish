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
<link href="../resources/css/homework.css" rel="stylesheet">
<title>查看成绩</title>
</head>
<div class="container">
	<h2>
		发布作业<br /> <small>你可以在这里发布选择题，阅读，完形填空和作文这些题型</small>
	</h2>
	<hr />
	<!--选择班级和小组-->
	<div class="container1">
		<div class="row">
			<div class="col-md-4">
				<label for="homeworkClass">班级</label> <select
					class="form-control form-homeworkClass" id="homeworkClass">
					<c:forEach items="${classes}" var="class">
						<option id="sss" value=${class.id }>${class.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="col-md-4">
				<label for="homeworkGroup">小组</label> <select
					class="form-control form-homeworkGroup" id="homeworkGroup">
				</select>
			</div>
			<div class="col-md-2">
				<label for="homeworkGroup"> 确认</label>
				<button class="btn btn-primary" id="confirmGroup">确认发布对象</button>
			</div>
		</div>
		<!--导航栏-->
		<ul id="myTab1" class="nav nav-pills" style="margin-top: 20px">
			<li class="active"><a href="#choose" data-toggle="tab">选择题</a></li>
			<li><a href="#reading" data-toggle="tab">阅读题</a></li>
			<li><a href="#cloze" data-toggle="tab">完形填空</a></li>
			<li><a href="#essay" data-toggle="tab">作文</a></li>
		</ul>
		<!--导航页面-->
		<div id="myTabContent1" class="tab-content">
			<!--选择题-->
			<div class="tab-pane fade in active" id="choose">
				<div class="content">
					<div class="chooseContent">
						<form class="form-inline" id="choose" name="choose1">
							<div class="form-group">
								<label>题目1</label>
								<textarea type="text" class="form-control form-choosemain"
									id="chooseMain1">
                            </textarea>
							</div>
							<div class="form-group" id="xuanxiang">
								<label>选项</label>
								<textarea type="text" class="form-control form-choosemain"
									id="chooseSelect">
                            </textarea>
							</div>
							<input class="btn btn-primary" id="analyzeChoose"
								style="float: right" readonly="true" value="解析选项" />
							<div class="clearfix"></div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											id="option1">
										</span> <input type="text" class="form-control" id="optionAchoose1">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											id="option1">
										</span> <input type="text" class="form-control" id="optionBchoose1">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											id="option1">
										</span> <input type="text" class="form-control" id="optionCchoose1">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											id="option1" />
										</span> <input type="text" class="form-control" id="optionDchoose1">
									</div>
								</div>
							</div>
							<hr />
						</form>
					</div>
					<!--提交按钮-->
					<div class="clearfix"></div>
					<div class=" row col-lg-6">
						<button class="btn-lg btn-primary" id="addChoose">继续添加选择题</button>
						<button class="btn-lg btn-default">添加完毕</button>
					</div>
				</div>
			</div>
			<!--阅读题-->
			<div class="tab-pane fade" id="reading">
				<div class="content">
					<div class="readingContent">
						<form class="form-inline" name="reading1" id="reading1">
							<div class="form-group">
								<label>文章1</label>
								<textarea type="text" class="form-control form-readingmain"
									name="readingMain" placeholder="请输入文章">
	                            </textarea>
							</div>
							<hr />
							<!--题目1-->
							<div class="form-group">
								<label>题目1</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingChoose" placeholder="请输入题干">
	                            </textarea>
							</div>
							<div class="form-group">
								<label>选项</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingSelect" placeholder="请输入选项">
	                            </textarea>
							</div>
							<button class="btn btn-primary" style="float: right">解析选项</button>
							<div class="clearfix"></div>
							<!--选项-->
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionAreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionBreading">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionCreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionDreading">
									</div>
								</div>
							</div>
							<hr />
							<!-- 题目2 -->
							<div class="form-group">
								<label>题目2</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingChoose" placeholder="请输入题干">
	                            </textarea>
							</div>
							<div class="form-group">
								<label>选项</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingSelect" placeholder="请输入选项">
	                            </textarea>
							</div>
							<button class="btn btn-primary" style="float: right">解析选项</button>
							<div class="clearfix"></div>
							<!--选项-->
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionAreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionBreading">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionCreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionDreading">
									</div>
								</div>
							</div>
							<hr />
							<!-- 题目3 -->
							<div class="form-group">
								<label>题目3</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingChoose" placeholder="请输入题干">
	                            </textarea>
							</div>
							<div class="form-group">
								<label>选项</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingSelect" placeholder="请输入选项">
	                            </textarea>
							</div>
							<button class="btn btn-primary" style="float: right">解析选项</button>
							<div class="clearfix"></div>
							<!--选项-->
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionAreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionBreading">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionCreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionDreading">
									</div>
								</div>
							</div>
							<hr />
							<!-- 题目4 -->
							<div class="form-group">
								<label>题目4</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingChoose" placeholder="请输入题干">
	                            </textarea>
							</div>
							<div class="form-group">
								<label>选项</label>
								<textarea type="text" class="form-control form-choosemain"
									name="readingSelect" placeholder="请输入选项">
	                            </textarea>
							</div>
							<button class="btn btn-primary" style="float: right">解析选项</button>
							<div class="clearfix"></div>
							<!--选项-->
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionAreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionBreading">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionCreading">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option2">
										</span> <input type="text" class="form-control" name="optionDreading">
									</div>
								</div>
							</div>
							<hr />
						</form>
					</div>
					<!--两个按钮-->
					<div class="clearfix"></div>
					<div class=" row col-lg-10">
						<button class="btn-lg btn-success" id="addReading"
							style="margin-left: 200px">继续添加阅读题</button>
						<button class="btn-lg btn-default">添加完毕</button>
					</div>
				</div>
			</div>
			<!--完形填空-->
			<div class="tab-pane fade" id="cloze">
				<div class="content">
					<div class="clozeContent">
						<form class="form-inline" name="cloze1" id="cloze1">
							<div class="form-group">
								<label>文章1</label>
								<textarea type="text" class="form-control form-readingmain"
									name="clozeMain" placeholder="请输入文章">
                            </textarea>
							</div>
							<hr />
							<div class="form-group">
								<label>选项1</label>
								<textarea type="text" class="form-control form-choosemain"
									name="clozeSelect" placeholder="请输入选项">
                            </textarea>
							</div>
							<button class="btn btn-primary" style="float: right">解析选项</button>
							<div class="clearfix"></div>
							<!--选项-->
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option3">
										</span> <input type="text" class="form-control" name="optionAcloze">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option3">
										</span> <input type="text" class="form-control" name="optionBcloze">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option3">
										</span> <input type="text" class="form-control" name="optionCcloze">
									</div>
								</div>
								<div class="col-md-6">
									<div class="input-group">
										<span class="input-group-addon"> <input type="radio"
											name="option3">
										</span> <input type="text" class="form-control" name="optionDcloze">
									</div>
								</div>
							</div>
							<hr />
						</form>
					</div>
					<div class="clearfix"></div>
					<div class=" row col-lg-10">
						<button class="btn-lg btn-primary" id="addClozeChoose">继续添加选择题</button>
						<button class="btn-lg btn-success" id="addCloze">继续添加完形填空</button>
						<button class="btn-lg btn-default">添加完毕</button>
					</div>
				</div>
			</div>
			<div class="tab-pane fade" id="essay">
				<div class="content">
					<div class="essayContent">
						<form class="form-inline" name="essay1" id="essay1">
							<div class="form-group">
								<label>作文</label>
								<textarea type="text" class="form-control form-readingmain"
									name="essayMain" placeholder="请输入题目">
                                </textarea>
							</div>
							<hr />
						</form>
					</div>
					<div class="row col-lg-10">
						<button class="btn-lg btn-primary" style="margin-left: 300px">添加完毕</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="../resources/js/jquery.min.js"></script>
<script src="../resources/js/homework.js"></script>
<script>
	var choose = 1;
	var reading = 1;
	var readingChoice = 1;
	var cloze = 1;
	var clozeSelect = 1;
	var rightAnswer;
	$("#addChoose").click(function addchoose() {
		//先把现在的选择题上传了
		var tigan = $("#chooseMain" + choose).val();
		var a = $("#optionAchoose" + choose).val();
		var b = $("#optionBchoose" + choose).val();
		var c = $("#optionCchoose" + choose).val();
		var d = $("#optionDchoose" + choose).val();
		addXuanzeTi(tigan, a, b, c, d);
		//添加新的form-inline到chooseContent
		choose++;
		var newform = document.createElement('form');
		newform.setAttribute("class", "form-inline");
		newform.setAttribute("name", "choose" + choose);
		newform.setAttribute("id", "choose" + choose);
		var newmain = main('choose', choose);
		var newselect = select('choose');
		var newbutton = button();
		var newclear = clear();
		var newrow = selectChoose(choose);
		var newhr = hr();
		newform.appendChild(newmain);
		newform.appendChild(newselect);
		newform.appendChild(newbutton);
		newform.appendChild(newclear);
		newform.appendChild(newrow.newRow1);
		newform.appendChild(newrow.newRow2);
		newform.appendChild(newhr);
		$(".chooseContent").append(newform);
		$(document).on('click', '#option' + choose, function(e) {
			rightAnswer = $(this).parent().next("input").val();
		});
	});

	$("#addReading").click(function() {
		//        添加新的form-inline到readingContent
		reading++;
		readingChoice = 1;
		var newform = document.createElement('form');
		newform.setAttribute("class", "form-inline");
		newform.setAttribute("name", "reading" + reading);
		newform.setAttribute("id", "reading" + reading);
		var newarticle = article('reading', reading);
		newform.appendChild(newarticle);
		for (readingChoice = 1; readingChoice <= 4; readingChoice++) {
			var newmain = main('reading', readingChoice);
			var newselect = select('reading');
			var newbutton = button();
			var newclear = clear();
			var newrow = selectChoose('reading');
			var newhr = hr();
			newform.appendChild(newmain);
			newform.appendChild(newselect);
			newform.appendChild(newbutton);
			newform.appendChild(newclear);
			newform.appendChild(newrow.newRow1);
			newform.appendChild(newrow.newRow2);
			newform.appendChild(newhr);
		}
		$(".readingContent").append(newform);
	})

	$("#addClozeChoose").click(function() {
		//        添加新的form-group到form-inline
		clozeSelect++;
		var newselect = selectNumber('cloze', clozeSelect);
		var newbutton = button();
		var newclear = clear();
		var newrow = selectChoose('cloze');
		var newhr = hr();
		$("#cloze" + cloze).append(newselect);
		$("#cloze" + cloze).append(newbutton);
		$("#cloze" + cloze).append(newclear);
		$("#cloze" + cloze).append(newrow.newRow1);
		$("#cloze" + cloze).append(newrow.newRow2);
		$("#cloze" + cloze).append(newhr);
	});

	$("#addCloze").click(function() {
		//添加新的form-inline到clozeContent
		cloze++;
		clozeSelect = 1;
		var newform = document.createElement('form');
		newform.setAttribute("class", "form-inline");
		newform.setAttribute("name", "cloze" + cloze);
		newform.setAttribute("id", "cloze" + cloze);
		var newarticle = article('cloze', cloze);
		var newselect = selectNumber('cloze', clozeSelect);
		var newbutton = button();
		var newclear = clear();
		var newrow = selectChoose('cloze');
		var newhr = hr();
		newform.appendChild(newarticle);
		newform.appendChild(newselect);
		newform.appendChild(newbutton);
		newform.appendChild(newclear);
		newform.appendChild(newrow.newRow1);
		newform.appendChild(newrow.newRow2);
		newform.appendChild(newhr);
		$(".clozeContent").append(newform);
	});
	var class_id;
	var group_id;
	var homework_uuid;
	$(document).ready(function() {
		class_id = $("#homeworkClass").val();
		myAjax();
	});
	$("#homeworkClass").change(function() {
		class_id = $(this).val();
		$("#homeworkGroup option").remove();
		myAjax();
	});
	$("#homeworkGroup").change(function() {
		group_id = $(this).val();
	});
	$("#confirmGroup").click(function() {
		group_id = $("#homeworkGroup").val()
		addZuoye();
	});
	$(document).on('click', '#analyzeChoose', function(e) {
		myAjax_choose($(this).parent().find("#chooseSelect").val());
	});
	$(document).on('click', '#option' + choose, function(e) {
		rightAnswer = $(this).parent().next("input").val();
	});

	function myAjax() {
		$.ajax({
			url : "../homework/list_groups", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"class_id" : class_id,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			success : function(msg) {
				$.each(msg.groups, function(index, item) {
					$("#homeworkGroup").append(
							"<option value='" + item.id+"'>" + item.name
									+ "</option>");
					if (index == 0) {
						group_id = item.id;
					}
				})

			},
			error : function() {
				alert("error")
			}
		});
	}

	function myAjax_choose(answer) {
		$.ajax({
			url : "../homework/formatAnswer", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"answer" : answer,
				"format" : "json"
			}, //参数值
			type : "POST", //请求方式
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(msg) {
				$.each(msg.answers, function(index, item) {
					if (index == 0) {
						$("#optionAchoose" + choose).attr("value", item);
					} else if (index == 1) {
						$("#optionBchoose" + choose).attr("value", item);
					} else if (index == 2) {
						$("#optionCchoose" + choose).attr("value", item);
					} else if (index == 3) {
						$("#optionDchoose" + choose).attr("value", item);
					}

				})
			},
			error : function() {
				alert("error")
			}
		});
	}
	function addZuoye() {
		$.ajax({
			url : "../homework/addZuoye", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"group_id" : group_id,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(msg) {
				homework_uuid = msg.uuid;
			},
			error : function() {
				alert("error")
			}
		});
	}

	function addXuanzeTi(tigan, a, b, c, d) {
		$.ajax({
			url : "../homework/addxuanzeti", //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步
			data : {
				"homework_uuid" : homework_uuid,
				"tigan" : tigan,
				"a" : a,
				"b" : b,
				"c" : c,
				"d" : d,
				"rightAnswer" : rightAnswer,
				"format" : "json"
			}, //参数值
			type : "GET", //请求方式
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(msg) {
			},
			error : function() {
				alert("error")
			}
		});
	}
</script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>