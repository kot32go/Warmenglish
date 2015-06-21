/**
 * Created by Administrator on 2015/6/11 0011.
 */
//添加题干
function main(name,number){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>题目"+number+"</label><textarea type='text' class='form-control form-choosemain' id='chooseMain"+number+"' placeholder='请输入题干'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}

//添加选项(未解析,不带编号)
function select(name){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>选项</label><textarea type='text' class='form-control form-choosemain' id='chooseSelect' name='"+name+"Select' placeholder='请输入选项'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}
//添加选项(未解析，带编号)
function selectNumber(name,number){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>选项"+number+"</label><textarea type='text' class='form-control form-choosemain' name='"+name+"Select' placeholder='请输入选项'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}
//添加文章
function article(name,number){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>文章"+number+"</label><textarea type='text' class='form-control form-readingmain' name='"+name+"Article' placeholder='请输入文章'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}
//添加解析选项按钮
function button(){
    var newbutton=document.createElement('input');
    newbutton.setAttribute("class","btn btn-primary");
    newbutton.setAttribute("style","float: right");
    newbutton.setAttribute("id","analyzeChoose");
    newbutton.setAttribute("readonly","true");
    newbutton.setAttribute("value","解析选项");
    return newbutton;
}
//添加清除浮动div
function clear(){
    var newclear=document.createElement('div');
    newclear.setAttribute("class","clearfix");
    return newclear;
}
//添加分割线
function hr(){
    var newhr=document.createElement('hr');
    return newhr;
}
//添加选项(已解析，选择，完形填空，阅读)
function selectChoose(name){
    var newrow1=document.createElement('div');
    newrow1.setAttribute("class","row");
    var str1="<div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' id='option"+name+"'></span><input type='text' class='form-control' id='optionAchoose"+name+"'></div></div><div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' id='option"+name+"'></span><input type='text' class='form-control' id='optionBchoose"+name+"'></div></div>";
    newrow1.innerHTML=str1;
    var newrow2=document.createElement('div');
    newrow2.setAttribute("class","row");
    var str2="<div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' id='option"+name+"'></span><input type='text' class='form-control' id='optionCchoose"+name+"'></div></div><div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' id='option"+name+"'></span><input type='text' class='form-control' id='optionDchoose"+name+"'></div></div>";
    newrow2.innerHTML=str2;
    var Newrow={newRow1:newrow1,newRow2:newrow2};
    return Newrow;
}