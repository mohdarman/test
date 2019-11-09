<%-- 
    Document   : Exitting_seller
    Created on : 19 Oct, 2019, 3:52:08 PM
    Author     : arman
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="bookies_databaseconnection.databaseop.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>,, .S
3i5         98U`    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sellers</title>
        <link type="text/css" href="cssfiles/registration_login_css.css">
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
try {
      Connection con=bookies_databaseconnection.databaseop.getconnect();
Statement statement = null;
ResultSet rs = null;
statement = con.createStatement();
String QueryString = "SELECT * from user_registration";
rs = statement.executeQuery(QueryString);
%>
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getString(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
<TD><%=rs.getString(5)%></TD>
<TD><%=rs.getString(6)%></TD>
</TR>
<% } %>
<%
rs.close();
statement.close();
con.close();
} catch (Exception ex) {
}
%>
</font>
<font size="+3" color="red"></b>
</TABLE><TABLE>
<TR>
<TD><FORM ACTION="Home.jsp" method="get" >
<button type="submit"><-- back</button></TD>
</TR>
</TABLE>
</font>
    </body>
</html>
