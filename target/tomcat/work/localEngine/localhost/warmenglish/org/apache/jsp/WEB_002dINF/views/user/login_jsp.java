package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.release();
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
      out.write("<link href=\"../resources/css/login.css\" rel=\"stylesheet\">\n");
      out.write("<title>请登录</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"../resources/images/splash-home.png\">\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-6 letters\">\n");
      out.write("\t\t\t<h>With Warm English,you can:</h>\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-offset-8 taber\">\n");
      out.write("\t\t\t<ul id=\"myTab\" class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#login\" data-toggle=\"tab\">登录</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#register\" data-toggle=\"tab\">注册</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade in active\" id=\"login\">\n");
      out.write("\t\t\t\t\t");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005fform_005f0.setParent(null);
      // /WEB-INF/views/user/login.jsp(29,5) null
      _jspx_th_sf_005fform_005f0.setDynamicAttribute(null, "class", new String("form-signin"));
      // /WEB-INF/views/user/login.jsp(29,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setMethod("post");
      // /WEB-INF/views/user/login.jsp(29,5) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setModelAttribute("user");
      // /WEB-INF/views/user/login.jsp(29,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setAction("login");
      int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
        if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t<h2 class=\"form-signin-heading\">请登录</h2>\n");
            out.write("\t\t\t\t\t\t<label for=\"inputEmail\" class=\"sr-only\">用户名</label>\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
            // /WEB-INF/views/user/login.jsp(34,6) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f0.setPath("username");
            int[] _jspx_push_body_count_sf_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f0 = _jspx_th_sf_005ferrors_005f0.doStartTag();
              if (_jspx_th_sf_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_sf_005ferrors_005f0);
            }
            out.write("\n");
            out.write("\t\t\t\t\t\t<br />\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_sf_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
            // /WEB-INF/views/user/login.jsp(38,6) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005ferrors_005f1.setPath("password");
            int[] _jspx_push_body_count_sf_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005ferrors_005f1 = _jspx_th_sf_005ferrors_005f1.doStartTag();
              if (_jspx_th_sf_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_sf_005ferrors_005f1);
            }
            out.write("\n");
            out.write("\t\t\t\t\t\t<input class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" />\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.reuse(_jspx_th_sf_005fform_005f0);
      }
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tab-pane fade\" id=\"register\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_sf_005fform_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/user/login.jsp(32,6) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/views/user/login.jsp(32,6) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/user/login.jsp(32,6) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("username");
    // /WEB-INF/views/user/login.jsp(32,6) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("请输入用户名"));
    int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
      if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/user/login.jsp(36,6) null
    _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "type", new String("password"));
    // /WEB-INF/views/user/login.jsp(36,6) null
    _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/user/login.jsp(36,6) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f1.setPath("password");
    // /WEB-INF/views/user/login.jsp(36,6) null
    _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "placeholder", new String("请输入密码"));
    int[] _jspx_push_body_count_sf_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f1 = _jspx_th_sf_005finput_005f1.doStartTag();
      if (_jspx_th_sf_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_sf_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sf_005fform_005f1.setParent(null);
    // /WEB-INF/views/user/login.jsp(43,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f1.setMethod("post");
    // /WEB-INF/views/user/login.jsp(43,5) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f1.setModelAttribute("user");
    // /WEB-INF/views/user/login.jsp(43,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005fform_005f1.setAction("register");
    int[] _jspx_push_body_count_sf_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005fform_005f1 = _jspx_th_sf_005fform_005f1.doStartTag();
      if (_jspx_eval_sf_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<label for=\"InputName\">真实姓名</label>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_sf_005finput_005f2(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<lable for=\"InputUsername\">用户名</lable>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_sf_005finput_005f3(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<label for=\"InputPassword\">密码</label>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_sf_005finput_005f4(_jspx_th_sf_005fform_005f1, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default btn-group-justified\">注册</button>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_sf_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005fform_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005fform_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005fform_005f1.doFinally();
      _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_sf_005fform_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/user/login.jsp(46,7) null
    _jspx_th_sf_005finput_005f2.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/views/user/login.jsp(46,7) null
    _jspx_th_sf_005finput_005f2.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/user/login.jsp(46,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f2.setId("InputName");
    // /WEB-INF/views/user/login.jsp(46,7) null
    _jspx_th_sf_005finput_005f2.setDynamicAttribute(null, "placeholder", new String("Enter Name"));
    // /WEB-INF/views/user/login.jsp(46,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f2.setPath("name");
    int[] _jspx_push_body_count_sf_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f2 = _jspx_th_sf_005finput_005f2.doStartTag();
      if (_jspx_th_sf_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/user/login.jsp(51,7) null
    _jspx_th_sf_005finput_005f3.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/views/user/login.jsp(51,7) null
    _jspx_th_sf_005finput_005f3.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/user/login.jsp(51,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f3.setId("InputUsername");
    // /WEB-INF/views/user/login.jsp(51,7) null
    _jspx_th_sf_005finput_005f3.setDynamicAttribute(null, "placeholder", new String("Enter Uesername"));
    // /WEB-INF/views/user/login.jsp(51,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f3.setPath("username");
    int[] _jspx_push_body_count_sf_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f3 = _jspx_th_sf_005finput_005f3.doStartTag();
      if (_jspx_th_sf_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f1);
    // /WEB-INF/views/user/login.jsp(56,7) null
    _jspx_th_sf_005finput_005f4.setDynamicAttribute(null, "type", new String("password"));
    // /WEB-INF/views/user/login.jsp(56,7) null
    _jspx_th_sf_005finput_005f4.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/views/user/login.jsp(56,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f4.setId("InputPassword");
    // /WEB-INF/views/user/login.jsp(56,7) null
    _jspx_th_sf_005finput_005f4.setDynamicAttribute(null, "placeholder", new String("Password"));
    // /WEB-INF/views/user/login.jsp(56,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f4.setPath("password");
    int[] _jspx_push_body_count_sf_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f4 = _jspx_th_sf_005finput_005f4.doStartTag();
      if (_jspx_th_sf_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f4);
    }
    return false;
  }
}
