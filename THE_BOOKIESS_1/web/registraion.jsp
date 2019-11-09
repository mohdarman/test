<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bookies_databaseconnection.databaseop"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="cssfiles/registration_login_css.css">
        <link rel="stylesheet" type="text/css" href="cssfiles/homecss.css">
        <style>
            @import "https://use.fontawesome.com/releases/v5.5.0/css/all.css";
            
            </style>
      <script> 
function arman()                                    
{ 
    var name = document.forms["RegForm"]["Name"];               
    var email = document.forms["RegForm"]["EMail"];    
    var phone = document.forms["RegForm"]["Telephone"];  
    var what =  document.forms["RegForm"]["Subject"];  
    var password = document.forms["RegForm"]["Password"];  
    var address = document.forms["RegForm"]["Address"];  
   
    if (name.value == "")                                  
    { 
        window.alert("Please enter your name."); 
        name.focus(); 
        return false; 
    } 
   
    if (address.value == "")                               
    { 
        window.alert("Please enter your address."); 
        name.focus(); 
        return false; 
    } 
       
    if (email.value == "")                                   
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (email.value.indexOf("@", 0) < 0)                 
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (email.value.indexOf(".", 0) < 0)                 
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (phone.value == "")                           
    { 
        window.alert("Please enter your telephone number."); 
        phone.focus(); 
        return false; 
    } 
   
    if (password.value == "")                        
    { 
        window.alert("Please enter your password"); 
        password.focus(); 
        return false; 
    } 
   
    if (what.selectedIndex < 1)                  
    { 
        alert("Please enter your course."); 
        what.focus(); 
        return false; 
    } 
   
    return true; 
}</script>
    </head>
    <body>
         <div class="menu" style="float: top; background-color: rgba(0,0,100,.5);">
          <nav class="navigate">
            <ul class="headerul">
                <li>   <a href='Home.jsp' class="active">HOME</a></li><hr>
                   <li> <a href='LOGIN.jsp'>LOGIN</a></li><hr>
                  <li>  <a href='Exitting_seller.jsp'>EXISTING SELLER</a></li>
              </ul>
             </nav> 
        </div>
        <div class="login-box" style='background-color: black; border-radius: 5px;'>
  <h1>SIGN UP</h1>
  <div class="textbox">
      <form method="post" action="registraion.jsp" name="RegForm" onsubmit="return arman();">
     <i class="fas fa-user"></i>
    <input type="text" placeholder="Username" name="NAME" required>
    <i class="fas fa-lock"></i>
    <input type="password" placeholder="your Password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercaseletter, and at least 8 or more characters" required>
    <i class="fa fa-address-book"></i>
    <input type="password" placeholder="Conform Password" name="cpassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercaseletter, and at least 8 or more characters" required>
    <i class="fa fa-address-book"></i>
    <input type="email" placeholder="Mail address" name="email" pattern="[^ @]*@[^ @]*" required>
    <i class="fa fa-address-book"></i>
    <input type="text" size=65 name="Address" required placeholder="Security answers">
     <i class="fa fa-phone"></i>
    <input type="text" size=65 name="Telephone" placeholder="phone no." required>
    <button class="btn" value="SIGN UP" name="check"> SIGN UP</button>
  </form>
   </div>
</div><h1 style="color:white;">
        <%
    
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
               int a=bookies_databaseconnection.databaseop.insertdata(name, password, email, address,telephone);
               if(a!=0)
                {
                    out.print("you successfully register go and log in");
                }
               else{
                   out.print("data inserted");
                  request.setAttribute("email", email);
                                response.sendRedirect("invalidLogin.jsp");
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
%>
</h1>
    </body>
</html>

