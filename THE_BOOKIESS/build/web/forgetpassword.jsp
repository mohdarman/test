<%-- 
    Document   : forgetpassword
    Created on : 23 Oct, 2019, 10:16:14 AM
    Author     : arman
--%>

<%@page import="java.sql.Connection"%>
<%@page import="bookies_databaseconnection.databaseop"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>forget password</title>
         <link rel="stylesheet" type="text/css" href="cssfiles/registration_login_css.css">
        <link rel="stylesheet" type="text/css" href="cssfiles/homecss.css">    
        <style>
            #formdiv
            {
                
            }
            form input{
                
            }
        </style>
    </head>
    <body>
      
        <div class="login-box" style="background-color: rgba(0,0,100,0.5);">
        <h1> Forget password</h1>
        <div class="textbox">
        <form action="" method="post">
            -<input type="text" name="email" placeholder="email" required=""/>
            <input type="text" name="password" placeholder="new password " required=""/>
            <input type="text" name="conformpassword" placeholder="conform password" required=""/>
            <input type="text" name="security" placeholder="security answer" required=""/>
           <button class="btn" type="submit" name="submit"> send quiry</button>

</form>
            </div>
        </div>
        
      <%
          out.print("hello");
          if(request.getParameter("submit")!=null)
          {
              
          
try
{
    request.getParameter("email");
     String Password=request.getParameter("password");
       String cpassword=request.getParameter("conformpassword");
      
       request.getParameter("email");
       if(Password.equals(cpassword))
       {
Connection con=databaseop.getconnect();
Statement st=con.createStatement();
String email=request.getParameter("email");
String strQuery = "SELECT security_naswer , Email FROM user_registration where email='"+email+"'";
ResultSet rs = st.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);
if(Countrow.equals("1")){
/*mail code
paste your mail code here
------------------
Mail code*/
out.println("Password send to your email id successfully !");
}
else{
out.println("Invalid Email Id !");
}
       }
       else
       {
            out.print(" your password and conform password field does'n match");
       }
}
catch (Exception e){
e.printStackTrace();
}

    }
%>

    </body>
</html>
