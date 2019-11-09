package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import bookies_databaseconnection.databaseop;

public final class registraion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssfiles/registration_login_css.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssfiles/homecss.css\">\n");
      out.write("        <style>\n");
      out.write("            @import \"https://use.fontawesome.com/releases/v5.5.0/css/all.css\";\n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("      <script> \n");
      out.write("function arman()                                    \n");
      out.write("{ \n");
      out.write("    var name = document.forms[\"RegForm\"][\"Name\"];               \n");
      out.write("    var email = document.forms[\"RegForm\"][\"EMail\"];    \n");
      out.write("    var phone = document.forms[\"RegForm\"][\"Telephone\"];  \n");
      out.write("    var what =  document.forms[\"RegForm\"][\"Subject\"];  \n");
      out.write("    var password = document.forms[\"RegForm\"][\"Password\"];  \n");
      out.write("    var address = document.forms[\"RegForm\"][\"Address\"];  \n");
      out.write("   \n");
      out.write("    if (name.value == \"\")                                  \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter your name.\"); \n");
      out.write("        name.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    if (address.value == \"\")                               \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter your address.\"); \n");
      out.write("        name.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("       \n");
      out.write("    if (email.value == \"\")                                   \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter a valid e-mail address.\"); \n");
      out.write("        email.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    if (email.value.indexOf(\"@\", 0) < 0)                 \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter a valid e-mail address.\"); \n");
      out.write("        email.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    if (email.value.indexOf(\".\", 0) < 0)                 \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter a valid e-mail address.\"); \n");
      out.write("        email.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    if (phone.value == \"\")                           \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter your telephone number.\"); \n");
      out.write("        phone.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    if (password.value == \"\")                        \n");
      out.write("    { \n");
      out.write("        window.alert(\"Please enter your password\"); \n");
      out.write("        password.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    if (what.selectedIndex < 1)                  \n");
      out.write("    { \n");
      out.write("        alert(\"Please enter your course.\"); \n");
      out.write("        what.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("   \n");
      out.write("    return true; \n");
      out.write("}</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"menu\" style=\"float: top; background-color: rgba(0,0,100,.5);\">\n");
      out.write("          <nav class=\"navigate\">\n");
      out.write("            <ul class=\"headerul\">\n");
      out.write("                <li>   <a href='Home.jsp' class=\"active\">HOME</a></li><hr>\n");
      out.write("                   <li> <a href='LOGIN.jsp'>LOGIN</a></li><hr>\n");
      out.write("                  <li>  <a href='Exitting_seller.jsp'>EXISTING SELLER</a></li>\n");
      out.write("              </ul>\n");
      out.write("             </nav> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"login-box\" style='background-color: black; border-radius: 5px;'>\n");
      out.write("  <h1>SIGN UP</h1>\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("      <form method=\"post\" action=\"registraion.jsp\" name=\"RegForm\" onsubmit=\"return arman();\">\n");
      out.write("     <i class=\"fas fa-user\"></i>\n");
      out.write("    <input type=\"text\" placeholder=\"Username\" name=\"NAME\" required>\n");
      out.write("    <i class=\"fas fa-lock\"></i>\n");
      out.write("    <input type=\"password\" placeholder=\"your Password\" name=\"password\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercaseletter, and at least 8 or more characters\" required>\n");
      out.write("    <i class=\"fa fa-address-book\"></i>\n");
      out.write("    <input type=\"password\" placeholder=\"Conform Password\" name=\"cpassword\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercaseletter, and at least 8 or more characters\" required>\n");
      out.write("    <i class=\"fa fa-address-book\"></i>\n");
      out.write("    <input type=\"email\" placeholder=\"Mail address\" name=\"email\" pattern=\"[^ @]*@[^ @]*\" required>\n");
      out.write("    <i class=\"fa fa-address-book\"></i>\n");
      out.write("    <input type=\"text\" size=65 name=\"Address\" required placeholder=\"Security answers\">\n");
      out.write("     <i class=\"fa fa-phone\"></i>\n");
      out.write("    <input type=\"text\" size=65 name=\"Telephone\" placeholder=\"phone no.\" required>\n");
      out.write("     <input type=\"text\" size=65 name=\"city\" placeholder=\"your city\" required>\n");
      out.write("       <input type=\"number\" size=65 name=\"zipcode\" placeholder=\"your zipcode\" required>\n");
      out.write("    <button class=\"btn\" value=\"SIGN UP\" name=\"check\"> SIGN UP</button>\n");
      out.write("  </form>\n");
      out.write("   </div>\n");
      out.write("</div><h1 style=\"color:white;\">\n");
      out.write("        ");

    
     String check=request.getParameter("check");
     PreparedStatement ps;
     Statement statement = null;
ResultSet rs = null;
     //out.print("form"+check);
Connection con=databaseop.getconnect();
if(check!=null){
              String name=request.getParameter("NAME");
            String password=request.getParameter("password");
             String cpassword=request.getParameter("cpassword");
            String telephone=request.getParameter("Telephone");
            String address=request.getParameter("Address");
            String email=request.getParameter("email");
             String city=request.getParameter("city");
              int zipcode=Integer.parseInt(request.getParameter("zipcode"));
            if(cpassword.equals(password))
            {
            if(con!=null){
              //  out.print("connection done");
                request.getParameter("email").toString();
                // System.out.println(email);
                   String data ="";
                 Statement st=con.createStatement();
                rs=st.executeQuery("select * from user_registration where Email='"+email+"'");
                int count=0;
                 while(rs.next())
           {

                count++;
            }

        if(count>0){
                data="Email-ID already exists! goo and login with your username and password";
                out.print(data);
           }
                else
             {
               int a=bookies_databaseconnection.databaseop.insertdata(name, password, email, address,telephone,zipcode,city);
               if(a!=0)
                {
                    out.print("you successfully register go and log in");
                }
               else{
                   out.print("data inserted");
               
               }
            }
               }
           else
            {
                out.print("connection not done");
            }     
                
            }
            else
            {
                out.print("ERROR:-your password && confirm paasword field are different ");
            }
}

      out.write("\n");
      out.write("</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
