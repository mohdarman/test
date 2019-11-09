package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlets_files.ServletLogin;
import java.sql.DriverManager;
import java.sql.Connection;
import bookies_databaseconnection.databaseop;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public final class LOGIN_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOG IN PAGE</title>\n");
      out.write("        <style>\n");
      out.write("            @import \"https://use.fontawesome.com/releases/v5.5.0/css/all.css\";\n");
      out.write("            </style>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"cssfiles/registration_login_css.css\">\n");
      out.write("             <link rel=\"stylesheet\" type=\"text/css\" href=\"cssfiles/homecss.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("         <div class=\"menu\" style=\"float: top; background-color: rgba(0,0,0,.5);\">\n");
      out.write("          <nav class=\"navigate\">\n");
      out.write("            <ul class=\"headerul\">\n");
      out.write("                <li>   <a href='Home.jsp' class=\"active\">HOME</a></li><hr>        \n");
      out.write("                <li> <a href='registraion.jsp'>REGISTRATION</a></li><hr>\n");
      out.write("                  <li>  <a href='Exitting_seller.jsp'>EXISTING SELLER</a></li>\n");
      out.write("              </ul>\n");
      out.write("             </nav> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"login-box\" style='background-color: black;height:50%;border-radius: 5px;width: 30%'>\n");
      out.write("         <h1>Login</h1>\n");
      out.write("         <div class='textbox'>\n");
      out.write("      <form action=\"ServletLogin\" method='post'>\n");
      out.write("          <i class=\"fas fa-user\"></i>\n");
      out.write("          <input type=\"text\" placeholder=\"UserID Email\" name='un' required>\n");
      out.write("    <i class=\"fas fa-lock\"></i><br>\n");
      out.write("    <input type=\"text\" placeholder=\"password\" name='pw' required>\n");
      out.write("  <button name='submit' class='btn'>  submit </button>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    </form>\n");
      out.write("             <a href=\"forgetpassword.jsp\" ><button name='submit' class='btn'>  FORGET PASSWORD </button></a>\n");
      out.write("             </div>\n");
      out.write("  </div>   \n");
      out.write("        ");

            ServletLogin sc=new ServletLogin();
                String a=sc.a;
                 String b=request.getParameter("fn");
                 out.print(b);
                 out.print(a);
            String re=request.getParameter("submit");
            if(re!=null)
            {
             
        Connection connection = databaseop.getconnect();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String userid = request.getParameter("un");
        String password = request.getParameter("pw");

        try {
            // Load the database driver
           // Class.forName("com.mysql.jdbc.Driver");
           // connection = DriverManager.getConnection(connectionURL, "root", "1234");
            //Add the data into the database
            String sql = "SELECT Email FROM user_registration WHERE password = ? AND Email = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, userid);

            rs = preparedStatement.executeQuery();

            if(rs.next()) {
                // redirect or print but not both...
                out.println("log in successful");
                response.sendRedirect("User_profile.jsp");
            } else 
                  {
                   out.println("You are not valid");
                   String ab=rs.getString(1);
                   out.print(a);
            }
            }
            
        
        catch(Exception e) {
            System.out.println("Exception is: " + e);
        } finally {
         
            rs.close();
            preparedStatement.close();
            connection.close();
        }
            }
            
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");
      out.write("  ");
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
