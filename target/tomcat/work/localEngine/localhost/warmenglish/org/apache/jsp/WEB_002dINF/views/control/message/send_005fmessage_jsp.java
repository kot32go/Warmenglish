package org.apache.jsp.WEB_002dINF.views.control.message;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class send_005fmessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"../resources/bootstrap/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"../resources/css/sendMessage.css\" rel=\"stylesheet\">\n");
      out.write("<title>发送通知</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>发布通知<br/><small>你可以在这里编写通知并选择相应的班级</small></h2>\n");
      out.write("    <hr/>\n");
      out.write("    <form class=\"form-inline\" method=\"post\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"infoClass\">发布班级</label>\n");
      out.write("            <select name=\"class_uuid\" class=\"form-control form-infoClass\" id=\"infoClass\">\n");
      out.write("                <option value=\"volvo\">Volvo</option>\n");
      out.write("                <option value=\"saab\">Saab</option>\n");
      out.write("                <option value=\"fiat\">Fiat</option>\n");
      out.write("                <option value=\"audi\">Audi</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"infoDes\">通知内容</label>\n");
      out.write("            <textarea type=\"text\" name=\"message\" class=\"form-control form-infoDes\" id=\"infoDes\" placeholder=\"输入通知内容\">\n");
      out.write("                </textarea>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">发布</button>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
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
