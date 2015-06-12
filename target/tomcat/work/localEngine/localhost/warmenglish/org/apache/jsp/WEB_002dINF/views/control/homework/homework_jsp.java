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
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<label for=\"homeworkClass\">班级</label> <select\n");
      out.write("\t\t\t\tclass=\"form-control form-homeworkClass\" id=\"homeworkClass\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<label for=\"homeworkGroup\">小组</label> <select\n");
      out.write("\t\t\t\tclass=\"form-control form-homeworkGroup\" id=\"homeworkGroup\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--导航栏-->\n");
      out.write("\t<ul id=\"myTab1\" class=\"nav nav-pills\" style=\"margin-top: 20px\">\n");
      out.write("\t\t<li class=\"active\"><a href=\"#choose\" data-toggle=\"tab\">选择题</a></li>\n");
      out.write("\t\t<li><a href=\"#reading\" data-toggle=\"tab\">阅读题</a></li>\n");
      out.write("\t\t<li><a href=\"#cloze\" data-toggle=\"tab\">完形填空</a></li>\n");
      out.write("\t\t<li><a href=\"#essay\" data-toggle=\"tab\">作文</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<!--导航页面-->\n");
      out.write("\t<div id=\"myTabContent1\" class=\"tab-content\">\n");
      out.write("\t\t<!--选择题-->\n");
      out.write("\t\t<div class=\"tab-pane fade in active\" id=\"choose\">\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"chooseContent\">\n");
      out.write("\t\t\t\t\t<form class=\"form-inline\" id=\"choose1\" name=\"choose1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>题目1</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"chooseMain\" placeholder=\"请输入题干\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>选项</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"chooseSelect\" placeholder=\"请输入选项\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\" style=\"float: right\">解析选项</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionAchoose\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionBchoose\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionCchoose\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionDchoose\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--提交按钮-->\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\" row col-lg-6\">\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addChoose\">继续添加选择题</button>\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-default\">添加完毕</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--阅读题-->\n");
      out.write("\t\t<div class=\"tab-pane fade\" id=\"reading\">\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"readingContent\">\n");
      out.write("\t\t\t\t\t<form class=\"form-inline\" name=\"reading1\" id=\"reading1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>文章1</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"readingMain\" placeholder=\"请输入文章\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>题目1</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"readingChoose\" placeholder=\"请输入题干\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>选项</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"readingSelect\" placeholder=\"请输入选项\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\" style=\"float: right\">解析选项</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<!--选项-->\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionAreading\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionBreading\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionCreading\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionDreading\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--三个按钮-->\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\" row col-lg-10\">\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addReadingChoose\">继续添加选择题</button>\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addReading\">继续添加阅读题</button>\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-default\">添加完毕</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--完形填空-->\n");
      out.write("\t\t<div class=\"tab-pane fade\" id=\"cloze\">\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"clozeContent\">\n");
      out.write("\t\t\t\t\t<form class=\"form-inline\" name=\"cloze1\" id=\"cloze1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>文章1</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-readingmain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"clozeMain\" placeholder=\"请输入文章\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>选项1</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea type=\"text\" class=\"form-control form-choosemain\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"clozeSelect\" placeholder=\"请输入选项\">\n");
      out.write("                            </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\" style=\"float: right\">解析选项</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<!--选项-->\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionAcloze\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionBcloze\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionCcloze\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"option3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <input type=\"text\" class=\"form-control\" name=\"optionDcloze\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<div class=\" row col-lg-10\">\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-primary\" id=\"addClozeChoose\">继续添加选择题</button>\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-success\" id=\"addCloze\">继续添加完形填空</button>\n");
      out.write("\t\t\t\t\t<button class=\"btn-lg btn-default\">添加完毕</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"tab-pane fade\" id=\"essay\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"../resources/js/homework.js\"></script>\n");
      out.write("<script>\n");
      out.write("\tvar choose = 1;\n");
      out.write("\tvar reading = 1;\n");
      out.write("\tvar readingChoice = 1;\n");
      out.write("\tvar cloze = 1;\n");
      out.write("\tvar clozeSelect = 1;\n");
      out.write("\t$(\"#addChoose\").click(function addchoose() {\n");
      out.write("\t\t//        添加新的form-inline到chooseContent\n");
      out.write("\t\tchoose++;\n");
      out.write("\t\tvar newform = document.createElement('form');\n");
      out.write("\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\tnewform.setAttribute(\"name\", \"choose\" + choose);\n");
      out.write("\t\tnewform.setAttribute(\"id\", \"choose\" + choose);\n");
      out.write("\t\tvar newmain = main('choose', choose);\n");
      out.write("\t\tvar newselect = select('choose');\n");
      out.write("\t\tvar newbutton = button();\n");
      out.write("\t\tvar newclear = clear();\n");
      out.write("\t\tvar newrow = selectChoose('choose');\n");
      out.write("\t\tvar newhr = hr();\n");
      out.write("\t\tnewform.appendChild(newmain);\n");
      out.write("\t\tnewform.appendChild(newselect);\n");
      out.write("\t\tnewform.appendChild(newbutton);\n");
      out.write("\t\tnewform.appendChild(newclear);\n");
      out.write("\t\tnewform.appendChild(newrow.newRow1);\n");
      out.write("\t\tnewform.appendChild(newrow.newRow2);\n");
      out.write("\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t$(\".chooseContent\").append(newform);\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\"#addReadingChoose\").click(function() {\n");
      out.write("\t\t//        添加新的form-group到form-inline\n");
      out.write("\t\treadingChoice++;\n");
      out.write("\t\tvar newmain = main('reading', readingChoice);\n");
      out.write("\t\tvar newselect = select('reading');\n");
      out.write("\t\tvar newbutton = button();\n");
      out.write("\t\tvar newclear = clear();\n");
      out.write("\t\tvar newrow = selectChoose('reading');\n");
      out.write("\t\tvar newhr = hr();\n");
      out.write("\t\t$(\"#reading\" + reading).append(newmain);\n");
      out.write("\t\t$(\"#reading\" + reading).append(newselect);\n");
      out.write("\t\t$(\"#reading\" + reading).append(newbutton);\n");
      out.write("\t\t$(\"#reading\" + reading).append(newclear);\n");
      out.write("\t\t$(\"#reading\" + reading).append(newrow.newRow1);\n");
      out.write("\t\t$(\"#reading\" + reading).append(newrow.newRow2);\n");
      out.write("\t\t$(\"#reading\" + reading).append(newhr);\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\"#addReading\").click(function() {\n");
      out.write("\t\t//        添加新的form-inline到readingContent\n");
      out.write("\t\treading++;\n");
      out.write("\t\treadingChoice = 1;\n");
      out.write("\t\tvar newform = document.createElement('form');\n");
      out.write("\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\tnewform.setAttribute(\"name\", \"reading\" + reading);\n");
      out.write("\t\tnewform.setAttribute(\"id\", \"reading\" + reading);\n");
      out.write("\t\tvar newarticle = article('reading', reading);\n");
      out.write("\t\tvar newmain = main('reading', readingChoice);\n");
      out.write("\t\tvar newselect = select('reading');\n");
      out.write("\t\tvar newbutton = button();\n");
      out.write("\t\tvar newclear = clear();\n");
      out.write("\t\tvar newrow = selectChoose('reading');\n");
      out.write("\t\tvar newhr = hr();\n");
      out.write("\t\tnewform.appendChild(newarticle);\n");
      out.write("\t\tnewform.appendChild(newmain);\n");
      out.write("\t\tnewform.appendChild(newselect);\n");
      out.write("\t\tnewform.appendChild(newbutton);\n");
      out.write("\t\tnewform.appendChild(newclear);\n");
      out.write("\t\tnewform.appendChild(newrow.newRow1);\n");
      out.write("\t\tnewform.appendChild(newrow.newRow2);\n");
      out.write("\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t$(\".readingContent\").append(newform);\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("\t$(\"#addClozeChoose\").click(function() {\n");
      out.write("\t\t//        添加新的form-group到form-inline\n");
      out.write("\t\tclozeSelect++;\n");
      out.write("\t\tvar newselect = selectNumber('cloze', clozeSelect);\n");
      out.write("\t\tvar newbutton = button();\n");
      out.write("\t\tvar newclear = clear();\n");
      out.write("\t\tvar newrow = selectChoose('cloze');\n");
      out.write("\t\tvar newhr = hr();\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newselect);\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newbutton);\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newclear);\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newrow.newRow1);\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newrow.newRow2);\n");
      out.write("\t\t$(\"#cloze\" + cloze).append(newhr);\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\"#addCloze\").click(function() {\n");
      out.write("\t\t//        添加新的form-inline到clozeContent\n");
      out.write("\t\tcloze++;\n");
      out.write("\t\tclozeSelect = 1;\n");
      out.write("\t\tvar newform = document.createElement('form');\n");
      out.write("\t\tnewform.setAttribute(\"class\", \"form-inline\");\n");
      out.write("\t\tnewform.setAttribute(\"name\", \"cloze\" + cloze);\n");
      out.write("\t\tnewform.setAttribute(\"id\", \"cloze\" + cloze);\n");
      out.write("\t\tvar newarticle = article('cloze', cloze);\n");
      out.write("\t\tvar newselect = selectNumber('cloze', clozeSelect);\n");
      out.write("\t\tvar newbutton = button();\n");
      out.write("\t\tvar newclear = clear();\n");
      out.write("\t\tvar newrow = selectChoose('cloze');\n");
      out.write("\t\tvar newhr = hr();\n");
      out.write("\t\tnewform.appendChild(newarticle);\n");
      out.write("\t\tnewform.appendChild(newselect);\n");
      out.write("\t\tnewform.appendChild(newbutton);\n");
      out.write("\t\tnewform.appendChild(newclear);\n");
      out.write("\t\tnewform.appendChild(newrow.newRow1);\n");
      out.write("\t\tnewform.appendChild(newrow.newRow2);\n");
      out.write("\t\tnewform.appendChild(newhr);\n");
      out.write("\t\t$(\".clozeContent\").append(newform);\n");
      out.write("\t});\n");
      out.write("\tvar class_id;\n");
      out.write("\tvar group_id;\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tclass_id=$(\"#homeworkClass\").val();\n");
      out.write("\t\tmyAjax();\n");
      out.write("\t});  \n");
      out.write("\t$(\"#homeworkClass\").change(function() {\n");
      out.write("\t\tclass_id = $(this).val();\n");
      out.write("\t\t$(\"#homeworkGroup option\").remove();\n");
      out.write("\t\tmyAjax();\n");
      out.write("\t});\n");
      out.write("\t$(\"#homeworkGroup\").change(function() {\n");
      out.write("\t\tgroup_id = $(this).val();\n");
      out.write("\t});\n");
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
      out.write("\t\t\t\t\t$(\"#homeworkGroup\").append(\"<option value='\" + item.id+\"'>\"+item.name+\"</option>\");\n");
      out.write("\t\t\t\t\tif(index==0){\n");
      out.write("\t\t\t\t\t\tgroup_id=item.id;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\t\n");
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
    // /WEB-INF/views/control/homework/homework.jsp(25,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/homework/homework.jsp(25,4) '${classes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${classes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/homework/homework.jsp(25,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("class");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<option id=\"sss\" value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t");
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
