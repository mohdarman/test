package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("\n");
      out.write("<form method=\"\" action=\"\">\n");
      out.write("\n");
      out.write("<table border=\"1\" align=\"center\" width=\"400\" bgcolor=\"#CCCCCC\" >\n");
      out.write("\n");
      out.write("<caption>Registration book</caption>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Enter your book name</th>\n");
      out.write("\n");
      out.write("<td><input type=\"text\" name=\"fn\" id=\"fn1\" maxlength=\"10\" title=\"enter your first name\" placeholder=\"enter your first name\" required/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Enter your auther  name</th>\n");
      out.write("\n");
      out.write("<td><input type=\"text\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Enter your password</th>\n");
      out.write("\n");
      out.write("<td><input type=\"password\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>ReEnter your password</th>\n");
      out.write("\n");
      out.write("<td><input type=\"password\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Enter your userID</th>\n");
      out.write("\n");
      out.write("<td><input type=\"email\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Enter your mobile</th>\n");
      out.write("\n");
      out.write("<td><input type=\"number\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Enter your address</th>\n");
      out.write("\n");
      out.write("<td><textarea rows=\"8\" cols=\"20\"></textarea></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Select your book type</th>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("ENGI<input type=\"checkbox\" name=\"engineering\" value=\"m\"/>\n");
      out.write("INTERMEDIATE<input type=\"checkbox\" name=\"g\" value=\"intermediate\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Select your DOB</th>\n");
      out.write("\n");
      out.write("<td><input type=\"date\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Select your Country</th>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("<select name=\"country\">\n");
      out.write("\n");
      out.write("<option value=\"\" selected=\"selected\" disabled=\"disabled\">Select your country</option>\n");
      out.write("\n");
      out.write("<option value=\"1\">India</option>\n");
      out.write("\n");
      out.write("<option value=\"2\">AUSTRALIA</option>\n");
      out.write("\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Upload your pic</th>\n");
      out.write("\n");
      out.write("<td><input type=\"file\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Save My Data\"/>\n");
      out.write("\n");
      out.write("<input type=\"reset\" value=\"Reset Data\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
