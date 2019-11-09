package servlets_files;
import bookies_databaseconnection.UserBean;
import bookies_databaseconnection.databaseop;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ServletLogin extends HttpServlet {
    public String a=" ";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
           try
{	    
     UserBean user = new UserBean();
     user.setUserName(request.getParameter("un"));
     user.setPassword(request.getParameter("pw"));
     user = databaseop.login(user);  		    
     if (user.isValid())
     {
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user); 
          response.sendRedirect("User_profile.jsp");      		
     }
	        
     else 
     {
       //  a="helllo";
          out.println("<form name='fn' values='hello'>  </form>");
         response.sendRedirect("LOGIN.jsp"); 
        
     }
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
        }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
