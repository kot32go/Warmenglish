package org.apache.jsp.WEB_002dINF.views.control.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class point_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../resources/css/point.css\" rel=\"stylesheet\">\n");
      out.write("<title>查看成绩</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2>\n");
      out.write("\t\t\t查看学生成绩<br /> <small>你可以在这里查看学生到目前为止的成绩统计</small>\n");
      out.write("\t\t</h2>\n");
      out.write("\t\t<hr />\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-5\">\n");
      out.write("\t\t\t\t<div class=\"form-inline\">\n");
      out.write("\t\t\t\t\t<label for=\"pointClass\">班级</label> <select\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-pointClass\" id=\"pointClass\">\n");
      out.write("\t\t\t\t\t\t<option value=\"volvo\">2012级软工2班</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"saab\">计科1班</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"fiat\">自动化1班</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3\" style=\"float: right\">\n");
      out.write("\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\"> <span\n");
      out.write("\t\t\t\t\t\tclass=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default btn-primary\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"table-responsive\">\n");
      out.write("\t\t\t<table class=\"table table-hover table-striped\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\">学生姓名</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\">交作业次数</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\">最后提交时间</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\"></th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>关艺竹</td>\n");
      out.write("\t\t\t\t\t\t<td>5</td>\n");
      out.write("\t\t\t\t\t\t<td>2015-6-5</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"actions btn btn-default btn-primary\">查看成绩</button>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>王柯</td>\n");
      out.write("\t\t\t\t\t\t<td>6</td>\n");
      out.write("\t\t\t\t\t\t<td>2015-6-1</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"actions btn btn-default btn-primary\">查看成绩</button>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('table').on('mouseenter', 'tr', function() {\n");
      out.write("\t\t\t$(this).addClass('hover')\n");
      out.write("\t\t}).on('mouseleave', 'tr', function() {\n");
      out.write("\t\t\t$(this).removeClass('hover');\n");
      out.write("\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
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
