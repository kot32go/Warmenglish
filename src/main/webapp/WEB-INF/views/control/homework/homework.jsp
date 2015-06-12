<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../resources/css/homework.css" rel="stylesheet">
<title>������ҵ</title>
</head>
<body>
<div class="container">
    <h2>������ҵ<br/><small>����������﷢��ѡ���⣬�Ķ���������պ�������Щ����</small></h2>
    <hr/>
    <!--ѡ��༶��С��-->
    <div class="row">
        <div class="col-md-4">
                <label for="homeworkClass">�༶</label>
                <select class="form-control form-homeworkClass" id="homeworkClass">
                    <option value="volvo">2012����2��</option>
                    <option value="saab">�ƿ�1��</option>
                    <option value="fiat">�Զ���1��</option>
                </select>
        </div>
        <div class="col-md-4">
                <label for="homeworkGroup">С��</label>
                <select class="form-control form-homeworkGroup" id="homeworkGroup">
                    <option value="volvo">��һ��</option>
                    <option value="saab">�ڶ���</option>
                    <option value="fiat">������</option>
                </select>
        </div>
    </div>
    <!--������-->
    <ul id="myTab1" class="nav nav-pills"  style="margin-top: 20px">
        <li class="active"><a href="#choose" data-toggle="tab">ѡ����</a></li>
        <li><a href="#reading" data-toggle="tab">�Ķ���</a></li>
        <li><a href="#cloze" data-toggle="tab">�������</a></li>
        <li><a href="#essay" data-toggle="tab">����</a></li>
    </ul>
    <!--����ҳ��-->
    <div id="myTabContent1" class="tab-content">
        <!--ѡ����-->
        <div class="tab-pane fade in active" id="choose">
            <div class="content">
                <div class="chooseContent">
                    <form class="form-inline" id="choose1" name="choose1">
                        <div class="form-group">
                            <label>��Ŀ1</label>
                            <textarea type="text" class="form-control form-choosemain" name="chooseMain" placeholder="���������">
                            </textarea>
                        </div>
                        <div class="form-group">
                            <label>ѡ��</label>
                            <textarea type="text" class="form-control form-choosemain" name="chooseSelect" placeholder="������ѡ��">
                            </textarea>
                        </div>
                        <button class="btn btn-primary" style="float: right">����ѡ��</button>
                        <div class="clearfix"></div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option1">
                                </span>
                                    <input type="text" class="form-control" name="optionAchoose">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option1">
                                </span>
                                    <input type="text" class="form-control" name="optionBchoose">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option1">
                                </span>
                                    <input type="text" class="form-control" name="optionCchoose">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option1">
                                </span>
                                    <input type="text" class="form-control" name="optionDchoose">
                                </div>
                            </div>
                        </div>
                        <hr/>
                    </form>
                </div>
                <!--�ύ��ť-->
                <div class="clearfix"></div>
                <div class=" row col-lg-6">
                    <button class="btn-lg btn-primary" id="addChoose">�������ѡ����</button>
                    <button class="btn-lg btn-default">������</button>
                </div>
            </div>
        </div>
        <!--�Ķ���-->
        <div class="tab-pane fade" id="reading">
            <div class="content">
                <div class="readingContent">
                    <form class="form-inline" name="reading1" id="reading1">
                        <div class="form-group">
                            <label>����1</label>
                            <textarea type="text" class="form-control form-readingmain" name="readingMain" placeholder="����������">
                            </textarea>
                        </div>
                        <hr/>
                        <div class="form-group">
                            <label>��Ŀ1</label>
                            <textarea type="text" class="form-control form-choosemain" name="readingChoose" placeholder="���������">
                            </textarea>
                        </div>
                        <div class="form-group">
                            <label>ѡ��</label>
                            <textarea type="text" class="form-control form-choosemain" name="readingSelect" placeholder="������ѡ��">
                            </textarea>
                        </div>
                        <button class="btn btn-primary" style="float: right">����ѡ��</button>
                        <div class="clearfix"></div>
                        <!--ѡ��-->
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option2">
                                </span>
                                    <input type="text" class="form-control" name="optionAreading">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option2">
                                </span>
                                    <input type="text" class="form-control" name="optionBreading">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option2">
                                </span>
                                    <input type="text" class="form-control" name="optionCreading">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-group">
                                <span class="input-group-addon">
                                    <input type="radio" name="option2">
                                </span>
                                    <input type="text" class="form-control" name="optionDreading">
                                </div>
                            </div>
                        </div>
                        <hr/>
                    </form>
                </div>
                <!--������ť-->
                <div class="clearfix"></div>
                <div class=" row col-lg-10">
                    <button class="btn-lg btn-primary" id="addReadingChoose">�������ѡ����</button>
                    <button class="btn-lg btn-success" id="addReading">��������Ķ���</button>
                    <button class="btn-lg btn-default">������</button>
                </div>
            </div>
        </div>
        <!--�������-->
        <div class="tab-pane fade" id="cloze">
            <div class="content">
                <div class="clozeContent">
                    <form class="form-inline" name="cloze1" id="cloze1">
                        <div class="form-group">
                            <label>����1</label>
                            <textarea type="text" class="form-control form-readingmain" name="clozeMain" placeholder="����������">
                            </textarea>
                        </div>
                        <hr/>
                        <div class="form-group">
                            <label>ѡ��1</label>
                            <textarea type="text" class="form-control form-choosemain" name="clozeSelect" placeholder="������ѡ��">
                            </textarea>
                        </div>
                        <button class="btn btn-primary" style="float: right">����ѡ��</button>
                        <div class="clearfix"></div>
                        <!--ѡ��-->
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <input type="radio" name="option3">
                                    </span>
                                    <input type="text" class="form-control" name="optionAcloze">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <input type="radio" name="option3">
                                    </span>
                                    <input type="text" class="form-control" name="optionBcloze">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <input type="radio" name="option3">
                                    </span>
                                    <input type="text" class="form-control" name="optionCcloze">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <input type="radio" name="option3">
                                    </span>
                                    <input type="text" class="form-control" name="optionDcloze">
                                </div>
                            </div>
                        </div>
                        <hr/>
                   </form>
                </div>
                <div class="clearfix"></div>
                <div class=" row col-lg-10">
                    <button class="btn-lg btn-primary" id="addClozeChoose">�������ѡ����</button>
                    <button class="btn-lg btn-success" id="addCloze">��������������</button>
                    <button class="btn-lg btn-default">������</button>
                </div>
            </div>
        </div>
        <div class="tab-pane fade" id="essay">

        </div>
    </div>
