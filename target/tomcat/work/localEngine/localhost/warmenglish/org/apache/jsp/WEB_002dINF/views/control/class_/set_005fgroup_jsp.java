package org.apache.jsp.WEB_002dINF.views.control.class_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class set_005fgroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../resources/css/setGroup.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>管理分组信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 两个模态框 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"addMember\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">添加小组成员</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" data-dismiss=\"modal\" id=\"add\">添加</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"deleteMember\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabe2\">删除小组成员</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" data-dismiss=\"modal\" id=\"delete\">删除</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2>管理分组信息<br/><small>你可以在这里删除或修改小组名称和备注，或者管理小组成员</small></h2>\r\n");
      out.write("    <hr/>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-5\">\r\n");
      out.write("            <form method=\"post\" class=\"form-inline\">\r\n");
      out.write("                <label for=\"groupClass\">班级</label>\r\n");
      out.write("\t                <select class=\"form-control\" name=\"class_uuid\" id=\"groupClass\" >\r\n");
      out.write("\t                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                </select>\r\n");
      out.write("\t                <button type=\"submit\" class=\"btn btn-default btn-primary\">选择</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"table-responsive\">\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
<<<<<<< HEAD
      out.write("            \t<th class=\"col-md-1\"></th>\r\n");
      out.write("            \t<th class=\"col-md-2\">班级名称</th>\r\n");
      out.write("            \t<th class=\"col-md-1\"></th>\r\n");
=======
      out.write("            \t<th class=\"col-md-2\">班级名称</th>\r\n");
      out.write("            \t<th class=\"col-md-2\">小组id</th>\r\n");
>>>>>>> origin/master
      out.write("                <th class=\"col-md-2\">小组名称</th>\r\n");
      out.write("                <th class=\"col-md-3\">备注</th>\r\n");
      out.write("                <th class=\"col-md-3\"></th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar group;\r\n");
      out.write("\tvar clazz;\r\n");
      out.write("\t//var chk_value =[];\r\n");
      out.write("    $('table').on('mouseenter', 'tr', function(){\r\n");
      out.write("        $(this).addClass('hover');\r\n");
      out.write("        $('.actions.btn-info').click(function() {\r\n");
      out.write("            $(this).parents('.main').next(\"tr.child\").slideToggle();\r\n");
      out.write("            event.cancelBubble();\r\n");
      out.write("        });\r\n");
      out.write("        $('.actions.btn-danger').click(function(){\r\n");
      out.write("            if(window.confirm(\"确认删除这个分组吗？\")){\r\n");
      out.write("                window.location=\"/\"\r\n");
      out.write("            }\r\n");
      out.write("            else{}\r\n");
      out.write("            event.cancelBubble();\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("        event.cancelBubble();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('table').on('mouseleave', 'tr', function(){\r\n");
      out.write("        $(this).removeClass('hover');\r\n");
      out.write("    });\r\n");
<<<<<<< HEAD
      out.write("    \r\n");
      out.write("    //列出组员\r\n");
      out.write("    $('table').on('click', '#listMember', function(e) {\r\n");
      out.write("    \tgroup=$(this).parents(\".main\").children(\"td\").eq(2).text();\r\n");
      out.write("    \tclazz=$(this).parents(\".main\").children(\"td\").eq(0).text();\r\n");
      out.write("    \tif($(this).parents(\".main\").children(\"td\").eq(3).text()=='默认小组'){\r\n");
      out.write("    \t\t$(\"#listUnmember\").attr({\"disabled\":\"disabled\"});\r\n");
      out.write("    \t\t$(\"#listIsmember\").attr({\"disabled\":\"disabled\"});\r\n");
      out.write("    \t}\r\n");
      out.write("    \t$(\".table\"+group+\" tr td\").remove();\r\n");
      out.write("    \tlistMember();\r\n");
      out.write("    \tevent.cancelBubble();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    //管理，列出非组员，添加\r\n");
      out.write("    $('table').on('click', '#listUnmember', function(e) {\r\n");
      out.write("    \tclazz=$(this).parents(\".child\").prev(\".main\").children(\"td\").eq(0).text();\r\n");
      out.write("    \tgroup=$(this).parents(\".child\").prev(\".main\").children(\"td\").eq(2).text();\r\n");
      out.write("    \t$(\"#addMember .modal-body label\").remove();\r\n");
      out.write("    \tlistUnmember();\r\n");
      out.write("    \tevent.cancelBubble();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    //管理，列出组员，删除\r\n");
      out.write("    $('table').on('click', '#listIsmember', function(e) {\r\n");
      out.write("    \tgroup=$(this).parents(\".child\").prev(\".main\").children(\"td\").eq(2).text();\r\n");
      out.write("    \tclazz=$(this).parents(\".child\").prev(\".main\").children(\"td\").eq(0).text();\r\n");
      out.write("    \t$(\"#deleteMember .modal-body label\").remove();\r\n");
      out.write("    \tlistIsMember();\r\n");
      out.write("    \tevent.cancelBubble();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    //添加组员\r\n");
      out.write("    $('#add').click(function(){\r\n");
      out.write("    \t  var chk_value_add=new Array();\r\n");
      out.write("    \t  $('#addMember input[name=\"student\"]:checked').each(function(){    \r\n");
      out.write("    \t   chk_value_add.push($(this).val());    \r\n");
      out.write("    \t  });\r\n");
      out.write("    \t  if(chk_value_add.length==0){\r\n");
      out.write("    \t\t  alert(\"你还没有选择任何内容！\");\r\n");
      out.write("    \t  }\r\n");
      out.write("    \t  else{\r\n");
      out.write("    \t\t  var value='*';\r\n");
      out.write("    \t\t  for(var i=0;i<chk_value_add.length;i++){\r\n");
      out.write("    \t\t\t  value+=chk_value_add[i]+'*'\r\n");
      out.write("    \t\t  }\r\n");
      out.write("    \t\t  addMember(value);\r\n");
      out.write("    \t  };  \r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("    //删除组员\r\n");
      out.write("    $('#delete').click(function(){\r\n");
      out.write("    \t  var chk_value_delete=new Array();\r\n");
      out.write("    \t  $('#deleteMember input[name=\"student\"]:checked').each(function(){    \r\n");
      out.write("    \t   chk_value_delete.push($(this).val());    \r\n");
      out.write("    \t  });\r\n");
      out.write("    \t  if(chk_value_delete.length==0){\r\n");
      out.write("    \t\t  alert(\"你还没有选择任何内容！\");\r\n");
      out.write("    \t  }\r\n");
      out.write("    \t  else{\r\n");
      out.write("    \t\t  var value='*';\r\n");
      out.write("    \t\t  for(var i=0;i<chk_value_delete.length;i++){\r\n");
      out.write("    \t\t\t  value+=chk_value_delete[i]+'*'\r\n");
      out.write("    \t\t  }\r\n");
      out.write("    \t\t  deleteMember(value);\r\n");
      out.write("    \t  };\r\n");
=======
      out.write("    $('table').on('click', '#listMember', function(e) {\r\n");
      out.write("    \tgroup=$(this).parents(\".main\").children(\"td\").eq(1).text();\r\n");
      out.write("    \talert(group);\r\n");
      out.write("    \tlistMember();\r\n");
      out.write("    \tevent.cancelBubble();\r\n");
>>>>>>> origin/master
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("    //把组员列在表格里\r\n");
      out.write("    function listMember() {\r\n");
      out.write("    //\talert(group);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"../set_group/list_members\", //请求的url地址\r\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("\t\t\tasync : true, //请求是否异步\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"group_id\" : group,\r\n");
      out.write("\t\t\t\t\"format\" : \"json\"\r\n");
      out.write("\t\t\t}, //参数值\r\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\r\n");
      out.write("\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\t\t\t$.each(msg.students, function(index, item) {\r\n");
<<<<<<< HEAD
      out.write("\t\t\t\t\t$(\".table\"+group+\" tr\").append(\"<td class='col-sm-3'>\" + item.name+\"</td>\")\r\n");
=======
      out.write("\t\t\t\t\talert(\"到这了\");\r\n");
      out.write("\t\t\t\t\t$(\".table\"+group+\" tr\").append(\"<td>\" + item.name+\"</td>\")\r\n");
>>>>>>> origin/master
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("    //把组员列在模态框里\r\n");
      out.write("    function listIsMember() {\r\n");
      out.write("    \t\t$.ajax({\r\n");
      out.write("    \t\t\turl : \"../set_group/list_members\", //请求的url地址\r\n");
      out.write("    \t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("    \t\t\tasync : true, //请求是否异步\r\n");
      out.write("    \t\t\tdata : {\r\n");
      out.write("    \t\t\t\t\"group_id\" : group,\r\n");
      out.write("    \t\t\t\t\"format\" : \"json\"\r\n");
      out.write("    \t\t\t}, //参数值\r\n");
      out.write("    \t\t\ttype : \"GET\", //请求方式\r\n");
      out.write("    \t\t\tsuccess : function(msg) {\r\n");
      out.write("    \t\t\t\t$.each(msg.students, function(index, item) {\r\n");
      out.write("    \t\t\t\t\t$(\"#deleteMember .modal-body\").append(\"<label class='col-sm-3'><input name='student' type='checkbox' value=\"+item.id+\">\"+item.name+\"</label>\");\r\n");
      out.write("    \t\t\t\t})\r\n");
      out.write("    \t\t\t},\r\n");
      out.write("    \t\t\terror : function() {\r\n");
      out.write("    \t\t\t\talert(\"error\")\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("    \r\n");
      out.write("    //把非组员列在模态框里\r\n");
      out.write("    function listUnmember() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"../set_group/list_unmembers\", //请求的url地址\r\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("\t\t\tasync : true, //请求是否异步\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"clazz_id\" : clazz,\r\n");
      out.write("\t\t\t\t\"format\" : \"json\"\r\n");
      out.write("\t\t\t}, //参数值\r\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\r\n");
      out.write("\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\t\t\t$.each(msg.students, function(index, item) {\r\n");
      out.write("\t\t\t\t\t$(\"#addMember .modal-body\").append(\"<label class='col-sm-3'><input name='student' type='checkbox' value=\"+item.id+\">\"+item.name+\"</label>\");\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("    //删除组员\r\n");
      out.write("    function deleteMember(chk) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"../set_group/delete_members\", //请求的url地址\r\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("\t\t\tasync : true, //请求是否异步\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"json\" : chk,\r\n");
      out.write("\t\t\t\t\"clazz_id\":clazz,\r\n");
      out.write("\t\t\t\t\"format\" : \"json\"\r\n");
      out.write("\t\t\t}, //参数值\r\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\r\n");
      out.write("\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("\t//添加组员\r\n");
      out.write("    function addMember(chk) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"../set_group/add_members\", //请求的url地址\r\n");
      out.write("\t\t\tdataType : \"json\", //返回格式为json\r\n");
      out.write("\t\t\tasync : true, //请求是否异步\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"json\" : chk,\r\n");
      out.write("\t\t\t\t\"group_id\":group,\r\n");
      out.write("\t\t\t\t\"format\" : \"json\"\r\n");
      out.write("\t\t\t}, //参数值\r\n");
      out.write("\t\t\ttype : \"GET\", //请求方式\r\n");
      out.write("\t\t\tsuccess : function(msg) {\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
<<<<<<< HEAD
    // /WEB-INF/views/control/class/set_group.jsp(57,21) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/class/set_group.jsp(57,21) '${classes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${classes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/class/set_group.jsp(57,21) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
=======
    // /WEB-INF/views/control/class/set_group.jsp(59,21) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/class/set_group.jsp(59,21) '${classes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${classes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/class/set_group.jsp(59,21) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
>>>>>>> origin/master
    _jspx_th_c_005fforEach_005f0.setVar("class");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.uuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
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
<<<<<<< HEAD
    // /WEB-INF/views/control/class/set_group.jsp(78,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/class/set_group.jsp(78,13) '${groups}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${groups}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/class/set_group.jsp(78,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
=======
    // /WEB-INF/views/control/class/set_group.jsp(79,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/control/class/set_group.jsp(79,13) '${groups}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${groups}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/control/class/set_group.jsp(79,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
>>>>>>> origin/master
    _jspx_th_c_005fforEach_005f1.setVar("group");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr class=\"main\">\r\n");
<<<<<<< HEAD
          out.write("\t\t\t\t\t\t\t<td id=\"clazz_id\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.clazz.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
=======
>>>>>>> origin/master
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.clazz.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td id=\"group_id\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.tips}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td style=\"padding: 3px 0 0 0\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<button class=\"actions btn btn-default btn-primary\">编辑</button>\r\n");
          out.write("                    \t\t\t<button class=\"actions btn btn-default btn-danger\">删除</button>\r\n");
          out.write("                    \t\t\t<button class=\"actions btn btn-default btn-info\" id=\"listMember\">管理成员</button>\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t<tr class=\"child\">\r\n");
<<<<<<< HEAD
          out.write("\t\t\t\t\t\t\t<td colspan=\"6\">\r\n");
=======
          out.write("\t\t\t\t\t\t\t<td colspan=\"5\">\r\n");
>>>>>>> origin/master
          out.write("\t\t\t\t\t\t\t\t<div class=\"content\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<p>小组成员：</p>\r\n");
          out.write("\t\t                        \t<table class=\"table");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t                            <tr></tr>\r\n");
          out.write("\t\t                        \t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"member\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a  data-target=\"#addMember\" data-toggle='modal' class=\"btn btn-sm btn-primary\" id=\"listUnmember\">添加成员</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a  data-target=\"#deleteMember\" data-toggle='modal' class=\"btn btn-sm btn-danger\" id=\"listIsmember\">删除成员</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
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
