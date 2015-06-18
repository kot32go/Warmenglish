package org.apache.jsp.WEB_002dINF.views.control;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"../resources/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"../resources/css/control_main.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<title>控制面板</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow:scroll;overflow-y:hidden;overflow-x: hidden\">\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-static-top\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">欢迎，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logined_user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 老师</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\r\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-user\"></span></a></li>\r\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-info-sign\"></span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-off\"></span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("        <ul class=\"nav nav-sidebar\">\r\n");
      out.write("            <li>作业管理</li>\r\n");
      out.write("            <li><a id=\"homework\">发布作业</a></li>\r\n");
      out.write("            <li><a id=\"mark\">批改作业</a></li>\r\n");
      out.write("            <li><a id=\"grade\">查看学生成绩</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"nav nav-sidebar\">\r\n");
      out.write("            <li>班级管理</li>\r\n");
      out.write("            <li><a id=\"addClass\">添加班级</a></li>\r\n");
      out.write("            <li><a id=\"addGroup\">添加分组</a></li>\r\n");
      out.write("            <li><a id=\"setClass\">管理班级信息</a></li>\r\n");
      out.write("\t\t\t  <li><a id=\"setGroup\">管理分组信息</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"nav nav-sidebar\">\r\n");
      out.write("            <li>通知管理</li>\r\n");
      out.write("            <li><a id=\"sendMessage\">发布通知</a></li>\r\n");
      out.write("            <li><a id=\"listMessage\">查看历史通知</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <iframe class=\"myFrame col-md-10\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("<!--Placed at the end of the document so the pages lo…-->\r\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("        $(\"#addClass\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/add_class\");\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#mark\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/mark\");\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#homework\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/homework\");\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#setClass\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/set_class\");\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#sendMessage\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/send_message\");\r\n");
      out.write("        });\r\n");
      out.write("\t\t$(\"#listMessage\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/list_message\");\r\n");
      out.write("        })\r\n");
      out.write("        $(\"#grade\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/grade\");\r\n");
      out.write("        });\r\n");
      out.write("\t\t$(\"#addGroup\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/add_group.html\");\r\n");
      out.write("        });\r\n");
      out.write("\t\t$(\"#setGroup\").click(function(){\r\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/set_group.html\");\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap core JavaScript\r\n");
      out.write("================================================== -->\r\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\t<script src=\"../resources/js/jquery.min.js\"></script>\r\n");
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
