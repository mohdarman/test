<%-- 
    Document   : LOGIN
    Created on : 29 Sep, 2019, 4:01:51 PM
    Author     : arman
--%>
<%@page import="servlets_files.ServletLogin"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="bookies_databaseconnection.databaseop"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOG IN PAGE</title>
        <style>
            @import "https://use.fontawesome.com/releases/v5.5.0/css/all.css";
            </style>
            <link rel="stylesheet" type="text/css" href="cssfiles/registration_login_css.css">
             <link rel="stylesheet" type="text/css" href="cssfiles/homecss.css">
    </head>
    
         <div class="menu" style="float: top; background-color: rgba(0,0,0,.5);">
          <nav class="navigate">
            <ul class="headerul">
                <li>   <a href='Home.jsp' class="active">HOME</a></li><hr>        
                <li> <a href='registraion.jsp'>REGISTRATION</a></li><hr>
                  <li>  <a href='Exitting_seller.jsp'>EXISTING SELLER</a></li>
              </ul>
             </nav> 
        </div>
        <div class="login-box" style='background-color: black;height:50%;border-radius: 5px;width: 30%'>
         <h1>Login</h1>
         <div class='textbox'>
      <form action="ServletLogin" method='post'>
          <i class="fas fa-user"></i>
          <input type="text" placeholder="UserID Email" name='un' required>
    <i class="fas fa-lock"></i><br>
    <input type="text" placeholder="password" name='pw' required>
  <button name='submit' class='btn'>  submit </button>
  
  
    </form>
             <a href="forgetpassword.jsp" ><button name='submit' class='btn'>  FORGET PASSWORD </button></a>
             </div>
  </div>   
        <%
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
           // System.out.println("Exception is: " + e);
        } finally {
         
            rs.close();
            preparedStatement.close();
            connection.close();
        }
            }
            %>
        
    

  