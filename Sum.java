import java.util.*;
class Sum{
    
    public static void main(String args[])
    {
        StringTokenizer st = new StringTokenizer("12,45,24,5,75");
        int a[] = new int[5];
        int i=0;
        while(st.hasMoreTokens()){
            a[i]=Integer.parseInt(st.nextToken(","));
            i++;
        }
        int sum=0;
        for(i=0;i<5;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum="+sum);
        
             
        
    }
    
    
    
    
    
}