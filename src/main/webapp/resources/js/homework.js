/**
 * Created by Administrator on 2015/6/11 0011.
 */
//������
function main(name,number){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>��Ŀ"+number+"</label><textarea type='text' class='form-control form-choosemain' name='"+name+"Main' placeholder='���������'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}

//���ѡ��(δ����,�������)
function select(name){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>ѡ��</label><textarea type='text' class='form-control form-choosemain' name='"+name+"Select' placeholder='������ѡ��'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}
//���ѡ��(δ�����������)
function selectNumber(name,number){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>ѡ��"+number+"</label><textarea type='text' class='form-control form-choosemain' name='"+name+"Select' placeholder='������ѡ��'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}
//�������
function article(name,number){
    var newformgroup=document.createElement('div');
    newformgroup.setAttribute("class","form-group");
    var str="<label>����"+number+"</label><textarea type='text' class='form-control form-readingmain' name='"+name+"Article' placeholder='����������'></textarea>"
    newformgroup.innerHTML = str;
    return newformgroup;
}
//��ӽ���ѡ�ť
function button(){
    var newbutton=document.createElement('button');
    newbutton.setAttribute("class","btn btn-primary");
    newbutton.setAttribute("style","float: right");
    newbutton.innerHTML="����ѡ��";
    return newbutton;
}
//����������div
function clear(){
    var newclear=document.createElement('div');
    newclear.setAttribute("class","clearfix");
    return newclear;
}
//��ӷָ���
function hr(){
    var newhr=document.createElement('hr');
    return newhr;
}
//���ѡ��(�ѽ�����ѡ��������գ��Ķ�)
function selectChoose(name){
    var newrow1=document.createElement('div');
    newrow1.setAttribute("class","row");
    var str1="<div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' name='option1'></span><input type='text' class='form-control' name='optionA"+name+"'></div></div><div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' name='option1'></span><input type='text' class='form-control' name='optionB"+name+"'></div></div>";
    newrow1.innerHTML=str1;
    var newrow2=document.createElement('div');
    newrow2.setAttribute("class","row");
    var str2="<div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' name='option1'></span><input type='text' class='form-control' name='optionC"+name+"'></div></div><div class='col-md-6'><div class='input-group'><span class='input-group-addon'><input type='radio' name='option1'></span><input type='text' class='form-control' name='optionD"+name+"'></div></div>";
    newrow2.innerHTML=str2;
    var Newrow={newRow1:newrow1,newRow2:newrow2};
    return Newrow;
}