package org.apache.jsp.WEB_002dINF.views.control.class_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class set_005fgroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../resources/css/setGroup.css\" rel=\"stylesheet\">\n");
      out.write("<title>管理分组信息</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"modal fade\" id=\"addMember\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">添加小组成员</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ...\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">添加</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal fade\" id=\"deleteMember\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabe2\">删除小组成员</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ...\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">删除</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>管理分组信息<br/><small>你可以在这里删除或修改小组名称和备注，或者管理小组成员</small></h2>\n");
      out.write("    <hr/>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("            <div class=\"form-inline\">\n");
      out.write("                <label for=\"groupClass\">班级</label>\n");
      out.write("                <select class=\"form-control\" id=\"groupClass\">\n");
      out.write("                    <option value=\"volvo\">2012级软工2班</option>\n");
      out.write("                    <option value=\"saab\">计科1班</option>\n");
      out.write("                    <option value=\"fiat\">自动化1班</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"table-responsive\">\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"col-md-4\">小组名称</th>\n");
      out.write("                <th class=\"col-md-4\">备注</th>\n");
      out.write("                <th class=\"col-md-4\"></th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <tr class=\"main\">\n");
      out.write("                <td>第一组</td>\n");
      out.write("                <td>好学生</td>\n");
      out.write("                <td style=\"padding: 3px 0 0 0\">\n");
      out.write("                    <button class=\"actions btn btn-default btn-primary\">编辑</button>\n");
      out.write("                    <button class=\"actions btn btn-default btn-danger\">删除</button>\n");
      out.write("                    <button class=\"actions btn btn-default btn-info\">管理成员</button>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"child\">\n");
      out.write("                <td colspan=\"4\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <p>小组成员：</p>\n");
      out.write("                        <table class=\"table ta\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>王柯</td>\n");
      out.write("                                <td>关艺竹</td>\n");
      out.write("                                <td>刘巍</td>\n");
      out.write("                                <td>张云洁</td>\n");
      out.write("                                <td>范宁</td>\n");
      out.write("                                <td>第六名</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>许佳清</td>\n");
      out.write("                                <td>范宁</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"member\">\n");
      out.write("                        <a  data-target=\"#addMember\" data-toggle='modal' class=\"btn btn-sm btn-primary\">添加成员</a>\n");
      out.write("                        <a  data-target=\"#deleteMember\" data-toggle='modal' class=\"btn btn-sm btn-danger\">删除成员</a>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"main\">\n");
      out.write("                <td>第二组</td>\n");
      out.write("                <td>差学生</td>\n");
      out.write("                <td style=\"padding: 3px 0 0 0\">\n");
      out.write("                    <button class=\"actions btn btn-default btn-primary\">编辑</button>\n");
      out.write("                    <button class=\"actions btn btn-default btn-danger\">删除</button>\n");
      out.write("                    <button class=\"actions btn btn-default btn-info\">管理成员</button>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"child\">\n");
      out.write("                <td colspan=\"4\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <p>小组成员：</p>\n");
      out.write("                        <table class=\"table ta\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>第一名</td>\n");
      out.write("                                <td>第二名</td>\n");
      out.write("                                <td>第三名</td>\n");
      out.write("                                <td>第四名</td>\n");
      out.write("                                <td>第五名</td>\n");
      out.write("                                <td>第六名</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>许佳清</td>\n");
      out.write("                                <td>范宁</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"member\">\n");
      out.write("                        <a  data-target=\"#addMember\" data-toggle='modal' class=\"btn btn-sm btn-primary\">添加成员</a>\n");
      out.write("                        <a  data-target=\"#deleteMember\" data-toggle='modal' class=\"btn btn-sm btn-danger\">删除成员</a>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"addMember\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">添加小组成员</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ...\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">添加</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal fade\" id=\"deleteMember\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabe2\">删除小组成员</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                ...\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">删除</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $('table').on('mouseenter', 'tr', function(){\n");
      out.write("        $(this).addClass('hover');\n");
      out.write("        $('.actions.btn-info').click(function() {\n");
      out.write("            $(this).parents('.main').next(\"tr.child\").slideToggle();\n");
      out.write("            event.cancelBubble();\n");
      out.write("        });\n");
      out.write("        $('.actions.btn-danger').click(function(){\n");
      out.write("            if(window.confirm(\"确认删除这个分组吗？\")){\n");
      out.write("                window.location=\"/\"\n");
      out.write("            }\n");
      out.write("            else{}\n");
      out.write("            event.cancelBubble();\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        event.cancelBubble();\n");
      out.write("    });\n");
      out.write("    $('table').on('mouseleave', 'tr', function(){\n");
      out.write("        $(this).removeClass('hover');\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
