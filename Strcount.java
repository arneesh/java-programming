
import java.util.*;
class Strcount{
    
    public static void main(String args[])
    {
        Scanner st = new Scanner(System.in);
        String s = st.nextLine();
        int w = countWords(s.trim());
        System.out.println("No of words="+w);
        System.out.println("No. of characters"+(s.length()-w+1));
    }
    public static int countWords(String s)
    {
        if(s.contains(""))
            return countWords(s.Substring(s.indexOf("")+1))+1;
        return 1;
          
        
    }
       
}