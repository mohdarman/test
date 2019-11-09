<%-- 
    Document   : User_profile
    Created on : 22 Oct, 2019, 6:21:48 PM
    Author     : arman
--%>


<%@page import="java.sql.Statement"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.DataInputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bookies_databaseconnection.databaseop"%>
<%@page import="bookies_databaseconnection.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USERPROFILE</title>
            <link rel="stylesheet" type="text/css" href="cssfiles/homecss.css"> 
            <script>
function shows_form_part(n){
  var i = 1, p = document.getElementById("form_part"+1);
  while (p !== null){
    if (i === n){
      p.style.display = "";
    }
    else{
      p.style.display = "none";
    }
    i++;
  p = document.getElementById("form_part"+i);
  }
  i=1;
  p=document.getElementById("form_part"+i);
}
function calc_sum() {
  
  var aa=alert("your data is submited");
  
}
 </script>
    </head>
    <body>
       <style type="text/css">
  *{
   margin: 0;
   padding: 0;
   font-family: sans-serif;
   color: rgba(230,230,230,0.9);
  }

  #sidebar{
   position: fixed;
   width: 200px;
   height: 100%;
   background:#151719;
   left: -200px;
   transition: all 500ms linear;
  }
  #sidebar.active{
   left:0px;
  }
  #sidebar ul li{
   color: rgba(230,230,230,0.9);
   list-style: none;
   padding: 15px 10px;
   border-bottom: 1px solid rgba(100,100,100,0.3);
   text-align: center;
  }
  #sidebar .toggle-btn{
   position: absolute;
   left: 230px;
   top: 20px;
  }
  #sidebar .toggle-btn span{
   display: block;
   width: 30px;
   height: 5px;
   background: white;
   margin: 5px 0px;

  }
  a{
      list-style: none;
      text-decoration: none;
  }
  a:hover
  {
      background-color: #151719;
  }
   button
  {
      background-color:#151719;
      border:none;
      color: rgba(230,230,230,0.9);
      
  }
  ul form  a li button:hover
  {
      background-color: #151719;
  }
  input{
      height:50px;
      width: 100%;
      background-color: #151719;  
      border:none;
           color: rgba(230,230,230,0.9);

       border-bottom: 5px solid red;
  }
 </style>
 <script type="text/javascript">
  function toggleSidebar(){
   document.getElementById("sidebar").classList.toggle('active');
  }
  function register_book()
  {
  
  }
 </script>
 <script language="javascript">
window.history.forward(1);
browser.cache.offline.enable = false;
function noBack() { window.history.forward(1);

}
//***Get what is above onto one line***

self.close()
//function disableBackButton()
//{
//window.history.forward(1);
//}
//setTimeout("disableBackButton()", 0);
</script>
 <div id="sidebar" class="userprofile">
  <div class="toggle-btn" onclick="toggleSidebar()"><a>
   <span></span>
   <span></span>
   <span></span>
  </a>
  </div>
     <% UserBean currentUser = (UserBean)(session.getAttribute("currentSessionUser"));%>
			
       
  <ul style="margin-top:100px">
   
      <a href="#"><li>  <%= currentUser.getLastName()%></li></a>
         <a href="#"><li> <%= currentUser.getEmail()%></li></a>
      <a href="#">  <li>
                  <div id="" style="">
                       <button type="button" onclick="shows_form_part(2)">Register Books</button>
                      <div>
           
                          <form ENCTYPE="multipart/form-data" action="" method="post">
<div id="form_part1" style="display: none;"><br>
   
  <br>
  BOOK PHOTOS
  <input  TYPE="file" NAME="file" value="" id="num4" placeholder="choose photo"   style="width:100%;"><br>
 
  <button type="submit" onclick="shows_form_part(2)" name="abc">NEXT &raquo</button>
</div>
                              </form>
                          <form>
    <div id="form_part2" style="display:none;">
  YOUR BOOK TITLE
  <input type="text" value="" id="num1" placeholder="Eneter book title" name="book_title"><br>
  <button type="button" onclick="shows_form_part(3)">NEXT&raquo</button>
</div>

 <div id="form_part3" style="display:none;">
  <br>
  AUTHER_NAME
  <input type="text" value="" id="num2" placeholder="Enter auther namme" name="auther_name"><br>
  <button type="button" onclick="shows_form_part(2)">&laquoBACK</button>
  <button type="button" onclick="shows_form_part(4)"> NEXT &raquo</button>
</div>
                          <div id="form_part4" style="display:none;">
  <br>
  BOOK DESCRIPTION
   <input type="text" value="" id="num3" placeholder="description of book" name="description"><br>
  <button type="button" onclick="shows_form_part(3)">  &laquo BACK</button>
  <button type="button" onclick="shows_form_part(5)">  NEXT &raquo</button> 
</div>
                         <div id="form_part5" style="display:none">
  PRICE<br>
  <input type="number" value="" id="num5" placeholder="price" name="price"><br>
  <button type="button" onclick="shows_form_part(4)"> &laquo BACK||</button>
  <button type="button" onclick="shows_form_part(6)">NEXT &raquo </button>
</div>
                          <div id="form_part6" style="display:none">
  PUBLISH DATE<br>
  <input type="date" value="" id="num6" placeholder="date" name="date"><br>
  <button type="button" onclick="shows_form_part(5)"> &laquo BACK||</button>
  <button type="button" onclick="shows_form_part(7)">NEXT &raquo </button>
</div>
                          <div id="form_part7" style="display:none">
  CATEGORYY<br>
  <input type="text" value="" id="num7" placeholder="category"><br>
  <button type="button" onclick="shows_form_part(6)"> &laquo BACK||</button>
  <button type="button" onclick="shows_form_part(8)">NEXT &raquo </button>
</div>
<div id="form_part8" style="display:none">
  LAST UPDATE ON<br>
  <input type="number" value="" id="num8" placeholder="price"><br>
  <button type="button" onclick="shows_form_part(7)"> &laquo BACK||</button>
  <button type="submit" onclick="shows_form_part(9)" name="submit">Submit||</button>
  //<button type="button" onclick="shows_form_part(9)">&raquo WANTS TO REFRESH</button>
</div>
                            
 
            <%
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
                                %>
                           <div id="form_part9" style="display:none">
  LAST UPDATE ON<br>
  <input type="number" value="" id="num9" placeholder="price"><br>
  <button type="button" onclick="shows_form_part(1)"> &laquo BACK||</button>
</div>
                                <%
                               }
                          }
            }
            catch(Exception e )
            {
                out.print(e);
            }
                          %>     
                          </form>
</li></a>
       <a href="#"> <li>Sell</li></a>
       <a href="#"> <li>Buy</li></a>
       <a href="#"><li> EDIT</li></a>
       <form method="post" action="">
           <a href="#"> <li><button name="logout" style=""> LOGOUT</button></li></a>
       </form>
       </ul>
     
 </div>
        <%
    
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
%>
  
 <div class="userprofile" style="float:left;">
   <div class="all" >
            <div class="centerdiv" style="margin-bottom:100px;margin-left: 200px;">
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
            <nav>
            </div>
            
       
            </div>
    </body>
</html>
