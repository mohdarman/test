package javaapplication1;
public class JavaApplication1 {
    public static void main(String[] args) {
       for(int i=1;i<=9;i++)
       {
           for(int j=1;j<=9;j++)
           {
               
               if(j!=j-1)
               {
                    System.out.print("\t"+i);
               }
              
               
           }
           System.out.println();
       }
    }
    
}
