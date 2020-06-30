

import java.util.*;
class strsum{
    
   public static void main(String args[])
   {
      String s = new Scanner(System.in);
StringTokenizer st = new StringTokenizer(s.nextLine(),",");
int sum=0;

while(st.hasMoreTokens())
sum += Integer.parseInt(st.nextToken());
System.out.println("Sum="+sum);
      
       
       
       
       
       
   }   
    
    
    
    
    
}