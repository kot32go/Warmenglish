package org.apache.jsp.WEB_002dINF.views.control.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mark_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"../resources/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"../resources/css/mark.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>批改作业</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2>批改作业<br/><small>你可以在这里给学生上传的作业打分</small></h2>\r\n");
      out.write("    <hr/>\r\n");
      out.write("    <div class=\"table-responsive\">\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th class=\"col-md-3\">班级</th>\r\n");
      out.write("                <th class=\"col-md-3\">小组</th>\r\n");
      out.write("                <th class=\"col-md-3\">姓名</th>\r\n");
      out.write("                <th class=\"col-md-2\"></th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            <tr class=\"main\">\r\n");
      out.write("                <td>软工二班</td>\r\n");
      out.write("                <td>第一组</td>\r\n");
      out.write("                <td>关艺竹</td>\r\n");
      out.write("                <td style=\"padding: 3px 0 0 0\">\r\n");
      out.write("                    <button class=\"actions btn btn-default btn-primary\">批改作业</button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"child\">\r\n");
      out.write("                <td colspan=\"4\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"homework col-md-8\">\r\n");
      out.write("                            <img src=\"img/1.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                        <form class=\"form-inline\">\r\n");
      out.write("                            <label for=\"grade1\">分数</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"grade1\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <button class=\"btn btn-default btn-primary\">确定</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"main\">\r\n");
      out.write("                <td>软工二班</td>\r\n");
      out.write("                <td>第二组</td>\r\n");
      out.write("                <td>张云洁</td>\r\n");
      out.write("                <td style=\"padding: 3px 0 0 0\">\r\n");
      out.write("                    <button class=\"actions btn btn-default btn-primary\">批改作业</button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"child\">\r\n");
      out.write("                <td colspan=\"4\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <div class=\"homework col-md-8\">\r\n");
      out.write("                            <img src=\"img/1.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                        <form class=\"form-inline\">\r\n");
      out.write("                            <label for=\"grade2\">分数</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"grade2\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <button class=\"btn btn-default btn-primary\">确定</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    $(\"tr.main\").on('mouseenter',function(){\r\n");
      out.write("        $(this).addClass('hover');\r\n");
      out.write("        $('.btn-primary').click(function() {\r\n");
      out.write("            $(this).parents('.main').next(\"tr.child\").slideToggle();\r\n");
      out.write("            event.cancelBubble();\r\n");
      out.write("        });\r\n");
      out.write("        event.cancelBubble();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $('tr.main').on('mouseleave', function(){\r\n");
      out.write("        $(this).removeClass('hover');\r\n");
      out.write("    });\r\n");
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
}
