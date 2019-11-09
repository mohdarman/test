<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bookies_databaseconnection.databaseop"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="cssfiles/homecss.css">      
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
           </head> 
    <body>
        <div class="all">
             <div class="menu" style="float: top; background-color: #000000;">
          <nav class="navigate"  style="background-color: #000000">
              
            <ul class="headerul">
              
               <li>  <a href='Home.jsp' class="active">HOME</a></li><hr>
                <li> <a href='registraion.jsp'>REGISTRATION</a></li><hr>
                   <li> <a href='LOGIN.jsp'>LOGIN</a></li><hr>
                  <li>  <a href='Exitting_seller.jsp'>USERS</a></li> 
                  <form class="example" action="">
  <input type="text" placeholder="Search.." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form> 
              </ul>
             </nav> 
        </div>
            <div class="centerdiv" stye="margin-top:100px; margin-bottom:100px;">
             <nav class="navigate">
            <a href="#"><img src='IMAGES/artsbook.jpg'></img></a>
            <a href="#"><img src='IMAGES/engineering book.jpg'></img></a>
            <a href="#"><img src='IMAGES/medical-books.jpg'></img></a>
            <a href="#"><img src='IMAGES/INTERMEDIATEBOOK.jpg'></img></a>
            <a href="#"><img src='IMAGES/download (1).jpg'></img></a>
            <a href="#"><img src='IMAGES/COMMERCE.jpg'></img></a>
            <a href="#"><img src='IMAGES/INTERMEDIATEBOOK.jpg'></img></a>
            <a href="#"><img src='IMAGES/9 AND 10.jpg'></img></a>
            <a href="#"><img src='IMAGES/banner_slider-ncert.png'></img></a>
            <a href="LOGIN.jsp"><img src='IMAGES/Entrance-Examination.jpg'></img></a>
        <% 
            Statement statement = null;
ResultSet rs = null;

           // ResultSet rs = null;
            Connection con=databaseop.getconnect();
            statement = con.createStatement();
            String quiry="select title from book";
           rs = statement.executeQuery(quiry);
           // rs=ps.executeQuery();
            while(rs.next())
            {%>
                 <a href="#"><img src='IMAGES/<%=rs.getString(1)%>' alt="Smiley face"></img></a>
           <% }
            rs.close();
            con.close();
            
        %>
            <nav>
            </div>
            <div class='footer'>
        <footer class="footer" style='margin-top: 800px;'>
  <div class="footer-left col-md-4 col-sm-6">
      <h2> About the website</h2> <p class="about"><span>THIS SITE IS UNDER WORKING CONDITION CURRENTLY THE DEVELOPER ARMAN AND BHUPENDER WORKING ON IT</span>
    </p>
    <div class="icons">
      <a href="#"><i class="fa fa-facebook"></i></a>
      <a href="#"><i class="fa fa-twitter"></i></a>
      <a href="#"><i class="fa fa-linkedin"></i></a>
      <a href="#"><i class="fa fa-google-plus"></i></a>
      <a href="#"><i class="fa fa-instagram"></i></a>
    </div>
  </div>
  <div class="footer-center col-md-4 col-sm-6">
    <div>
      <i class="fa fa-map-marker"></i>
      <p><span>Adress and Pincode</span> City, country</p>
    </div>
    <div>
      <i class="fa fa-phone"></i>
      <p> +91-9897652250</p>
    </div>
    <div>
      <i class="fa fa-envelope"></i>
      <p><a href="#"> arman041998@gmail.com</a></p>
    </div>
  </div>
  <div class="footer-right col-md-4 col-sm-6">
    <b>Website Name</b>
    <p class="menu">
      <a href="#"> Home</a> 
      <a href="#"> About</a> 
      <a href="#"> Services</a> 
      <a href="#"> Portfolio</a> 
      <a href="#"> News</a> 
      <a href="#"> Contact</a>
    </p>
    <p class="name"> THE BOOKIES.COM</p>
  </div>
            </div>
            </div>
</footer>
       
      
    </body>
</html>
