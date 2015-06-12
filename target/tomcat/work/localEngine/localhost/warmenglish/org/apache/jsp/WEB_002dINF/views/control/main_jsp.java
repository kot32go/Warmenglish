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
      out.write("<link href=\"../resources/css/control_main.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<title>控制面板</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">欢迎，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logined_user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 老师</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-user\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-info-sign\"></span></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li><a role=\"button\"><span class=\"glyphicon glyphicon-off\"></span></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("        <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li>作业管理</li>\n");
      out.write("            <li><a id=\"homework\">发布作业</a></li>\n");
      out.write("            <li><a href=\"#\">查看历史记录</a></li>\n");
      out.write("            <li><a href=\"#\">批改作业</a></li>\n");
      out.write("            <li><a id=\"grade\">查看学生成绩</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li>班级管理</li>\n");
      out.write("            <li><a id=\"addClass\">添加班级</a></li>\n");
      out.write("            <li><a id=\"addGroup\">添加分组</a></li>\n");
      out.write("            <li><a id=\"setClass\">管理班级信息</a></li>\n");
      out.write("\t\t\t  <li><a id=\"setGroup\">管理分组信息</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li>通知管理</li>\n");
      out.write("            <li><a id=\"sendMessage\">发布通知</a></li>\n");
      out.write("            <li><a id=\"listMessage\">查看历史通知</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <iframe class=\"myFrame col-md-10\"></iframe>\n");
      out.write("</div>\n");
      out.write("<!--Placed at the end of the document so the pages lo…-->\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("   $(document).ready(function(){\n");
      out.write("        $(\"#addClass\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/add_class\");\n");
      out.write("        });\n");
      out.write("        $(\"#homework\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/homework\");\n");
      out.write("        });\n");
      out.write("        $(\"#setClass\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/set_class\");\n");
      out.write("        });\n");
      out.write("        $(\"#sendMessage\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/send_message\");\n");
      out.write("        });\n");
      out.write("\t\t$(\"#listMessage\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/list_message\");\n");
      out.write("        })\n");
      out.write("        $(\"#grade\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/grade\");\n");
      out.write("        });\n");
      out.write("\t\t$(\"#addGroup\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/add_group.html\");\n");
      out.write("        });\n");
      out.write("\t\t$(\"#setGroup\").click(function(){\n");
      out.write("            $(\".myFrame\").attr(\"src\",\"../control/set_group.html\");\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<!-- Bootstrap core JavaScript\n");
      out.write("================================================== -->\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\t<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\n");
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
}
