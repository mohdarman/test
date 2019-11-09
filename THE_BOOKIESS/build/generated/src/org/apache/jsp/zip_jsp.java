package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zip_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">//<![CDATA[\n");
      out.write("\t$(function() {\n");
      out.write("\t\t// IMPORTANT: Fill in your client key\n");
      out.write("\t\tvar clientKey = \"js-9qZHzu2Flc59Eq5rx10JdKERovBlJp3TQ3ApyC4TOa3tA8U7aVRnFwf41RpLgtE7\";\n");
      out.write("\t\t\n");
      out.write("\t\tvar cache = {};\n");
      out.write("\t\tvar container = $(\"#example1\");\n");
      out.write("\t\tvar errorDiv = container.find(\"div.text-error\");\n");
      out.write("\t\t\n");
      out.write("\t\t/** Handle successful response */\n");
      out.write("\t\tfunction handleResp(data)\n");
      out.write("\t\t{\n");
      out.write("\t\t\t// Check for error\n");
      out.write("\t\t\tif (data.error_msg)\n");
      out.write("\t\t\t\terrorDiv.text(data.error_msg);\n");
      out.write("\t\t\telse if (\"city\" in data)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t// Set city and state\n");
      out.write("\t\t\t\tcontainer.find(\"input[name='city']\").val(data.city);\n");
      out.write("\t\t\t\tcontainer.find(\"input[name='state']\").val(data.state);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// Set up event handlers\n");
      out.write("\t\tcontainer.find(\"input[name='zipcode']\").on(\"keyup change\", function() {\n");
      out.write("\t\t\t// Get zip code\n");
      out.write("\t\t\tvar zipcode = $(this).val().substring(0, 5);\n");
      out.write("\t\t\tif (zipcode.length == 5 && /^[0-9]+$/.test(zipcode))\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t// Clear error\n");
      out.write("\t\t\t\terrorDiv.empty();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t// Check cache\n");
      out.write("\t\t\t\tif (zipcode in cache)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\thandleResp(cache[zipcode]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\t// Build url\n");
      out.write("\t\t\t\t\tvar url = \"https://www.zipcodeapi.com/rest/\"+clientKey+\"/info.json/\" + zipcode + \"/radians\";\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t// Make AJAX request\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\"url\": url,\n");
      out.write("\t\t\t\t\t\t\"dataType\": \"json\"\n");
      out.write("\t\t\t\t\t}).done(function(data) {\n");
      out.write("\t\t\t\t\t\thandleResp(data);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t// Store in cache\n");
      out.write("\t\t\t\t\t\tcache[zipcode] = data;\n");
      out.write("\t\t\t\t\t}).fail(function(data) {\n");
      out.write("\t\t\t\t\t\tif (data.responseText && (json = $.parseJSON(data.responseText)))\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t// Store in cache\n");
      out.write("\t\t\t\t\t\t\tcache[zipcode] = json;\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t// Check for error\n");
      out.write("\t\t\t\t\t\t\tif (json.error_msg)\n");
      out.write("\t\t\t\t\t\t\t\terrorDiv.text(json.error_msg);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t\t\terrorDiv.text('Request failed.');\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}).trigger(\"change\");\n");
      out.write("\t});\n");
      out.write("//]]></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("        <h1>Hello World!</h1\n");
      out.write("      Zip Code: <input type=\"text\" id=\"zip\"  name=\"zipcode\"/>\n");
      out.write("    City: <input type=\"text\" id=\"city\" name=\"city\" />\n");
      out.write("    State: <input type=\"text\" id=\"state\" name=\"state\" />\n");
      out.write("    <input type=\"submit\" values=\"btb\">\n");
      out.write("    </form>\n");
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
