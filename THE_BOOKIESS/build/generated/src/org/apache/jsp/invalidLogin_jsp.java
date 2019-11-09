package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.FileOutputStream;
import java.io.File;
import bookies_databaseconnection.databaseop;

public final class invalidLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1>Hello World!</h1>\n");
      out.write("       <FORM ENCTYPE=\"multipart/form-data\" ACTION=\"\" METHOD=POST>\n");
      out.write("<center>\n");
      out.write("<table border=\"0\" bgcolor=#ccFDDEE>\n");
      out.write("<tr>\n");
      out.write("<center><td colspan=\"2\" align=\"center\"><B>UPLOAD THE FILE</B><center></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"> </td></tr>\n");
      out.write("<tr><td><b>Choose the file To Upload:</b></td>\n");
      out.write("<td><INPUT NAME=\"file\" TYPE=\"file\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"> </td></tr>\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Send File\"> </td></tr>\n");
      out.write("<table>\n");
      out.write("</center>\n");
      out.write("</FORM>\n");
      out.write("    </center>\n");
      out.write("        ");

              int i = (Integer) session.getAttribute("book_id");
             out.print(i);
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



PreparedStatement psmnt = null;
try{
    Connection connection =databaseop.getconnect();
    
psmnt = connection.prepareStatement("update  user_registration set image_title=?,image_path=? where user_id=?");
psmnt.setString(1, ff.getName());
psmnt.setString(2, ff.getPath());
psmnt.setInt(3,1);


//psmnt.setString(4,b); out.print();
//psmnt.setString(5 ,c);
//psmnt.setString(6 ,request.getParameter(""));
int s = psmnt.executeUpdate();
if(s>0){
System.out.println("Uploaded successfully !");
 //response.sendRedirect("img.jsp");
response.sendRedirect("User_profile.jsp");
}
else{
System.out.println("Error!");
}
}
catch(Exception e){
    e.printStackTrace();
}

} 
     
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
