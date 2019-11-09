package bookies_databaseconnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jdt.core.compiler.IProblem;
public class databaseop {
    static Connection con;
     static ResultSet rss = null;  
	
    public static Connection getconnect()
    {
         try
        {
        Class.forName("com.mysql.jdbc.Driver");
        String dburl="jdbc:mysql://localhost:3306/the_bookies";
        String pass="1234";
        String user="root";
         con=DriverManager.getConnection(dburl,user,pass);  
    if(con!=null)
    {
      System.out.print("connection done");
       
    }
    else
    {
         System.out.print(con+"notdone");
    }
    }
        catch(Exception e)
        {
            System.out.print(e+"This is your Exception");
    }
        return con;
    }
    public static int insertdata(String name, String pass,String email,String address,String Telephone,int a,String city) 
    {
        try{
    String quiry="insert into user_registration(name,password,Email,location, phone_number,zipcode,city) values(?,?,?,?,?,?,?)";
    PreparedStatement ps = con.prepareStatement(quiry);
    ps.setString(1, name);
     ps.setString(2, pass);
      ps.setString(3, email);
       ps.setString(4, address);
        ps.setString(5, Telephone);
         ps.setInt(6, a);
           ps.setString(7, city);
        ps.executeUpdate();
        }
        catch(Exception e)
        {
        
        }
        return 0;
        
    }
    public static int checks_data(String email)
    {
        String quiry="select Email from user_registration where Email="+email+"";
        return 0;
        
    
    }
   
      
   
      static ResultSet rs = null;  
	
	 static Connection currentCon=null;
	
      public static UserBean login(UserBean bean) {
	
         //preparing some objects for connection 
         Statement stmt = null;    
	
         String username = bean.getUsername();    
         String password = bean.getPassword();   
	    
         String searchQuery =
               "select * from user_registration where Email='"
                        + username
                        + "' AND password='"
                        + password
                        + "'";
	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Your user name is " + username);          
      System.out.println("Your password is " + password);
      System.out.println("Query: "+searchQuery);
	    
      try 
      {
         //connect to DB 
         currentCon = getconnect();
         stmt=currentCon.createStatement();
         rss = stmt.executeQuery(searchQuery);	        
         boolean more = rss.next();
	       
         // if user does not exist set the isValid variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            bean.setValid(false);
         } 
	        
         //if user exists set the isValid variable to true
         else if (more) 
         {
            String firstName = rss.getString("password");
            String lastName = rss.getString("name");
            String email=rss.getString("Email");
           /// String location=rss.getString("location");
            String address=rss.getString("location");
	    String city=rss.getString("city");
            int zipcode=rss.getInt("zipcode");
            
            System.out.println("Welcome " + firstName);
            bean.setFirstName(firstName);
            bean.setLastName(lastName);
            bean.setEmail(email);
         //   bean.setcity(city);
             //bean.setaddress(city);
             //bean.setzipcode(zipcode);
            bean.setValid(true);
         }
      } 

      catch (Exception ex) 
      {
         System.out.println("Log In failed: An Exception has occurred! " + ex);
      } 
	    
      //some exception handling
      finally 
      {
         if (rss != null)	{
            try {
               rss.close();
            } catch (Exception e) {}
               rss = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
                   currentCon.close();
            } catch (Exception e) {
            }

                  
         }
      }

return bean;
	
      }  
      public static void fetchdata(String EMAIL)
      {
          ResultSet rs=null;
          Connection con=getconnect();
        try {
            PreparedStatement ps=con.prepareStatement("");
            String q="select * from book where Email=? ";
            ps.setString(1,EMAIL);
            
               rs = ps.executeQuery(q);

        } catch (Exception ex) {
            Logger.getLogger(databaseop.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
}
     