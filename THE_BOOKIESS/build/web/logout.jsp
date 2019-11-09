<%-- 
    Document   : logout
    Created on : 28 Oct, 2019, 3:52:20 PM
    Author     : arman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            if(request.getParameter("logout")!=null);
            {
                 session.invalidate();
                  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("some_token")==null)
     
                  response.sendRedirect("Home.jsp");      
            }
           
        %>
    </body>
</html>
