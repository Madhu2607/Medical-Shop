/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2023-01-08 10:18:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write(".nicip, .lomo\r\n");
      out.write("{\r\n");
      out.write(" color:teal;\r\n");
      out.write("  height: 470px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".omee\r\n");
      out.write("{\r\n");
      out.write(" color:navy;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".azze\r\n");
      out.write("{\r\n");
      out.write("color:maroon;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".lipuslide\r\n");
      out.write("{\r\n");
      out.write("color:orange;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".diclo\r\n");
      out.write("{\r\n");
      out.write("color:green;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".omeesyrup\r\n");
      out.write("{\r\n");
      out.write("color:fuchsia;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".zendril\r\n");
      out.write("{\r\n");
      out.write("color:maroon;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".oflakem\r\n");
      out.write("{\r\n");
      out.write("color:green;\r\n");
      out.write("  height: 460px;\r\n");
      out.write("    width: 330px;\r\n");
      out.write("    background-color: rgba(255,255,255,0.13);\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    backdrop-filter: blur(10px);\r\n");
      out.write("    border: 2px solid rgba(255,255,255,0.1);\r\n");
      out.write("    box-shadow: 0 0 40px rgba(8,7,16,0.6);\r\n");
      out.write("     top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left:15%;\r\n");
      out.write("}\r\n");
      out.write(".table\r\n");
      out.write("{\r\n");
      out.write("  border-collapse:collapse;\r\n");
      out.write("}\r\n");
      out.write("p\r\n");
      out.write("{\r\n");
      out.write("  margin-left:2%;\r\n");
      out.write("}\r\n");
      out.write("td\r\n");
      out.write("{ padding:15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<h1 style=\"color:red\" align=\"center\">PRODUCT &nbsp; DETAILS</h1>\r\n");
      out.write("<div align=\"cent\">\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"nicip\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2>NICIP Tablet</h2></center>\r\n");
      out.write("<img src=\"nicip.jpg\" width=\"304\" height=\"228\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Pain relief<br><br> <b><u>Benefits:</u></b> Nicip tablet is composed if nimulslide, primarly used to treat mild to moderate pain.Nicip Tablet works by blocking the effect of a chemical known as prostaglandin, responsible for including pain and inflammation in the body.</p>\r\n");
      out.write("</td>\r\n");
      out.write("</div>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"omee\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2> OMEE Capsule</h2>\r\n");
      out.write("</center>\r\n");
      out.write("<img src=\"Omee-Capsule.jpg\"  width=\"304\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Stomach ulcers, Acid reflux, Hyperacidity, Zollinger Ellison syndrome<br><br> <b><u>Benefits:</u></b> Omee Capsule is a medicine that reduces the amount of acid produced in your stomach. It helps treat acid-related diseases of the stomach and intensine such as heartburn, acid reflux, and peptic ulcer disease. </p>\r\n");
      out.write("</div>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"azze\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2>AZEE-500 Tablet</h2>\r\n");
      out.write("</center>\r\n");
      out.write("<img src=\"Azee-500-tablet.jpg\"  width=\"304\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Bacterial infection<br> <br><u><b> Benefits:</b></u> Azee 500 Tablet is an antiboitic used to treat various types of bacterial infections of the respiratory tract, ear, nose, throat, lungs, skin, and eye in adults and children. it is also effective in typhoid fever and some sexually transmitted diseases like gonorrhea. </p>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"diclo\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2>DICLO PLUS Tablet</h2></center>\r\n");
      out.write("<img src=\"Dicloplus tablet.jpg\" width=\"304\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Pain relief<br><br> <b><u>Benefits:</u></b> Diclo plus tablet is a pain relieving medicine. It is used to reduce pain and inflamation in conditions like rheumatoid arthisis. It may also be used to relieve muscle pain, back pain, toothache, or pain in the ear and troat.</p>\r\n");
      out.write("</td>\r\n");
      out.write("</div>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"lomo\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2> LOMO Tablet</h2>\r\n");
      out.write("</center>\r\n");
      out.write("<img src=\"lomo tablet.jpg\"  width=\"280\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Bacterial Infection<br><br> <b><u>Benefits:</u></b> Lomo Tablet is an anti-diarrhoeal medication. It works by slowing down the contraction of the intestines thereby deacreasing the speed at which the contents pass through it.This allows more time for reabsorption of fluids and nutirents, making the stools more solid and less frequent.  </p>\r\n");
      out.write("</div>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"lipuslide\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2>LIPUSLIDE P Tablet</h2>\r\n");
      out.write("</center>\r\n");
      out.write("<img src=\"lipuslide-p.jpg\"  width=\"304\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Pain, Inflammation, Fever<br> <br><u><b> Benefits:</b></u> Lipuslide P Tablet is a combination medicine that helps in relieving pain.It is used to relieve pain and inflammation in conditions. It is also used to relieve fever, muscle pain, back pain, toothache, or pain in the ear and throat. </p>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"omeesyrup\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2>OMEE MPS Syrup</h2></center>\r\n");
      out.write("<center><img src=\"OMEE syrup.jpg\" width=\"200\" height=\"200\"/></center>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Acidity, Heartburn, Indegistion, Gastrils,Stomach upset<br><br> <b><u>Benefits:</u></b> Omee Mps Liquid Mint is used in the treatment od acidity, bloating and stomach ulcers. It helps by relieving the symptoms such as stomach pain or irritation. It also helps in neutrilizing and ealizing excess gas in the stomach</p>\r\n");
      out.write("</td>\r\n");
      out.write("</div>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"zendril\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2> Zendril Syrup</h2>\r\n");
      out.write("</center>\r\n");
      out.write("<img src=\"Zendril.jpg\"  width=\"280\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Cough and Cold<br><br> <b><u>Benefits:</u></b> Zendril Syrup is a combination medicine used to treat cough. It thins the mucus in the nose and windpipe,making it easier to cough out. This medicine also relivies allergic symptoms like runny nose, watery eyes, throat irritation. </p>\r\n");
      out.write("</div>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<div class=\"oflakem\">\r\n");
      out.write("<center>\r\n");
      out.write("<h2>Oflakem OZ Syrup</h2>\r\n");
      out.write("</center>\r\n");
      out.write("<img src=\"oflokem.png\"  width=\"304\" height=\"220\"/>\r\n");
      out.write("<p><b><u>Uses:</u></b>&nbsp;Bacterial Infection<br> <br><u><b> Benefits:</b></u>Oflakem OZ Syrup is an antibiotic medicine that is given to children to effictively treat a wide range of bacterial infections that amy occur in the teeth, lungs, gastrointestinal infections, urinary and genital tract. </p>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
