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
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="sty.css">
    <style>
    
     :root{ --main-color: #e74c3c; }
.product-grid{
    font-family: 'Roboto', sans-serif;
    position: relative;
}
.product-grid .product-image{
    overflow: hidden;
    position: relative;
}
.product-grid .product-image:before{
    content: "";
    background: rgba(0,0,0,0.3);
    width: 100%;
    height: 100%;
    opacity: 0;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 1;
    transition: all 0.4s ease-out 0s;
}
.product-grid:hover .product-image:before{ opacity: 1; }
.product-grid .product-image a{ display: block; }
.product-grid .product-image img{
    width: 100%;
    height: auto;
}
.product-image .pic-1{
    opacity: 1;
    backface-visibility: hidden;
    transition: all 0.4s ease-out 0s;
}
.product-grid:hover .product-image .pic-1{ opacity: 0; }
.product-image .pic-2{
    width: 100%;
    height: 100%;
    opacity: 0;
    backface-visibility: hidden;
    transform: scale(3);
    position: absolute;
    top: 0;
    left: 0;
    transition: all 0.4s ease-out 0s;
}
.product-grid:hover .product-image .pic-2 {
    opacity: 1;
    transform: scale(1);
}
.product-image .product-trend-label,
.product-image .product-discount-label{
    content: "";
    color: #fff;
    background-color: #2ecc71;
    font-size: 12px;
    line-height: 28px;
    font-weight: 700;
    text-align: center;
    text-transform: uppercase;
    padding: 0 7px;
    position: absolute;
    top: 12px;
    left: 12px;
    z-index: 3;
}
.product-image .product-discount-label{
    background-color: var(--main-color);
    left: auto;
    right: 12px;
}
.product-grid .social {
    padding: 0;
    margin: 0;
    list-style: none;
    transform: translateY(-50%);
    position: absolute;
    top: 50%;
    left: 10px;
    z-index: 4;
}
.product-grid .social li {
    margin: 0 0 12px;
    opacity: 0;
    transform: translateX(-60px);
    transition: transform .3s ease-out 0s;
}
.product-grid:hover .social li {
    opacity: 1;
    transform: translateX(0);
}
.product-grid:hover .social li:nth-child(2){ transition-delay: 0.1s; }
.product-grid:hover .social li:nth-child(3){ transition-delay: 0.2s; }
.product-grid:hover .social li:nth-child(4){ transition-delay: 0.3s; }
.product-grid .social li a {
    color: #fff;
    font-size: 22px;
    transition: all 0.3s;
}
.product-grid .social li a:hover { color: var(--main-color); }
.product-grid .social li a:before,
 .product-grid .social li a:after{
    content: attr(data-tip);
    color: #000;
    background: #fff;
    font-size: 14px;
    padding: 5px 10px;
    white-space: nowrap;
    display: none;
    transform: translateY(-50%);
    position: absolute;
    left: 33px;
    top: 50%;
    transition: all 0.3s;
}
.product-grid .social li a:after{
    content: '';
    background: linear-gradient(-45deg, #fff 49%, transparent 50%);
    width: 10px;
    height: 10px;
    top: 40%;
    left: 20px;
}
.product-grid .social li a:hover:before,
.product-grid .social li a:hover:after{
      display: block;
}
.product-grid .product-content{ padding: 12px 0; }
.product-grid .title{
    font-size: 15px;
    font-weight: 400;
    text-transform: capitalize;
    margin: 0 0 5px;
}
.product-grid .title a{ color: #959595; }
//.product-grid .title a:hover{ color var(--main-color); }
.product-grid .price{
    color: #333;
    font-size: 14px;
    font-weight: 400;
}
.product-grid .price span{
    color: #333;
    text-decoration: line-through;
    margin-right: 3px;
}
.product-grid .price.discount{ color: var(--main-color); }
@media only screen and (max-width:990px){
    .product-grid{ margin-bottom: 30px; }
}
    
    </style>
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
                      <button type="button" onclick="shows_form_part(1),shows_form_part(2)">Register Books</button>
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
  DATE<br>
  <input type="date" value="" id="num6" placeholder="date" name="date"><br>
  <button type="button" onclick="shows_form_part(5)"> &laquo BACK||</button>
  <button type="button" onclick="shows_form_part(7)">NEXT &raquo </button>
</div>
                          <div id="form_part7" style="display:none">
  city<br>
  <input type="text" value="" id="num7" placeholder="city" name="city"><br>
  <button type="button" onclick="shows_form_part(6)"> &laquo BACK||</button>
  <button type="button" onclick="shows_form_part(8)">NEXT &raquo </button>
</div>
<div id="form_part8" style="display:none">
  locality zip code<br>
  <input type="number" value="" id="num8" placeholder="locality zip code" name="zipcode"><br>
  <button type="button" onclick="shows_form_part(7)"> &laquo BACK||</button>
  <button type="submit" onclick="shows_form_part(9)" name="submit">Submit||</button>
  //<button type="button" onclick="shows_form_part(9)">&raquo WANTS TO REFRESH</button>
</div>
                            
 
            <%
            try
            {
                String a=currentUser.getEmail();
                
                ResultSet rs=null;
                int zipcode= Integer.parseInt(request.getParameter("zipcode"));
                String city=request.getParameter("city");
                Statement statement = null;
                          String submit=request.getParameter("submit");
                          if(submit!=null)
                          {
                          Connection con=databaseop.getconnect();
                          PreparedStatement ps=null;
                          String quiry="insert into book(auther,description,price,Email,publish_date,category_id) values(?,?,?,?,?,?)";
                          ps=con.prepareStatement(quiry);
                          statement = con.createStatement();
                          ps.setString(1,request.getParameter("auther_name"));
                            ps.setString(2,request.getParameter("description"));
                              ps.setString(3,request.getParameter("price"));
                                ps.setString(4, a);
                                ps.setString (5,city);
                                 ps.setInt(6,zipcode);
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
              <% 
            Statement statement = null;
ResultSet rs1 = null;
    //   currentUser.getcity();
          
           
            Connection con=databaseop.getconnect();
           
            statement = con.createStatement();
            String quiry="select * from book";
              PreparedStatement ps=con.prepareStatement( quiry);
           // ps.setString(1,);
           rs1 = ps.executeQuery();
           rs=ps.executeQuery();
            while(rs1.next())
            {%>
           <div class="container">
    <div class="row">
     
        <div class="col-md-3 col-sm-6">
            <div class="product-grid">
                <div class="product-image">
                    <a href="#">
                        <img class="pic-1" src="IMAGES/<%=rs1.getString(1)%>" alt="Smiley face">
                        <img class="pic-2" src="IMAGES/<%=rs1.getString(1)%>" alt="Smiley face">
                    </a>
                    <span class="product-trend-label">Trend</span>
                    <span class="product-discount-label">-20%</span>
                    <ul class="social">
                        <li><a href="#" data-tip="Add to Cart"><i class="fa fa-shopping-cart"></i></a></li>
                        <li><a href="#" data-tip="Wishlist"><i class="fa fa-heart"></i></a></li>
                        <li><a href="#" data-tip="Compare"><i class="fa fa-random"></i></a></li>
                        <li><a href="#" data-tip="Quick View"><i class="fa fa-search"></i></a></li>
                    </ul>
                </div>
                <div class="product-content">
                    <h3 class="title"><a href="#">/<%=rs1.getString(1)%></a></h3>
                    <div class="price discount"><span></span>/<%=rs1.getString(2)%></div>
                </div>
            </div>
        </div>
           
           
           
         </div> 
</div>
            
          
       
           
           <% }
            rs1.close();
            con.close();
            
        %>
            <nav>
            </div>
            
       
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
      </body>
</html>
