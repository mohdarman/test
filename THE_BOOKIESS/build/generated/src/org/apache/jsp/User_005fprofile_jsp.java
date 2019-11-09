package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import bookies_databaseconnection.databaseop;
import bookies_databaseconnection.UserBean;

public final class User_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("        <title>USERPROFILE</title>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"cssfiles/homecss.css\"> \n");
      out.write("            <script>\n");
      out.write("function shows_form_part(n){\n");
      out.write("  var i = 1, p = document.getElementById(\"form_part\"+1);\n");
      out.write("  while (p !== null){\n");
      out.write("    if (i === n){\n");
      out.write("      p.style.display = \"\";\n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("      p.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("    i++;\n");
      out.write("  p = document.getElementById(\"form_part\"+i);\n");
      out.write("  }\n");
      out.write("  i=1;\n");
      out.write("  p=document.getElementById(\"form_part\"+i);\n");
      out.write("}\n");
      out.write("function calc_sum() {\n");
      out.write("  \n");
      out.write("  var aa=alert(\"your data is submited\");\n");
      out.write("  \n");
      out.write("}\n");
      out.write(" </script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"> \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"sty.css\">\n");
      out.write("    <style>\n");
      out.write("    \n");
      out.write("     :root{ --main-color: #e74c3c; }\n");
      out.write(".product-grid{\n");
      out.write("    font-family: 'Roboto', sans-serif;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".product-grid .product-image{\n");
      out.write("    overflow: hidden;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".product-grid .product-image:before{\n");
      out.write("    content: \"\";\n");
      out.write("    background: rgba(0,0,0,0.3);\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    opacity: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    z-index: 1;\n");
      out.write("    transition: all 0.4s ease-out 0s;\n");
      out.write("}\n");
      out.write(".product-grid:hover .product-image:before{ opacity: 1; }\n");
      out.write(".product-grid .product-image a{ display: block; }\n");
      out.write(".product-grid .product-image img{\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("}\n");
      out.write(".product-image .pic-1{\n");
      out.write("    opacity: 1;\n");
      out.write("    backface-visibility: hidden;\n");
      out.write("    transition: all 0.4s ease-out 0s;\n");
      out.write("}\n");
      out.write(".product-grid:hover .product-image .pic-1{ opacity: 0; }\n");
      out.write(".product-image .pic-2{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    opacity: 0;\n");
      out.write("    backface-visibility: hidden;\n");
      out.write("    transform: scale(3);\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    transition: all 0.4s ease-out 0s;\n");
      out.write("}\n");
      out.write(".product-grid:hover .product-image .pic-2 {\n");
      out.write("    opacity: 1;\n");
      out.write("    transform: scale(1);\n");
      out.write("}\n");
      out.write(".product-image .product-trend-label,\n");
      out.write(".product-image .product-discount-label{\n");
      out.write("    content: \"\";\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: #2ecc71;\n");
      out.write("    font-size: 12px;\n");
      out.write("    line-height: 28px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    text-align: center;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    padding: 0 7px;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 12px;\n");
      out.write("    left: 12px;\n");
      out.write("    z-index: 3;\n");
      out.write("}\n");
      out.write(".product-image .product-discount-label{\n");
      out.write("    background-color: var(--main-color);\n");
      out.write("    left: auto;\n");
      out.write("    right: 12px;\n");
      out.write("}\n");
      out.write(".product-grid .social {\n");
      out.write("    padding: 0;\n");
      out.write("    margin: 0;\n");
      out.write("    list-style: none;\n");
      out.write("    transform: translateY(-50%);\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 10px;\n");
      out.write("    z-index: 4;\n");
      out.write("}\n");
      out.write(".product-grid .social li {\n");
      out.write("    margin: 0 0 12px;\n");
      out.write("    opacity: 0;\n");
      out.write("    transform: translateX(-60px);\n");
      out.write("    transition: transform .3s ease-out 0s;\n");
      out.write("}\n");
      out.write(".product-grid:hover .social li {\n");
      out.write("    opacity: 1;\n");
      out.write("    transform: translateX(0);\n");
      out.write("}\n");
      out.write(".product-grid:hover .social li:nth-child(2){ transition-delay: 0.1s; }\n");
      out.write(".product-grid:hover .social li:nth-child(3){ transition-delay: 0.2s; }\n");
      out.write(".product-grid:hover .social li:nth-child(4){ transition-delay: 0.3s; }\n");
      out.write(".product-grid .social li a {\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 22px;\n");
      out.write("    transition: all 0.3s;\n");
      out.write("}\n");
      out.write(".product-grid .social li a:hover { color: var(--main-color); }\n");
      out.write(".product-grid .social li a:before,\n");
      out.write(" .product-grid .social li a:after{\n");
      out.write("    content: attr(data-tip);\n");
      out.write("    color: #000;\n");
      out.write("    background: #fff;\n");
      out.write("    font-size: 14px;\n");
      out.write("    padding: 5px 10px;\n");
      out.write("    white-space: nowrap;\n");
      out.write("    display: none;\n");
      out.write("    transform: translateY(-50%);\n");
      out.write("    position: absolute;\n");
      out.write("    left: 33px;\n");
      out.write("    top: 50%;\n");
      out.write("    transition: all 0.3s;\n");
      out.write("}\n");
      out.write(".product-grid .social li a:after{\n");
      out.write("    content: '';\n");
      out.write("    background: linear-gradient(-45deg, #fff 49%, transparent 50%);\n");
      out.write("    width: 10px;\n");
      out.write("    height: 10px;\n");
      out.write("    top: 40%;\n");
      out.write("    left: 20px;\n");
      out.write("}\n");
      out.write(".product-grid .social li a:hover:before,\n");
      out.write(".product-grid .social li a:hover:after{\n");
      out.write("      display: block;\n");
      out.write("}\n");
      out.write(".product-grid .product-content{ padding: 12px 0; }\n");
      out.write(".product-grid .title{\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: 400;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("    margin: 0 0 5px;\n");
      out.write("}\n");
      out.write(".product-grid .title a{ color: #959595; }\n");
      out.write(".product-grid .title a:hover{ color: var(--main-color); }\n");
      out.write(".product-grid .price{\n");
      out.write("    color: #333;\n");
      out.write("    font-size: 14px;\n");
      out.write("    font-weight: 400;\n");
      out.write("}\n");
      out.write(".product-grid .price span{\n");
      out.write("    color: #333;\n");
      out.write("    text-decoration: line-through;\n");
      out.write("    margin-right: 3px;\n");
      out.write("}\n");
      out.write(".product-grid .price.discount{ color: var(--main-color); }\n");
      out.write("@media only screen and (max-width:990px){\n");
      out.write("    .product-grid{ margin-bottom: 30px; }\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <style type=\"text/css\">\n");
      out.write("  *{\n");
      out.write("   margin: 0;\n");
      out.write("   padding: 0;\n");
      out.write("   font-family: sans-serif;\n");
      out.write("   color: rgba(230,230,230,0.9);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  #sidebar{\n");
      out.write("   position: fixed;\n");
      out.write("   width: 200px;\n");
      out.write("   height: 100%;\n");
      out.write("   background:#151719;\n");
      out.write("   left: -200px;\n");
      out.write("   transition: all 500ms linear;\n");
      out.write("  }\n");
      out.write("  #sidebar.active{\n");
      out.write("   left:0px;\n");
      out.write("  }\n");
      out.write("  #sidebar ul li{\n");
      out.write("   color: rgba(230,230,230,0.9);\n");
      out.write("   list-style: none;\n");
      out.write("   padding: 15px 10px;\n");
      out.write("   border-bottom: 1px solid rgba(100,100,100,0.3);\n");
      out.write("   text-align: center;\n");
      out.write("  }\n");
      out.write("  #sidebar .toggle-btn{\n");
      out.write("   position: absolute;\n");
      out.write("   left: 230px;\n");
      out.write("   top: 20px;\n");
      out.write("  }\n");
      out.write("  #sidebar .toggle-btn span{\n");
      out.write("   display: block;\n");
      out.write("   width: 30px;\n");
      out.write("   height: 5px;\n");
      out.write("   background: white;\n");
      out.write("   margin: 5px 0px;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  a{\n");
      out.write("      list-style: none;\n");
      out.write("      text-decoration: none;\n");
      out.write("  }\n");
      out.write("  a:hover\n");
      out.write("  {\n");
      out.write("      background-color: #151719;\n");
      out.write("  }\n");
      out.write("   button\n");
      out.write("  {\n");
      out.write("      background-color:#151719;\n");
      out.write("      border:none;\n");
      out.write("      color: rgba(230,230,230,0.9);\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("  ul form  a li button:hover\n");
      out.write("  {\n");
      out.write("      background-color: #151719;\n");
      out.write("  }\n");
      out.write("  input{\n");
      out.write("      height:50px;\n");
      out.write("      width: 100%;\n");
      out.write("      background-color: #151719;  \n");
      out.write("      border:none;\n");
      out.write("           color: rgba(230,230,230,0.9);\n");
      out.write("\n");
      out.write("       border-bottom: 5px solid red;\n");
      out.write("  }\n");
      out.write(" </style>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("  function toggleSidebar(){\n");
      out.write("   document.getElementById(\"sidebar\").classList.toggle('active');\n");
      out.write("  }\n");
      out.write("  function register_book()\n");
      out.write("  {\n");
      out.write("  \n");
      out.write("  }\n");
      out.write(" </script>\n");
      out.write(" <script language=\"javascript\">\n");
      out.write("window.history.forward(1);\n");
      out.write("browser.cache.offline.enable = false;\n");
      out.write("function noBack() { window.history.forward(1);\n");
      out.write("\n");
      out.write("}\n");
      out.write("//***Get what is above onto one line***\n");
      out.write("\n");
      out.write("self.close()\n");
      out.write("//function disableBackButton()\n");
      out.write("//{\n");
      out.write("//window.history.forward(1);\n");
      out.write("//}\n");
      out.write("//setTimeout(\"disableBackButton()\", 0);\n");
      out.write("</script>\n");
      out.write(" <div id=\"sidebar\" class=\"userprofile\">\n");
      out.write("  <div class=\"toggle-btn\" onclick=\"toggleSidebar()\"><a>\n");
      out.write("   <span></span>\n");
      out.write("   <span></span>\n");
      out.write("   <span></span>\n");
      out.write("  </a>\n");
      out.write("  </div>\n");
      out.write("     ");
 UserBean currentUser = (UserBean)(session.getAttribute("currentSessionUser"));
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("       \n");
      out.write("  <ul style=\"margin-top:100px\">\n");
      out.write("   \n");
      out.write("      <a href=\"#\"><li>  ");
      out.print( currentUser.getLastName());
      out.write("</li></a>\n");
      out.write("         <a href=\"#\"><li> ");
      out.print( currentUser.getEmail());
      out.write("</li></a>\n");
      out.write("      <a href=\"#\">  <li>\n");
      out.write("                  <div id=\"\" style=\"\">\n");
      out.write("                       <button type=\"button\" onclick=\"shows_form_part(2)\">Register Books</button>\n");
      out.write("                      <div>\n");
      out.write("           \n");
      out.write("                          <form ENCTYPE=\"multipart/form-data\" action=\"\" method=\"post\">\n");
      out.write("<div id=\"form_part1\" style=\"display: none;\"><br>\n");
      out.write("   \n");
      out.write("  <br>\n");
      out.write("  BOOK PHOTOS\n");
      out.write("  <input  TYPE=\"file\" NAME=\"file\" value=\"\" id=\"num4\" placeholder=\"choose photo\"   style=\"width:100%;\"><br>\n");
      out.write(" \n");
      out.write("  <button type=\"submit\" onclick=\"shows_form_part(2)\" name=\"abc\">NEXT &raquo</button>\n");
      out.write("</div>\n");
      out.write("                              </form>\n");
      out.write("                          <form>\n");
      out.write("    <div id=\"form_part2\" style=\"display:none;\">\n");
      out.write("  YOUR BOOK TITLE\n");
      out.write("  <input type=\"text\" value=\"\" id=\"num1\" placeholder=\"Eneter book title\" name=\"book_title\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(3)\">NEXT&raquo</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <div id=\"form_part3\" style=\"display:none;\">\n");
      out.write("  <br>\n");
      out.write("  AUTHER_NAME\n");
      out.write("  <input type=\"text\" value=\"\" id=\"num2\" placeholder=\"Enter auther namme\" name=\"auther_name\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(2)\">&laquoBACK</button>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(4)\"> NEXT &raquo</button>\n");
      out.write("</div>\n");
      out.write("                          <div id=\"form_part4\" style=\"display:none;\">\n");
      out.write("  <br>\n");
      out.write("  BOOK DESCRIPTION\n");
      out.write("   <input type=\"text\" value=\"\" id=\"num3\" placeholder=\"description of book\" name=\"description\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(3)\">  &laquo BACK</button>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(5)\">  NEXT &raquo</button> \n");
      out.write("</div>\n");
      out.write("                         <div id=\"form_part5\" style=\"display:none\">\n");
      out.write("  PRICE<br>\n");
      out.write("  <input type=\"number\" value=\"\" id=\"num5\" placeholder=\"price\" name=\"price\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(4)\"> &laquo BACK||</button>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(6)\">NEXT &raquo </button>\n");
      out.write("</div>\n");
      out.write("                          <div id=\"form_part6\" style=\"display:none\">\n");
      out.write("  PUBLISH DATE<br>\n");
      out.write("  <input type=\"date\" value=\"\" id=\"num6\" placeholder=\"date\" name=\"date\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(5)\"> &laquo BACK||</button>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(7)\">NEXT &raquo </button>\n");
      out.write("</div>\n");
      out.write("                          <div id=\"form_part7\" style=\"display:none\">\n");
      out.write("  CATEGORYY<br>\n");
      out.write("  <input type=\"text\" value=\"\" id=\"num7\" placeholder=\"category\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(6)\"> &laquo BACK||</button>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(8)\">NEXT &raquo </button>\n");
      out.write("</div>\n");
      out.write("<div id=\"form_part8\" style=\"display:none\">\n");
      out.write("  LAST UPDATE ON<br>\n");
      out.write("  <input type=\"number\" value=\"\" id=\"num8\" placeholder=\"price\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(7)\"> &laquo BACK||</button>\n");
      out.write("  <button type=\"submit\" onclick=\"shows_form_part(9)\" name=\"submit\">Submit||</button>\n");
      out.write("  //<button type=\"button\" onclick=\"shows_form_part(9)\">&raquo WANTS TO REFRESH</button>\n");
      out.write("</div>\n");
      out.write("                            \n");
      out.write(" \n");
      out.write("            ");

            try
            {
                String a=currentUser.getEmail();
                
                ResultSet rs=null;
                Statement statement = null;
                          String submit=request.getParameter("submit");
                          if(submit!=null)
                          {
                          Connection con=databaseop.getconnect();
                          PreparedStatement ps=null;
                          String quiry="insert into book(auther,description,price,Email) values(?,?,?,?)";
                          ps=con.prepareStatement(quiry);
                          statement = con.createStatement();
                          ps.setString(1,request.getParameter("auther_name"));
                            ps.setString(2,request.getParameter("description"));
                              ps.setString(3,request.getParameter("price"));
                                ps.setString(4, a);
                               int o=ps.executeUpdate();
                           //    ps.close();
                             ps=null;
                               if(o!=0)
                               {
                                   String email=null;
                                   int book_id=0;
                                   out.print("data inserted successfully");
                                   String quiry1="select book_id from book where Email= ?";
                                         ps=con.prepareStatement(quiry1);
                                         ps.setString(1, a);
                                  rs = ps.executeQuery();
                                while(rs.next())
                                {
                                    book_id=rs.getInt(1);
                                 //  email= rs.getString(2);
                                }
                                out.print("your book id is"+book_id);
                               session.setAttribute("book_id",book_id);
                                response.sendRedirect("imageinsert.jsp");
                                
      out.write("\n");
      out.write("                           <div id=\"form_part9\" style=\"display:none\">\n");
      out.write("  LAST UPDATE ON<br>\n");
      out.write("  <input type=\"number\" value=\"\" id=\"num9\" placeholder=\"price\"><br>\n");
      out.write("  <button type=\"button\" onclick=\"shows_form_part(1)\"> &laquo BACK||</button>\n");
      out.write("</div>\n");
      out.write("                                ");

                               }
                          }
            }
            catch(Exception e )
            {
                out.print(e);
            }
                          
      out.write("     \n");
      out.write("                          </form>\n");
      out.write("</li></a>\n");
      out.write("       <a href=\"#\"> <li>Sell</li></a>\n");
      out.write("       <a href=\"#\"> <li>Buy</li></a>\n");
      out.write("       <a href=\"#\"><li> EDIT</li></a>\n");
      out.write("       <form method=\"post\" action=\"\">\n");
      out.write("           <a href=\"#\"> <li><button name=\"logout\" style=\"\"> LOGOUT</button></li></a>\n");
      out.write("       </form>\n");
      out.write("       </ul>\n");
      out.write("     \n");
      out.write(" </div>\n");
      out.write("                           <div class=\"all\" >\n");
      out.write("            <div class=\"centerdiv\" style=\"margin-bottom:100px;margin-left: 200px;\">\n");
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
      out.write("              ");
 
            Statement statement = null;
ResultSet rs1 = null;

           // ResultSet rs = null;
            Connection con=databaseop.getconnect();
            statement = con.createStatement();
            String quiry="select title,auther,price from book";
           rs1 = statement.executeQuery(quiry);
           // rs=ps.executeQuery();
            while(rs1.next())
            {
      out.write("\n");
      out.write("           <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("     \n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("            <div class=\"product-grid\">\n");
      out.write("                <div class=\"product-image\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"pic-1\" src=\"IMAGES/");
      out.print(rs1.getString(1));
      out.write("\" alt=\"Smiley face\">\n");
      out.write("                        <img class=\"pic-2\" src=\"IMAGES/");
      out.print(rs1.getString(1));
      out.write("\" alt=\"Smiley face\">\n");
      out.write("                    </a>\n");
      out.write("                    <span class=\"product-trend-label\">Trend</span>\n");
      out.write("                    <span class=\"product-discount-label\">-20%</span>\n");
      out.write("                    <ul class=\"social\">\n");
      out.write("                        <li><a href=\"#\" data-tip=\"Add to Cart\"><i class=\"fa fa-shopping-cart\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" data-tip=\"Wishlist\"><i class=\"fa fa-heart\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" data-tip=\"Compare\"><i class=\"fa fa-random\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" data-tip=\"Quick View\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-content\">\n");
      out.write("                    <h3 class=\"title\"><a href=\"#\">/");
      out.print(rs1.getString(1));
      out.write("</a></h3>\n");
      out.write("                    <div class=\"price discount\"><span></span>/");
      out.print(rs1.getString(2));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("         </div> \n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("       \n");
      out.write("           \n");
      out.write("           ");
 }
            rs1.close();
            con.close();
            
        
      out.write("\n");
      out.write("            <nav>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        ");

    
Connection conn=databaseop.getconnect();
PreparedStatement pstmt = null;
ResultSet rs=null;

            String a=request.getParameter("logout");
   if(a!=null)
   {
request.getSession().invalidate();

response.setHeader("Cache-Control","no-store"); //HTTP 1.1
response.setHeader("Cache-Control","no-cache");
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

response.sendRedirect("LOGIN.jsp");
   } 

      out.write("\n");
      out.write("  \n");
      out.write(" <div class=\"userprofile\" style=\"float:left;\">\n");
      out.write("      </body>\n");
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
