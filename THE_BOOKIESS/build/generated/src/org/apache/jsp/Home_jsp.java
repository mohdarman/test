package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import bookies_databaseconnection.databaseop;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssfiles/homecss.css\">      \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("           </head> \n");
      out.write("    <body>\n");
      out.write("        <div class=\"all\">\n");
      out.write("             <div class=\"menu\" style=\"float: top; background-color: #000000;\">\n");
      out.write("          <nav class=\"navigate\"  style=\"background-color: #000000\">\n");
      out.write("              \n");
      out.write("            <ul class=\"headerul\">\n");
      out.write("              \n");
      out.write("               <li>  <a href='Home.jsp' class=\"active\">HOME</a></li><hr>\n");
      out.write("                <li> <a href='registraion.jsp'>REGISTRATION</a></li><hr>\n");
      out.write("                   <li> <a href='LOGIN.jsp'>LOGIN</a></li><hr>\n");
      out.write("                  <li>  <a href='Exitting_seller.jsp'>USERS</a></li> \n");
      out.write("                  <form class=\"example\" action=\"\">\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("  <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("</form> \n");
      out.write("              </ul>\n");
      out.write("             </nav> \n");
      out.write("        </div>\n");
      out.write("            <div class=\"centerdiv\" stye=\"margin-top:100px; margin-bottom:100px;\">\n");
      out.write("             <nav class=\"navigate\">\n");
      out.write("            <a href=\"#\"><img src='IMAGES/artsbook.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/engineering book.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/medical-books.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/INTERMEDIATEBOOK.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/download (1).jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/COMMERCE.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/INTERMEDIATEBOOK.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/9 AND 10.jpg'></img></a>\n");
      out.write("            <a href=\"#\"><img src='IMAGES/banner_slider-ncert.png'></img></a>\n");
      out.write("            <a href=\"LOGIN.jsp\"><img src='IMAGES/Entrance-Examination.jpg'></img></a>\n");
      out.write("        ");
 
            Statement statement = null;
ResultSet rs = null;

           // ResultSet rs = null;
            Connection con=databaseop.getconnect();
            statement = con.createStatement();
            String quiry="select title from book";
           rs = statement.executeQuery(quiry);
           // rs=ps.executeQuery();
            while(rs.next())
            {
      out.write("\n");
      out.write("                 <a href=\"#\"><img src='IMAGES/");
      out.print(rs.getString(1));
      out.write("' alt=\"Smiley face\"></img></a>\n");
      out.write("           ");
 }
            rs.close();
            con.close();
            
        
      out.write("\n");
      out.write("            <nav>\n");
      out.write("            </div>\n");
      out.write("            <div class='footer'>\n");
      out.write("        <footer class=\"footer\" style='margin-top: 800px;'>\n");
      out.write("  <div class=\"footer-left col-md-4 col-sm-6\">\n");
      out.write("      <h2> About the website</h2> <p class=\"about\"><span>THIS SITE IS UNDER WORKING CONDITION CURRENTLY THE DEVELOPER ARMAN AND BHUPENDER WORKING ON IT</span>\n");
      out.write("    </p>\n");
      out.write("    <div class=\"icons\">\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer-center col-md-4 col-sm-6\">\n");
      out.write("    <div>\n");
      out.write("      <i class=\"fa fa-map-marker\"></i>\n");
      out.write("      <p><span>Adress and Pincode</span> City, country</p>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <i class=\"fa fa-phone\"></i>\n");
      out.write("      <p> +91-9897652250</p>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <i class=\"fa fa-envelope\"></i>\n");
      out.write("      <p><a href=\"#\"> arman041998@gmail.com</a></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer-right col-md-4 col-sm-6\">\n");
      out.write("    <b>Website Name</b>\n");
      out.write("    <p class=\"menu\">\n");
      out.write("      <a href=\"#\"> Home</a> \n");
      out.write("      <a href=\"#\"> About</a> \n");
      out.write("      <a href=\"#\"> Services</a> \n");
      out.write("      <a href=\"#\"> Portfolio</a> \n");
      out.write("      <a href=\"#\"> News</a> \n");
      out.write("      <a href=\"#\"> Contact</a>\n");
      out.write("    </p>\n");
      out.write("    <p class=\"name\"> THE BOOKIES.COM</p>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("</footer>\n");
      out.write("       \n");
      out.write("      \n");
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
