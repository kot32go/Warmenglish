package org.apache.jsp.WEB_002dINF.views.control.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homework_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"../resources/bootstrap/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"../resources/css/homework.css\" rel=\"stylesheet\">\n");
      out.write("<title>查看成绩</title>\n");
      out.write("</head>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<h2>\n");
      out.write("\t\t发布作业<br /> <small>你可以在这里发布选择题，阅读，完形填空和作文这些题型</small>\n");
      out.write("\t</h2>\n");
      out.write("\t<hr />\n");
      out.write("\t<!--选择班级和小组-->\n");
      out.write("\t<div class=\"container1\">\n");
      out.write("\t\t<p style=\"font-size:12px;color:red\">先设置发布作业的班级</p>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<label for=\"homeworkClass\">班级</label> <select\n");
      out.write("\t\t\t\t\tclass=\"form-control form-homeworkClass\" id=\"homeworkClass\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<label for=\"homeworkGroup\">小组</label> <select\n");
      out.write("\t\t\t\t\tclass=\"form-control form-homeworkGroup\" id=\"homeworkGroup\">\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<label for=\"homeworkGroup\" style=\"width:80px\"> 作业描述</label>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"homeworkDes\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<button class=\"btn btn-primary\" id=\"confirmGroup\" style=\"text-align:center; margin-top:20px;float:right\">确认发布对象</button>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t<!--导航栏-->\n");
      out.write("\t\t<ul id=\"myTab1\" class=\"nav nav-pills\" style=\"margin-top: 20px\">\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#choose\" data-toggle=\"tab\">选择题</a></li>\n");
      out.write("\t\t\t<li><a href=\"#reading\" data-toggle=\"tab\">阅读题</a></li>\n");
      out.write("\t\t\t<li><a href=\"#cloze\" data-toggle=\"tab\">完形填空</a></li>\n");
      out.write("\t\t\t<li><a href=\"#essay\" data-toggle=\"tab\">作文</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!--导航页面-->\n");
      out.write("\t\t<div id=\"myTabContent1\" class=\"tab-content\">\n");
      out.write("\t\t\t<!--选择题-->\n");
      out.write("\t\t\t<div class=\"tab-pane fade in active\" id=\"choose\">\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<div class=\"chooseContent\">\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" id=\"choose\" name=\"choose1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>题目1</label>\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"chooseMain1\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"xuanxiang\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>选项</label>\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"chooseSelect\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"btn btn-primary\" id=\"analyzeChoose\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"float: right\" readonly=\"true\" value=\"解析选项\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\" id=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" id=\"optionAchoose1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\" id=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" id=\"optionBchoose1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\" id=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" id=\"optionCchoose1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\" id=\"option1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" id=\"optionDchoose1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--提交按钮-->\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<div class=\" row col-lg-10\"> \n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addChoose\" style=\"margin-left: 200px\">继续添加选择题</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\" id=\"finChoose\">添加完毕</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--阅读题-->\n");
      out.write("\t\t\t<div class=\"tab-pane fade\" id=\"reading\">\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<div class=\"readingContent\">\n");
      out.write("\t\t\t\t\t\t<p style=\"font-size:12px;color:red\">在输入框内输入文章和题目，文章输入完成后在结尾加上[q]，在正确的选项后面加上*</p>\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" name=\"reading1\" id=\"reading1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>题目1</label>\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"readingMain1\" id=\"readingMain1\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--两个按钮-->\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<div class=\" row col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addReading\">继续添加阅读题</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\" id=\"finReading\">添加完毕</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--完形填空-->\n");
      out.write("\t\t\t<div class=\"tab-pane fade\" id=\"cloze\">\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<div class=\"clozeContent\">\n");
      out.write("\t\t\t\t\t<p style=\"font-size:12px;color:red\">在输入框内输入文章和题目，文章输入完成后在结尾加上[q]，在正确的选项后面加上*</p>\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" name=\"cloze1\" id=\"cloze1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>题目1</label>\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"clozeMain1\" id=\"clozeMain1\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<div class=\" row col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addCloze\">继续添加完形填空</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\" id=\"finCloze\">添加完毕</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 作文 -->\n");
      out.write("\t\t\t<div class=\"tab-pane fade\" id=\"essay\">\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<div class=\"essayContent\">\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" name=\"essay1\" id=\"essay1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>作文</label>\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"essayMain1\" id=\"essayMain1\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addEssay\">继续添加作文</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\" id=\"finEssay\">添加完毕</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"../resources/js/homework.js\"></script>\n");
      out.write("<script>\n");
      out.write("\tvar choose = 1;\n");
      out.write("\tvar reading = 1;\n");
      out.write("\tvar clozing = 1;\n");
      out.write("\tvar essaying=1;\n");
      out.write("\tvar rightAnswer;\n");
      out.write("\tvar isfin=false;\n");
      out.write("\t$(\"#addChoose\").click(function addchoose() {\n");
      out.write("\t\t//先把现在的选择题上传了\n");
      out.write("\t\tvar tigan = $(\"#chooseMain\" + choose).val();\n");
      out.write("\t\tvar a = $(\"#optionAchoose\" + choose).val();\n");
      out.write("\t\tvar b = $(\"#optionBchoose\" + choose).val();\n");
      out.write("\t\tvar c = $(\"#optionCchoose\" + choose).val();\n");
      out.write("\t\tvar d = $(\"#optionDchoose\" + choose).val();\n");
      out.write("\t\tisfin=false;\n");
      out.write("\t\tif(tigan==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\taddXuanzeTi(tigan, a, b, c, d);\n");
      out.write("\t\t\t//添加新的form-inline到chooseContent\n");
      out.write("\t\t\tchoose++;\n");
      out.write("\t\t\tvar newform = document.createElement('form');\n");
      out.write("\t\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\t\tnewform.setAttribute(\"name\", \"choose\" + choose);\n");
      out.write("\t\t\tnewform.setAttribute(\"id\", \"choose\" + choose);\n");
      out.write("\t\t\tvar newmain = main('choose', choose);\n");
      out.write("\t\t\tvar newselect = select('choose');\n");
      out.write("\t\t\tvar newbutton = button();\n");
      out.write("\t\t\tvar newclear = clear();\n");
      out.write("\t\t\tvar newrow = selectChoose(choose);\n");
      out.write("\t\t\tvar newhr = hr();\n");
      out.write("\t\t\tnewform.appendChild(newmain);\n");
      out.write("\t\t\tnewform.appendChild(newselect);\n");
      out.write("\t\t\tnewform.appendChild(newbutton);\n");
      out.write("\t\t\tnewform.appendChild(newclear);\n");
      out.write("\t\t\tnewform.appendChild(newrow.newRow1);\n");
      out.write("\t\t\tnewform.appendChild(newrow.newRow2);\n");
      out.write("\t\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t\t$(\".chooseContent\").append(newform);\n");
      out.write("\t\t\t$(document).on('click', '#option' + choose, function(e) {\n");
      out.write("\t\t\t\trightAnswer = $(this).parent().next(\"input\").val();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#finChoose\").click(function(){\n");
      out.write("\t\t//先把现在的选择题上传了\n");
      out.write("\t\tvar tigan = $(\"#chooseMain\" + choose).val();\n");
      out.write("\t\tvar a = $(\"#optionAchoose\" + choose).val();\n");
      out.write("\t\tvar b = $(\"#optionBchoose\" + choose).val();\n");
      out.write("\t\tvar c = $(\"#optionCchoose\" + choose).val();\n");
      out.write("\t\tvar d = $(\"#optionDchoose\" + choose).val();\n");
      out.write("\t\tisfin=true;\n");
      out.write("\t\tif(tigan==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\taddXuanzeTi(tigan, a, b, c, d);\n");
      out.write("\t\t\t$(document).on('click', '#option' + choose, function(e) {\n");
      out.write("\t\t\t\trightAnswer = $(this).parent().next(\"input\").val();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("\t$(\"#addReading\").click(function() {\n");
      out.write("\t\t//现将之前的题目传到服务器以供解析\n");
      out.write("\t\tvar read=$(\"#readingMain\"+reading).val();\n");
      out.write("\t\tisfin=false;\n");
      out.write("\t\tif(read==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\talert(read);\n");
      out.write("\t\t\taddRead(read);\n");
      out.write("\t\t\t//添加新的form-inline到readingContent\n");
      out.write("\t\t\treading++;\n");
      out.write("\t\t\tvar newform = document.createElement('form');\n");
      out.write("\t\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\t\tnewform.setAttribute(\"name\", \"reading\" + reading);\n");
      out.write("\t\t\tnewform.setAttribute(\"id\", \"reading\" + reading);\n");
      out.write("\t\t\tvar newarticle = article('reading', reading);\n");
      out.write("\t\t\tvar newhr=hr();\n");
      out.write("\t\t\tnewform.appendChild(newarticle);\n");
      out.write("\t\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t\t$(\".readingContent\").append(newform);\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\t$(\"#finReading\").click(function(){\n");
      out.write("\t\t//现将之前的题目传到服务器以供解析\n");
      out.write("\t\tvar read=$(\"#readingMain\"+reading).val();\n");
      out.write("\t\tisfin=true;\n");
      out.write("\t\tif(read==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\taddRead(read);\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("\t$(\"#addCloze\").click(function() {\n");
      out.write("\t\t//现将之前的题目传到服务器以供解析\n");
      out.write("\t\tvar cloze=$(\"#clozeMain\"+clozing).val();\n");
      out.write("\t\tisfin=false;\n");
      out.write("\t\tif(cloze==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\talert(cloze);\n");
      out.write("\t\t\taddCloze(cloze);\n");
      out.write("\t\t\t//添加新的form-inline到clozeContent\n");
      out.write("\t\t\tclozing++;\n");
      out.write("\t\t\tvar newform = document.createElement('form');\n");
      out.write("\t\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\t\tnewform.setAttribute(\"name\", \"cloze\" + clozing);\n");
      out.write("\t\t\tnewform.setAttribute(\"id\", \"cloze\" + clozing);\n");
      out.write("\t\t\tvar newarticle = article('cloze', clozing);\n");
      out.write("\t\t\tvar newhr = hr();\n");
      out.write("\t\t\tnewform.appendChild(newarticle);\n");
      out.write("\t\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t\t$(\".clozeContent\").append(newform);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"finCloze\").click(function(){\n");
      out.write("\t\t//现将之前的题目传到服务器以供解析\n");
      out.write("\t\tvar cloze=$(\"#clozeMain\"+clozing).val();\n");
      out.write("\t\tisfin=true;\n");
      out.write("\t\tif(cloze==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\taddCloze(cloze);\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\t$(\"#addEssay\").click(function(){\n");
      out.write("\t\t//添加作文到服务器\n");
      out.write("\t\tvar essay=$(\"#essayMain\"+essaying).val();\n");
      out.write("\t\tisfin=false;\n");
      out.write("\t\tif(essay==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\taddEssay(essay);\n");
      out.write("\t\t\talert(essay);\n");
      out.write("\t\t\t//添加新的form-inline到essayContent\n");
      out.write("\t\t\tessaying++;\n");
      out.write("\t\t\tvar newform = document.createElement('form');\n");
      out.write("\t\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\t\tnewform.setAttribute(\"name\", \"essay\" + essaying);\n");
      out.write("\t\t\tnewform.setAttribute(\"id\", \"essay\" + essaying);\n");
      out.write("\t\t\tvar newarticle = article('essay', essaying);\n");
      out.write("\t\t\tvar newhr=hr();\n");
      out.write("\t\t\tnewform.appendChild(newarticle);\n");
      out.write("\t\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t\t$(\".essayContent\").append(newform);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#finEssay\").click(function(){\n");
      out.write("\t\t//添加作文到服务器\n");
      out.write("\t\tvar essay=$(\"#essayMain\"+essaying).val();\n");
      out.write("\t\tisfin=true;\n");
      out.write("\t\tif(essay==''||undefined){\n");
      out.write("\t\t\talert(\"尚未输入！\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\taddEssay(essay);\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\tvar class_id;\n");
      out.write("\tvar group_id;\n");
      out.write("\tvar homework_uuid;\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\tclass_id = $(\"#homeworkClass\").val();\n");
      out.write("\t\tmyAjax();\n");
      out.write("\t});\n");
      out.write("\t$(\"#homeworkClass\").change(function() {\n");
      out.write("\t\tclass_id = $(this).val();\n");
      out.write("\t\t$(\"#homeworkGroup option\").remove();\n");
      out.write("\t\tmyAjax();\n");
      out.write("\t});\n");
      out.write("\t$(\"#homeworkGroup\").change(function() {\n");
      out.write("\t\tgroup_id = $(this).val();\n");
      out.write("\t});\n");
      out.write("\t$(\"#confirmGroup\").click(function() {\n");
      out.write("\t\tgroup_id = $(\"#homeworkGroup\").val();\n");
      out.write("\t\tvar des=$(\"#homeworkDes\").val();\n");
      out.write("\t\taddZuoye(des);\n");
      out.write("\t\t$(this).attr({\"disabled\":\"disabled\"});\n");
      out.write("\t\t$(\"#homeworkClass\").attr({\"disabled\":\"disabled\"});\n");
      out.write("\t\t$(\"#homeworkGroup\").attr({\"disabled\":\"disabled\"});\n");
      out.write("\t});\n");
      out.write("\t$(document).on('click', '#analyzeChoose', function(e) {\n");
      out.write("\t\tmyAjax_choose($(this).parent().find(\"#chooseSelect\").val());\n");
      out.write("\t});\n");
      out.write("\t$(document).on('click', '#option' + choose, function(e) {\n");
      out.write("\t\trightAnswer = $(this).parent().next(\"input\").val();\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction myAjax() {\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/list_groups\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"class_id\" : class_id,\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\t$.each(msg.groups, function(index, item) {\n");
      out.write("\t\t\t\t\t$(\"#homeworkGroup\").append(\n");
      out.write("\t\t\t\t\t\t\t\"<option value='\" + item.id+\"'>\" + item.name\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</option>\");\n");
      out.write("\t\t\t\t\tif (index == 0) {\n");
      out.write("\t\t\t\t\t\tgroup_id = item.id;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t})\n");
      out.write("\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction myAjax_choose(answer) {\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/formatAnswer\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"answer\" : answer,\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"POST\", //请求方式\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\t$.each(msg.answers, function(index, item) {\n");
      out.write("\t\t\t\t\tif (index == 0) {\n");
      out.write("\t\t\t\t\t\t$(\"#optionAchoose\" + choose).attr(\"value\", item);\n");
      out.write("\t\t\t\t\t} else if (index == 1) {\n");
      out.write("\t\t\t\t\t\t$(\"#optionBchoose\" + choose).attr(\"value\", item);\n");
      out.write("\t\t\t\t\t} else if (index == 2) {\n");
      out.write("\t\t\t\t\t\t$(\"#optionCchoose\" + choose).attr(\"value\", item);\n");
      out.write("\t\t\t\t\t} else if (index == 3) {\n");
      out.write("\t\t\t\t\t\t$(\"#optionDchoose\" + choose).attr(\"value\", item);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\tfunction addZuoye(des) {\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/addZuoye\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"group_id\" : group_id,\n");
      out.write("\t\t\t\t\"des\":encodeURI(des),\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\thomework_uuid = msg.uuid;\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction addXuanzeTi(tigan, a, b, c, d) {\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/addxuanzeti\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"homework_uuid\" : homework_uuid,\n");
      out.write("\t\t\t\t\"tigan\" : encodeURI(tigan),\n");
      out.write("\t\t\t\t\"a\" : encodeURI(a),\n");
      out.write("\t\t\t\t\"b\" : encodeURI(b),\n");
      out.write("\t\t\t\t\"c\" : encodeURI(c),\n");
      out.write("\t\t\t\t\"d\" : encodeURI(d),\n");
      out.write("\t\t\t\t\"rightAnswer\" : encodeURI(rightAnswer),\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\tif(isfin){\n");
      out.write("\t\t\t\t\talert(\"添加完毕\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction addRead(read){\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/addread\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"homework_uuid\" : homework_uuid,\n");
      out.write("\t\t\t\t\"content\" : encodeURI(read),\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\tif(isfin){\n");
      out.write("\t\t\t\t\talert(\"添加完毕\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction addCloze(cloze){\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/addcloze\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"homework_uuid\" : homework_uuid,\n");
      out.write("\t\t\t\t\"content\" : cloze,\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\tif(isfin){\n");
      out.write("\t\t\t\t\talert(\"添加完毕\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction addEssay(essay){\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"../homework/addessay\", //请求的url地址\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\t\"homework_uuid\" : homework_uuid,\n");
      out.write("\t\t\t\t\"content\" : encodeURI(essay),\n");
      out.write("\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t}, //参数值\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\n");
      out.write("\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\tif(isfin){\n");
      out.write("\t\t\t\t\talert(\"添加完毕\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror : function() {\n");
      out.write("\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<script src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/control/homework/homework.jsp(27,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/homework/homework.jsp(27,5) '${classes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${classes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/homework/homework.jsp(27,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("class");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<option id=\"sss\" value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
