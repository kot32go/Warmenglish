<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../resources/css/AdminLTE.css" rel="stylesheet">
<link href="../resources/css/point.css" rel="stylesheet">
<title>查看成绩</title>
</head>
<<body>
<div class="container">
    <h2>查看学生成绩<br/><small>你可以在这里查看学生到目前为止的成绩统计</small></h2>
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
            <div class="col-md-3" style="float: right">
                <div class="input-group">
                    <input type="text" class="form-control">
               <span class="input-group-btn">
                  <button class="btn btn-default btn-primary" type="button">
                      <span class="glyphicon glyphicon-search"></span>
                  </button>
               </span>
                </div>
            </div>
        </div>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th class="col-md-3">学生姓名</th>
                <th class="col-md-3">交作业次数</th>
                <th class="col-md-3">最后提交时间</th>
                <th class="col-md-3"></th>
            </tr>
            </thead>
            <tbody>
            <tr class="main">
                <td>关艺竹</td>
                <td>5</td>
                <td>2015-6-5</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">查看成绩</button>
                </td>
            </tr>
            <tr class="child">
                <td class="col-md-8 taber" colspan="4">
                    <ul id="myTab1" class="nav nav-pills" style="margin: 0 100px">
                        <li class="active"><a href="#homework1" data-toggle="tab">作业情况</a></li>
                        <li><a href="#count1" data-toggle="tab">统计</a></li>
                    </ul>
                    <div id="myTabContent1" class="tab-content">
                        <div class="tab-pane fade in active" id="homework1">
                            <div class="box-body" style="margin:0 150px">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th style="width: 10px">#</th>
                                            <th style="width: 150px">题型</th>
                                            <th>正确率</th>
                                            <th style="width: 100px">分数</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1.</td>
                                            <td>选择题</td>
                                            <td>
                                                <div class="progress xs progress-striped active">
                                                    <div class="progress-bar progress-bar-danger" style="width: 55%"></div>
                                                </div>
                                            </td>
                                            <td><span class="badge bg-red">55%</span></td>
                                        </tr>
                                        <tr>
                                            <td>2.</td>
                                            <td>阅读题</td>
                                            <td>
                                                <div class="progress xs progress-striped active">
                                                    <div class="progress-bar progress-bar-yellow" style="width: 70%"></div>
                                                </div>
                                            </td>
                                            <td><span class="badge bg-yellow">70%</span></td>
                                        </tr>
                                        <tr>
                                            <td>3.</td>
                                            <td>完形填空</td>
                                            <td>
                                                <div class="progress xs progress-striped active">
                                                    <div class="progress-bar progress-bar-primary" style="width: 30%"></div>
                                                </div>
                                            </td>
                                            <td><span class="badge bg-light-blue">30%</span></td>
                                        </tr>
                                        <tr>
                                            <td>4.</td>
                                            <td>作文</td>
                                            <td>
                                                <div class="progress xs progress-striped active">
                                                    <div class="progress-bar progress-bar-success" style="width: 90%"></div>
                                                </div>
                                            </td>
                                            <td><span class="badge bg-green">90%</span></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="count1">

                        </div>
                    </div>
                </td>
            </tr>
            <tr class="main">
                <td>王柯</td>
                <td>6</td>
                <td>2015-6-1</td>
                <td style="padding: 3px 0 0 0">
                    <button class="actions btn btn-default btn-primary">查看成绩</button>
                </td>
            </tr>
            <tr class="child">
                <td class="col-md-8 taber" colspan="4">
                    <ul id="myTab2" class="nav nav-pills" style="margin: 0 100px">
                        <li class="active"><a href="#homework2" data-toggle="tab">作业情况</a></li>
                        <li><a href="#count2" data-toggle="tab">统计</a></li>
                    </ul>
                    <div id="myTabContent2" class="tab-content">
                        <div class="tab-pane fade in active" id="homework2">
                            <div class="box-body" style="margin:0 150px">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th style="width: 10px">#</th>
                                        <th style="width: 150px">题型</th>
                                        <th>正确率</th>
                                        <th style="width: 100px">分数</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1.</td>
                                        <td>选择题</td>
                                        <td>
                                            <div class="progress xs progress-striped active">
                                                <div class="progress-bar progress-bar-danger" style="width: 55%"></div>
                                            </div>
                                        </td>
                                        <td><span class="badge bg-red">55%</span></td>
                                    </tr>
                                    <tr>
                                        <td>2.</td>
                                        <td>阅读题</td>
                                        <td>
                                            <div class="progress xs progress-striped active">
                                                <div class="progress-bar progress-bar-yellow" style="width: 70%"></div>
                                            </div>
                                        </td>
                                        <td><span class="badge bg-yellow">70%</span></td>
                                    </tr>
                                    <tr>
                                        <td>3.</td>
                                        <td>完形填空</td>
                                        <td>
                                            <div class="progress xs progress-striped active">
                                                <div class="progress-bar progress-bar-primary" style="width: 30%"></div>
                                            </div>
                                        </td>
                                        <td><span class="badge bg-light-blue">30%</span></td>
                                    </tr>
                                    <tr>
                                        <td>4.</td>
                                        <td>作文</td>
                                        <td>
                                            <div class="progress xs progress-striped active">
                                                <div class="progress-bar progress-bar-success" style="width: 90%"></div>
                                            </div>
                                        </td>
                                        <td><span class="badge bg-green">90%</span></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="count2">

                        </div>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<script src="../resources/js/jquery.min.js"></script>.js"></script>
<script>
	$("tr.main").on('mouseenter',function(){
        $(this).addClass('hover');
        $('.btn-primary').click(function() {
            $(this).parents('.main').next("tr.child").slideToggle();
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