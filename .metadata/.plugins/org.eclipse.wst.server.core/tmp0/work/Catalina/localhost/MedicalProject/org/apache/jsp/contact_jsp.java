/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2023-01-19 10:40:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Created By CodingLab - www.codinglabweb.com -->\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(" body {\r\n");
      out.write("  background-image:url(\"home1.jpg\");\r\n");
      out.write("  background-color: lighten($grey, 10%);\r\n");
      out.write("  font-size: 100%;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("form\r\n");
      out.write("{\r\n");
      out.write(" margin-left:150px;\r\n");
      out.write(" margin-top:50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<form method=\"post\" action=\"contactdata.jsp\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div class=\"row header\">\r\n");
      out.write("    <h1>CONTACT US &nbsp;</h1>\r\n");
      out.write("    <h3>Fill out the form below to learn more!</h3>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row body\">\r\n");
      out.write("    \r\n");
      out.write("      <ul>\r\n");
      out.write("        \r\n");
      out.write("        <li>\r\n");
      out.write("          <p class=\"left\">\r\n");
      out.write("            <label for=\"first_name\">first name</label>\r\n");
      out.write("            <input type=\"text\" name=\"first_name\" placeholder=\" First_Name\" />\r\n");
      out.write("          </p></li>\r\n");
      out.write("          <li>\r\n");
      out.write("          <p class=\"pull-right\">\r\n");
      out.write("            <label for=\"last_name\">last name</label>\r\n");
      out.write("            <input type=\"text\" name=\"last_name\" placeholder=\"last_Name\" />      \r\n");
      out.write("          </p>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li>\r\n");
      out.write("          <p>\r\n");
      out.write("            <label for=\"email\">email <span class=\"req\">*</span></label>\r\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"abc@gmail.com\" />\r\n");
      out.write("          </p>\r\n");
      out.write("        </li>        \r\n");
      out.write("       \r\n");
      out.write("        <li>\r\n");
      out.write("          <label for=\"comments\">comments</label>\r\n");
      out.write("          <textarea cols=\"46\" rows=\"3\" name=\"comments\"></textarea>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("       <br> \r\n");
      out.write("          <input type=\"submit\" value=\"submit\"/>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("    </form>  \r\n");
      out.write("  </div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
