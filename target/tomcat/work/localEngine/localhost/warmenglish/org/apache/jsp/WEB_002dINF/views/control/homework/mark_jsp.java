package org.apache.jsp.WEB_002dINF.views.control.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mark_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../resources/css/mark.css\" rel=\"stylesheet\">\n");
      out.write("<title>批改作业</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2>\n");
      out.write("\t\t\t批改作业<br /> <small>你可以在这里给学生上传的作业打分</small>\n");
      out.write("\t\t</h2>\n");
      out.write("\t\t<hr />\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<form method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<label for=\"homeworkClass\">班级</label> <select\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-homeworkClass\" id=\"homeworkClass\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<label for=\"homeworkGroup\">小组</label> <select\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-homeworkGroup\" id=\"homeworkGroup\">\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<label for=\"homeworkGroup\">作业</label> <select\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-homeworkGroup\" id=\"homework\"\n");
      out.write("\t\t\t\t\t\tname=\"homework_uuid\">\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" type=\"submit\" id=\"confirmGroup\" style=\"margin-top: 30px\">开始批改</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"table-responsive\">\n");
      out.write("\t\t\t<table class=\"table table-striped\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\">作业id</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\">小组</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-3\">姓名</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"col-md-2\"></th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody id=\"bodys\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"../resources/js/jquery.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(\"tr.main\").on('mouseenter', function() {\n");
      out.write("\t\t\t$(this).addClass('hover');\n");
      out.write("\t\t\t$('.btn-primary').click(function() {\n");
      out.write("\t\t\t\t$(this).parents('.main').next(\"tr.child\").slideToggle();\n");
      out.write("\t\t\t\tevent.cancelBubble();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tevent.cancelBubble();\n");
      out.write("\t\t});\n");
      out.write("\t\t$('tr.main').on('mouseleave', function() {\n");
      out.write("\t\t\t$(this).removeClass('hover');\n");
      out.write("\t\t});\n");
      out.write("\t\t//logic\n");
      out.write("\t\tvar class_id;\n");
      out.write("\t\tvar group_id;\n");
      out.write("\t\tvar homework_uuid;\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tclass_id = $(\"#homeworkClass\").val();\n");
      out.write("\t\t\tmyAjax();\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#homeworkClass\").change(function() {\n");
      out.write("\t\t\tclass_id = $(this).val();\n");
      out.write("\t\t\t$(\"#homeworkGroup option\").remove();\n");
      out.write("\t\t\tmyAjax();\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#homeworkGroup\").change(function() {\n");
      out.write("\t\t\tgroup_id = $(this).val();\n");
      out.write("\t\t\t$(\"#homework option\").remove();\n");
      out.write("\t\t\tgetHomeworks();\n");
      out.write("\t\t});\n");
      out.write("\t\tfunction myAjax() {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"../homework/list_groups\", //请求的url地址\n");
      out.write("\t\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"class_id\" : class_id,\n");
      out.write("\t\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t\t}, //参数值\n");
      out.write("\t\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\t\t$.each(msg.groups, function(index, item) {\n");
      out.write("\t\t\t\t\t\t$(\"#homeworkGroup\").append(\n");
      out.write("\t\t\t\t\t\t\t\t\"<option value='\" + item.id+\"'>\" + item.name\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"</option>\");\n");
      out.write("\t\t\t\t\t\tif (index == 0) {\n");
      out.write("\t\t\t\t\t\t\tgroup_id = item.id;\n");
      out.write("\t\t\t\t\t\t\tgetHomeworks();\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t})\n");
      out.write("\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function() {\n");
      out.write("\t\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction getHomeworks() {\n");
      out.write("\t\t\tgroup_id=$(\"#homeworkGroup\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"../homework/list_homeworks\", //请求的url地址\n");
      out.write("\t\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"group_id\" : group_id,\n");
      out.write("\t\t\t\t\t\"format\" : \"json\"\n");
      out.write("\t\t\t\t}, //参数值\n");
      out.write("\t\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\t\t$.each(msg.homeworks, function(index, item) {\n");
      out.write("\t\t\t\t\t\t$(\"#homework\").append(\n");
      out.write("\t\t\t\t\t\t\t\t\"<option value='\" + item.uuid+\"'>\" + item.des\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"</option>\");\n");
      out.write("\n");
      out.write("\t\t\t\t\t})\n");
      out.write("\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function() {\n");
      out.write("\t\t\t\t\talert(\"error\")\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction dafen(homeworkuuid, studentid,fenshu) {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"../homework/essayDafen\", //请求的url地址\n");
      out.write("\t\t\t\tdataType : \"json\", //返回格式为json\n");
      out.write("\t\t\t\tasync : true, //请求是否异步\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"homeworkuuid\" : homeworkuuid,\n");
      out.write("\t\t\t\t\t\"studentid\" : studentid,\n");
      out.write("\t\t\t\t\t\"fenshu\":fenshu\n");
      out.write("\t\t\t\t}, //参数值\n");
      out.write("\t\t\t\ttype : \"GET\", //请求方式\n");
      out.write("\t\t\t\tsuccess : function(msg) {\n");
      out.write("\t\t\t\t\talert(\"成功!\");\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function() {\n");
      out.write("\t\t\t\t\talert(\"成功!\")\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/control/homework/mark.jsp(26,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/homework/mark.jsp(26,6) '${classes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${classes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/homework/mark.jsp(26,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("class");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<option id=\"sss\" value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/control/homework/mark.jsp(58,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/homework/mark.jsp(58,5) '${essayanswers}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${essayanswers}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/homework/mark.jsp(58,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("essay");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr class=\"main\">\n");
          out.write("\t\t\t\t\t\t\t<td id=\"uuid\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${essay.essayProblem.homework.uuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${essay.student.group.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${essay.student.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td style=\"padding: 3px 0 0 0\">\n");
          out.write("\t\t\t\t\t\t\t\t<button class=\"actions btn btn-default btn-primary\">批改作业</button>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t<tr class=\"child\">\n");
          out.write("\t\t\t\t\t\t\t<td colspan=\"4\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"content\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"homework col-md-8\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<img width=\"800px\" height=\"500px\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"../resources/upload/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${essay.essayAnswerFileName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(".jpg\" />\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
          out.write("\t\t\t\t\t\t\t\t\t<form class=\"form-inline\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"grade1\">分数</label> <input type=\"text\" id=\"fenshuu\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\">\n");
          out.write("\t\t\t\t\t\t\t\t\t</form>\n");
          out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default btn-primary\" id=\"confirm\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\tonclick='dafen(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${essay.essayProblem.homework.uuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(',');
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${essay.student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",$(this).parent().find(\"#fenshuu\").val())'>确定</button>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
