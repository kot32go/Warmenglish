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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"../resources/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"../resources/css/homework.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>查看成绩</title>\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<h2>\r\n");
      out.write("\t\t发布作业<br /> <small>你可以在这里发布选择题，阅读，完形填空和作文这些题型</small>\r\n");
      out.write("\t</h2>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<div class=\"container1\">\r\n");
      out.write("\t\t<!--选择班级和小组-->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<label for=\"homeworkClass\">班级</label> <select\r\n");
      out.write("\t\t\t\t\tclass=\"form-control form-homeworkClass\" id=\"homeworkClass\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<label for=\"homeworkGroup\">小组</label> <select\r\n");
      out.write("\t\t\t\t\tclass=\"form-control form-homeworkGroup\" id=\"homeworkGroup\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--导航栏-->\r\n");
      out.write("\t\t<ul id=\"myTab1\" class=\"nav nav-pills\" style=\"margin-top: 20px\">\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#choose\" data-toggle=\"tab\">选择题</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#reading\" data-toggle=\"tab\">阅读题</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#cloze\" data-toggle=\"tab\">完形填空</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#essay\" data-toggle=\"tab\">作文</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<!--导航页面-->\r\n");
      out.write("\t\t<div id=\"myTabContent1\" class=\"tab-content\">\r\n");
      out.write("\t\t\t<!--选择题-->\r\n");
      out.write("\t\t\t<div class=\"tab-pane fade in active\" id=\"choose\">\r\n");
      out.write("\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"chooseContent\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" id=\"choose1\" name=\"choose1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>题目1</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"chooseMain\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\" id=\"xuanxiang\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>选项</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"chooseSelect\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"btn btn-primary\" id=\"analyzeChoose\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"float: right\" readonly=\"true\" value=\"解析选项\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionAchoose\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionBchoose\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionCchoose\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionDchoose\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--提交按钮-->\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\" row col-lg-8\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addChoose\">继续添加选择题</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\">添加完毕</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--阅读题-->\r\n");
      out.write("\t\t\t<div class=\"tab-pane fade\" id=\"reading\">\r\n");
      out.write("\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"readingContent\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" name=\"reading1\" id=\"reading1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>文章1</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"readingMain\" placeholder=\"请输入文章\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>题目1</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"readingChoose\" placeholder=\"请输入题干\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>选项</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"readingSelect\" placeholder=\"请输入选项\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-primary\" style=\"float: right\">解析选项</button>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--选项-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionAreading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionBreading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionCreading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionDreading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--三个按钮-->\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\" row col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addReadingChoose\">继续添加选择题</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addReading\">继续添加阅读题</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\">添加完毕</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--完形填空-->\r\n");
      out.write("\t\t\t<div class=\"tab-pane fade\" id=\"cloze\">\r\n");
      out.write("\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"clozeContent\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" name=\"cloze1\" id=\"cloze1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>文章1</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"clozeMain\" placeholder=\"请输入文章\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>选项1</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"clozeSelect\" placeholder=\"请输入选项\">\r\n");
      out.write("\t                            </textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-primary\" style=\"float: right\">解析选项</button>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--选项-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionAcloze\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionBcloze\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionCcloze\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"option3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionDcloze\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\" row col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addClozeChoose\">继续添加选择题</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addCloze\">继续添加完形填空</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn-lg btn-default\">添加完毕</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tab-pane fade\" id=\"essay\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"../resources/js/homework.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar choose = 1;\r\n");
      out.write("\tvar reading = 1;\r\n");
      out.write("\tvar readingChoice = 1;\r\n");
      out.write("\tvar cloze = 1;\r\n");
      out.write("\tvar clozeSelect = 1;\r\n");
      out.write("\t$(\"#addChoose\").click(function addchoose() {\r\n");
      out.write("\t\t//        添加新的form-inline到chooseContent\r\n");
      out.write("\t\tchoose++;\r\n");
      out.write("\t\tvar newform = document.createElement('form');\r\n");
      out.write("\t\tnewform.setAttribute(\"class\", \"form-inline\");\r\n");
      out.write("\t\tnewform.setAttribute(\"name\", \"choose\" + choose);\r\n");
      out.write("\t\tnewform.setAttribute(\"id\", \"choose\" + choose);\r\n");
      out.write("\t\tvar newmain = main('choose', choose);\r\n");
      out.write("\t\tvar newselect = select('choose');\r\n");
      out.write("\t\tvar newbutton = button();\r\n");
      out.write("\t\tvar newclear = clear();\r\n");
      out.write("\t\tvar newrow = selectChoose('choose');\r\n");
      out.write("\t\tvar newhr = hr();\r\n");
      out.write("\t\tnewform.appendChild(newmain);\r\n");
      out.write("\t\tnewform.appendChild(newselect);\r\n");
      out.write("\t\tnewform.appendChild(newbutton);\r\n");
      out.write("\t\tnewform.appendChild(newclear);\r\n");
      out.write("\t\tnewform.appendChild(newrow.newRow1);\r\n");
      out.write("\t\tnewform.appendChild(newrow.newRow2);\r\n");
      out.write("\t\tnewform.appendChild(newhr);\r\n");
      out.write("\t\t$(\".chooseContent\").append(newform);\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#addReadingChoose\").click(function() {\r\n");
      out.write("\t\t//        添加新的form-group到form-inline\r\n");
      out.write("\t\treadingChoice++;\r\n");
      out.write("\t\tvar newmain = main('reading', readingChoice);\r\n");
      out.write("\t\tvar newselect = select('reading');\r\n");
      out.write("\t\tvar newbutton = button();\r\n");
      out.write("\t\tvar newclear = clear();\r\n");
      out.write("\t\tvar newrow = selectChoose('reading');\r\n");
      out.write("\t\tvar newhr = hr();\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newmain);\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newselect);\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newbutton);\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newclear);\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newrow.newRow1);\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newrow.newRow2);\r\n");
      out.write("\t\t$(\"#reading\" + reading).append(newhr);\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#addReading\").click(function() {\r\n");
      out.write("\t\t//        添加新的form-inline到readingContent\r\n");
      out.write("\t\treading++;\r\n");
      out.write("\t\treadingChoice = 1;\r\n");
      out.write("\t\tvar newform = document.createElement('form');\r\n");
      out.write("\t\tnewform.setAttribute(\"class\", \"form-inline\");\r\n");
      out.write("\t\tnewform.setAttribute(\"name\", \"reading\" + reading);\r\n");
      out.write("\t\tnewform.setAttribute(\"id\", \"reading\" + reading);\r\n");
      out.write("\t\tvar newarticle = article('reading', reading);\r\n");
      out.write("\t\tvar newmain = main('reading', readingChoice);\r\n");
      out.write("\t\tvar newselect = select('reading');\r\n");
      out.write("\t\tvar newbutton = button();\r\n");
      out.write("\t\tvar newclear = clear();\r\n");
      out.write("\t\tvar newrow = selectChoose('reading');\r\n");
      out.write("\t\tvar newhr = hr();\r\n");
      out.write("\t\tnewform.appendChild(newarticle);\r\n");
      out.write("\t\tnewform.appendChild(newmain);\r\n");
      out.write("\t\tnewform.appendChild(newselect);\r\n");
      out.write("\t\tnewform.appendChild(newbutton);\r\n");
      out.write("\t\tnewform.appendChild(newclear);\r\n");
      out.write("\t\tnewform.appendChild(newrow.newRow1);\r\n");
      out.write("\t\tnewform.appendChild(newrow.newRow2);\r\n");
      out.write("\t\tnewform.appendChild(newhr);\r\n");
      out.write("\t\t$(\".readingContent\").append(newform);\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\t$(\"#addClozeChoose\").click(function() {\r\n");
      out.write("\t\t//        添加新的form-group到form-inline\r\n");
      out.write("\t\tclozeSelect++;\r\n");
      out.write("\t\tvar newselect = selectNumber('cloze', clozeSelect);\r\n");
      out.write("\t\tvar newbutton = button();\r\n");
      out.write("\t\tvar newclear = clear();\r\n");
      out.write("\t\tvar newrow = selectChoose('cloze');\r\n");
      out.write("\t\tvar newhr = hr();\r\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newselect);\r\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newbutton);\r\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newclear);\r\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newrow.newRow1);\r\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newrow.newRow2);\r\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newhr);\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#addCloze\").click(function() {\r\n");
      out.write("\t\t//        添加新的form-inline到clozeContent\r\n");
      out.write("\t\tcloze++;\r\n");
      out.write("\t\tclozeSelect = 1;\r\n");
      out.write("\t\tvar newform = document.createElement('form');\r\n");
      out.write("\t\tnewform.setAttribute(\"class\", \"form-inline\");\r\n");
      out.write("\t\tnewform.setAttribute(\"name\", \"cloze\" + cloze);\r\n");
      out.write("\t\tnewform.setAttribute(\"id\", \"cloze\" + cloze);\r\n");
      out.write("\t\tvar newarticle = article('cloze', cloze);\r\n");
      out.write("\t\tvar newselect = selectNumber('cloze', clozeSelect);\r\n");
      out.write("\t\tvar newbutton = button();\r\n");
      out.write("\t\tvar newclear = clear();\r\n");
      out.write("\t\tvar newrow = selectChoose('cloze');\r\n");
      out.write("\t\tvar newhr = hr();\r\n");
      out.write("\t\tnewform.appendChild(newarticle);\r\n");
      out.write("\t\tnewform.appendChild(newselect);\r\n");
      out.write("\t\tnewform.appendChild(newbutton);\r\n");
      out.write("\t\tnewform.appendChild(newclear);\r\n");
      out.write("\t\tnewform.appendChild(newrow.newRow1);\r\n");
      out.write("\t\tnewform.appendChild(newrow.newRow2);\r\n");
      out.write("\t\tnewform.appendChild(newhr);\r\n");
      out.write("\t\t$(\".clozeContent\").append(newform);\r\n");
      out.write("\t});\r\n");
      out.write("\tvar class_id;\r\n");
      out.write("\tvar group_id;\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tclass_id = $(\"#homeworkClass\").val();\r\n");
      out.write("\t\tmyAjax();\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#homeworkClass\").change(function() {\r\n");
      out.write("\t\tclass_id = $(this).val();\r\n");
      out.write("\t\t$(\"#homeworkGroup option\").remove();\r\n");
      out.write("\t\tmyAjax();\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#homeworkGroup\").change(function() {\r\n");
      out.write("\t\tgroup_id = $(this).val();\r\n");
      out.write("\t});\r\n");
      out.write("\t/* 进行选项解析 */\r\n");
      out.write("\t$(\"#analyzeChoose\").click(function() {\r\n");
      out.write("\t\tmyAjax_choose($(this).parent().child(\"#xuanxiang\").child(\"#chooseSelect\").val());\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction myAjax() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"../homework/list_groups\", //请求的url地址\r\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("\t\t\tasync : true, //请求是否异步\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"class_id\" : class_id,\r\n");
      out.write("\t\t\t\t\"format\" : \"json\"\r\n");
      out.write("\t\t\t}, //参数值\r\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\r\n");
      out.write("\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\t\t\t$.each(msg.groups, function(index, item) {\r\n");
      out.write("\t\t\t\t\t$(\"#homeworkGroup\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<option value='\" + item.id+\"'>\" + item.name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</option>\");\r\n");
      out.write("\t\t\t\t\tif (index == 0) {\r\n");
      out.write("\t\t\t\t\t\tgroup_id = item.id;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction myAjax_choose(answer) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"../homework/formatAnswer\", //请求的url地址\r\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("\t\t\tasync : true, //请求是否异步\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"answer\" : answer,\r\n");
      out.write("\t\t\t\t\"format\" : \"json\"\r\n");
      out.write("\t\t\t}, //参数值\r\n");
      out.write("\t\t\ttype : \"POST\", //请求方式\r\n");
      out.write("\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\r\n");
      out.write("\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\t\t\t$.each(msg.answers, function(index, item) {\r\n");
      out.write("\t\t\t\t\talert(item)\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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
    // /WEB-INF/views/control/homework/homework.jsp(26,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/homework/homework.jsp(26,5) '${classes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${classes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/homework/homework.jsp(26,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("class");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option id=\"sss\" value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
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
