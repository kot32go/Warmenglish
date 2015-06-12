package org.apache.jsp.WEB_002dINF.views.control.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class grade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../resources/css/AdminLTE.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"../resources/css/grade.css\" rel=\"stylesheet\">\n");
      out.write("<title>查看成绩</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>查看学生成绩<br/><small>你可以在这里查看学生到目前为止的成绩统计</small></h2>\n");
      out.write("    <hr/>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <div class=\"form-inline\">\n");
      out.write("                    <label for=\"pointClass\">班级</label>\n");
      out.write("                    <select class=\"form-control form-pointClass\" id=\"pointClass\">\n");
      out.write("                        <option value=\"volvo\">2012级软工2班</option>\n");
      out.write("                        <option value=\"saab\">计科1班</option>\n");
      out.write("                        <option value=\"fiat\">自动化1班</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\" style=\"float: right\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\">\n");
      out.write("               <span class=\"input-group-btn\">\n");
      out.write("                  <button class=\"btn btn-default btn-primary\" type=\"button\">\n");
      out.write("                      <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                  </button>\n");
      out.write("               </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"table-responsive\">\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"col-md-3\">学生姓名</th>\n");
      out.write("                <th class=\"col-md-3\">交作业次数</th>\n");
      out.write("                <th class=\"col-md-3\">最后提交时间</th>\n");
      out.write("                <th class=\"col-md-3\"></th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <tr class=\"main\">\n");
      out.write("                <td>关艺竹</td>\n");
      out.write("                <td>5</td>\n");
      out.write("                <td>2015-6-5</td>\n");
      out.write("                <td style=\"padding: 3px 0 0 0\">\n");
      out.write("                    <button class=\"actions btn btn-default btn-primary\">查看成绩</button>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"child\">\n");
      out.write("                <td class=\"col-md-8 taber\" colspan=\"4\">\n");
      out.write("                    <ul id=\"myTab1\" class=\"nav nav-pills\" style=\"margin: 0 100px\">\n");
      out.write("                        <li class=\"active\"><a href=\"#homework1\" data-toggle=\"tab\">作业情况</a></li>\n");
      out.write("                        <li><a href=\"#count1\" data-toggle=\"tab\">统计</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div id=\"myTabContent1\" class=\"tab-content\">\n");
      out.write("                        <div class=\"tab-pane fade in active\" id=\"homework1\">\n");
      out.write("                            <div class=\"box-body\" style=\"margin:0 150px\">\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th style=\"width: 10px\">#</th>\n");
      out.write("                                            <th style=\"width: 150px\">题型</th>\n");
      out.write("                                            <th>正确率</th>\n");
      out.write("                                            <th style=\"width: 100px\">分数</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>1.</td>\n");
      out.write("                                            <td>选择题</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 55%\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td><span class=\"badge bg-red\">55%</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>2.</td>\n");
      out.write("                                            <td>阅读题</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-yellow\" style=\"width: 70%\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td><span class=\"badge bg-yellow\">70%</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>3.</td>\n");
      out.write("                                            <td>完形填空</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-primary\" style=\"width: 30%\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td><span class=\"badge bg-light-blue\">30%</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>4.</td>\n");
      out.write("                                            <td>作文</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-success\" style=\"width: 90%\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td><span class=\"badge bg-green\">90%</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"count1\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"main\">\n");
      out.write("                <td>王柯</td>\n");
      out.write("                <td>6</td>\n");
      out.write("                <td>2015-6-1</td>\n");
      out.write("                <td style=\"padding: 3px 0 0 0\">\n");
      out.write("                    <button class=\"actions btn btn-default btn-primary\">查看成绩</button>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr class=\"child\">\n");
      out.write("                <td class=\"col-md-8 taber\" colspan=\"4\">\n");
      out.write("                    <ul id=\"myTab2\" class=\"nav nav-pills\" style=\"margin: 0 100px\">\n");
      out.write("                        <li class=\"active\"><a href=\"#homework2\" data-toggle=\"tab\">作业情况</a></li>\n");
      out.write("                        <li><a href=\"#count2\" data-toggle=\"tab\">统计</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div id=\"myTabContent2\" class=\"tab-content\">\n");
      out.write("                        <div class=\"tab-pane fade in active\" id=\"homework2\">\n");
      out.write("                            <div class=\"box-body\" style=\"margin:0 150px\">\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th style=\"width: 10px\">#</th>\n");
      out.write("                                        <th style=\"width: 150px\">题型</th>\n");
      out.write("                                        <th>正确率</th>\n");
      out.write("                                        <th style=\"width: 100px\">分数</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>1.</td>\n");
      out.write("                                        <td>选择题</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-danger\" style=\"width: 55%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-red\">55%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>2.</td>\n");
      out.write("                                        <td>阅读题</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-yellow\" style=\"width: 70%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-yellow\">70%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>3.</td>\n");
      out.write("                                        <td>完形填空</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-primary\" style=\"width: 30%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-light-blue\">30%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>4.</td>\n");
      out.write("                                        <td>作文</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"progress xs progress-striped active\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-success\" style=\"width: 90%\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><span class=\"badge bg-green\">90%</span></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"count2\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$(\"tr.main\").on('mouseenter',function(){\n");
      out.write("        $(this).addClass('hover');\n");
      out.write("        $('.btn-primary').click(function() {\n");
      out.write("            $(this).parents('.main').next(\"tr.child\").slideToggle();\n");
      out.write("            event.cancelBubble();\n");
      out.write("        });\n");
      out.write("        event.cancelBubble();\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('table').on('mouseleave', 'tr', function(){\n");
      out.write("        $(this).removeClass('hover');\n");
      out.write("    });\n");
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
}