</div>
<script src="../resources/js/jquery.min.js"></script>
<script src="../resources/js/homework.js"></script>
<script>
    var choose=1;
    var reading=1;
    var readingChoice=1;
    var cloze=1;
    var clozeSelect=1;
    $("#addChoose").click(function addchoose() {
//        ����µ�form-inline��chooseContent
        choose++;
        var newform=document.createElement('form');
        newform.setAttribute("class","form-inline");
        newform.setAttribute("name","choose"+choose);
        newform.setAttribute("id","choose"+choose);
        var newmain=main('choose',choose);
        var newselect=select('choose');
        var newbutton=button();
        var newclear=clear();
        var newrow=selectChoose('choose');
        var newhr=hr();
        newform.appendChild(newmain);
        newform.appendChild(newselect);
        newform.appendChild(newbutton);
        newform.appendChild(newclear);
        newform.appendChild(newrow.newRow1);
        newform.appendChild(newrow.newRow2);
        newform.appendChild(newhr);
        $(".chooseContent").append(newform);
    });


    $("#addReadingChoose").click(function() {
//        ����µ�form-group��form-inline
        readingChoice++;
        var newmain = main('reading',readingChoice);
        var newselect = select('reading');
        var newbutton = button();
        var newclear = clear();
        var newrow = selectChoose('reading');
        var newhr = hr();
        $("#reading" + reading).append(newmain);
        $("#reading" + reading).append(newselect);
        $("#reading" + reading).append(newbutton);
        $("#reading" + reading).append(newclear);
        $("#reading" + reading).append(newrow.newRow1);
        $("#reading" + reading).append(newrow.newRow2);
        $("#reading" + reading).append(newhr);
    });

    $("#addReading").click(function(){
//        ����µ�form-inline��readingContent
        reading++;
        readingChoice=1;
        var newform=document.createElement('form');
        newform.setAttribute("class","form-inline");
        newform.setAttribute("name","reading"+reading);
        newform.setAttribute("id","reading"+reading);
        var newarticle=article('reading',reading);
        var newmain=main('reading',readingChoice);
        var newselect=select('reading');
        var newbutton=button();
        var newclear=clear();
        var newrow=selectChoose('reading');
        var newhr=hr();
        alert(newform.id,newform.name);
        newform.appendChild(newarticle);
        newform.appendChild(newmain);
        newform.appendChild(newselect);
        newform.appendChild(newbutton);
        newform.appendChild(newclear);
        newform.appendChild(newrow.newRow1);
        newform.appendChild(newrow.newRow2);
        newform.appendChild(newhr);
        $(".readingContent").append(newform);
    })

    $("#addClozeChoose").click(function(){
//        ����µ�form-group��form-inline
        clozeSelect++;
        var newselect = selectNumber('cloze',clozeSelect);
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

    $("#addCloze").click(function(){
//        ����µ�form-inline��clozeContent
        cloze++;
        clozeSelect=1;
        var newform=document.createElement('form');
        newform.setAttribute("class","form-inline");
        newform.setAttribute("name","cloze"+cloze);
        newform.setAttribute("id","cloze"+cloze);
        var newarticle=article('cloze',cloze);
        var newselect=selectNumber('cloze',clozeSelect);
        var newbutton=button();
        var newclear=clear();
        var newrow=selectChoose('cloze');
        var newhr=hr();
        alert(newform.id,newform.name);
        newform.appendChild(newarticle);
        newform.appendChild(newselect);
        newform.appendChild(newbutton);
        newform.appendChild(newclear);
        newform.appendChild(newrow.newRow1);
        newform.appendChild(newrow.newRow2);
        newform.appendChild(newhr);
        $(".clozeContent").append(newform);
    });
</script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>