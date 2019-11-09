package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import bookies_databaseconnection.databaseop;
import java.io.InputStream;
import java.io.File;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class img_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Your image is inserted Please Enter some other details to complete book registration details </h1>\n");
      out.write("       <form name=\"form1\" method=\"post\" action=\"\"\">\n");
      out.write("          \n");
      out.write("\n");
      out.write("<input type=\"text\" name=\"fname\"><br><br>\n");
      out.write("<input type=\"text\" name=\"lname\"><br><br>\n");
      out.write("<input type=\"file\" name=\"myimg\"><br><br>\n");
      out.write("<button name=\"sub\"> sub</button>>\n");
      out.write("</form>\n");
      out.write("<div style=\"float:bottom; height: 90px; width: 20px;\">\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  ");

        

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

      out.write("<br><table border=\"2\"><tr><td><b>You have successfully upload the file:</b>\n");
out.println(saveFile);
      out.write("</td></tr></table>\n");


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
