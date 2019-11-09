<%-- 
    Document   : img
    Created on : 29 Oct, 2019, 4:08:29 PM
    Author     : arman
--%>

<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.DataInputStream"%>
<%@page import="bookies_databaseconnection.databaseop"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your image is inserted Please Enter some other details to complete book registration details </h1>
       <form name="form1" method="post" action=""">
          

<input type="text" name="fname"><br><br>
<input type="text" name="lname"><br><br>
<input type="file" name="myimg"><br><br>
<button name="sub"> sub</button>>
</form>
<div style="float:bottom; height: 90px; width: 20px;">
</div>
    </body>
</html>
  <%
        

       /// String a=request.getParameter("auther_name");
        String b=request.getParameter("description");
        String c=request.getParameter("price");
String saveFile="";
String contentType = request.getContentType();
if((contentType != null)&&(contentType.indexOf("multipart/form-data") >= 0)){
DataInputStream in = new DataInputStream(request.getInputStream());
int formDataLength = request.getContentLength();
byte dataBytes[] = new byte[formDataLength];
int byteRead = 0;
int totalBytesRead = 0;
while(totalBytesRead < formDataLength){
byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
totalBytesRead += byteRead;
}
String file = new String(dataBytes);
saveFile = file.substring(file.indexOf("filename=\"") + 10);
saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
int lastIndex = contentType.lastIndexOf("=");
String boundary = contentType.substring(lastIndex + 1,contentType.length());
int pos;
pos = file.indexOf("filename=\"");
pos = file.indexOf("\n", pos) + 1;
pos = file.indexOf("\n", pos) + 1;
pos = file.indexOf("\n", pos) + 1;
int boundaryLocation = file.indexOf(boundary, pos) - 4;
int startPos = ((file.substring(0, pos)).getBytes()).length;
int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
File ff = new File("C:/Users/arman/OneDrive/Documents/projects/NetBeansProjects/THE_BOOKIESS/web/IMAGES/"+saveFile);
FileOutputStream fileOut = new FileOutputStream(ff);
fileOut.write(dataBytes, startPos, (endPos - startPos));
fileOut.flush();
fileOut.close();
%><br><table border="2"><tr><td><b>You have successfully upload the file:</b>
<%out.println(saveFile);%></td></tr></table>
<%

//String connectionURL = "jdbc:mysql://localhost:3306/roseindia";
PreparedStatement psmnt = null;
try{
//Class.forName("com.mysql.jdbc.Driver").newInstance();
//connection = DriverManager.getConnection(connectionURL, "root", "root");
    Connection connection =databaseop.getconnect();
    
psmnt = connection.prepareStatement("insert into book(title,image,auther, description, price) values(?,?,?,?,?)");
psmnt.setString(1, ff.getName());
psmnt.setString(2, ff.getPath());
psmnt.setString(3, "8899");
psmnt.setString(4,b);
psmnt.setString(5 ,c);
//psmnt.setString(6 ,request.getParameter(""));
int s = psmnt.executeUpdate();
if(s>0){
System.out.println("Uploaded successfully !");
 response.sendRedirect("img.jsp");

}
else{
System.out.println("Error!");
}
}
catch(Exception e){
    e.printStackTrace();
}

} 
%>