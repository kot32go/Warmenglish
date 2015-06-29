package org.apache.jsp.WEB_002dINF.views.control;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"../resources/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"../resources/css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>温暖英语-主页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow:scroll;overflow-y:hidden;overflow-x: hidden\">\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-static-top\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">欢迎，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logined_user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 老师</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li><a role=\"button\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\r\n");
      out.write("                <li><a role=\"button\" id=\"personinfo\" data-toggle=\"popover\" data-container=\"body\" data-trigger=\"focus\" title=\"个人信息\" data-placement=\"bottom\" data-content=\"真实姓名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logined_user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("用户名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logined_user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-user\"></span></a></li>\r\n");
      out.write("                <li><a role=\"button\"><span class=\"glyphicon glyphicon-info-sign\"></span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><a role=\"button\"><span class=\"glyphicon glyphicon-off\"></span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"thumb\" style=\"overflow: hidden\">\r\n");
      out.write("\t\t<div class=\"sign\">\r\n");
      out.write("\t\t\t<p>Warm Your Life</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<img src=\"../resources/images/splash-home.png\" alt=\"splash-home.png\"\r\n");
      out.write("\t\t\tstyle=\"left: -1px; top: 0; width: 100%; height: auto; position: absolute;: relative;\"\r\n");
      out.write("\t\t\tdata-image-dimensions=\"1501x961\" data-image-focal-point=\"0.5,0.5\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<div class=\"col-md-4 col-sm-4\" >\r\n");
      out.write("\t\t\t<a href=\"main?type=homework\"><input type=\"image\" src=\"../resources/images/1.png\" width=\"200px\"></a>\r\n");
      out.write("\t\t\t<p>作业管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("\t\t\t<a href=\"main?type=send_message\"><input type=\"image\" src=\"../resources/images/2.png\" width=\"200px\"></a>\r\n");
      out.write("\t\t\t<p>通知管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-4 col-sm-4\">\r\n");
      out.write("\t\t\t<a href=\"main?type=add_class\"><input type=\"image\" src=\"../resources/images/3.png\" width=\"200px\"></a>\r\n");
      out.write("\t\t\t<p>班级管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JavaScript\r\n");
      out.write("================================================== -->\r\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\t<script src=\"../resources/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(\".glyphicon-user\").click(function(){\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$(\".glyphicon-user\").click(function(){\r\n");
      out.write("\t\t\t\t$('#personinfo').popover('toggle');\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
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
}
