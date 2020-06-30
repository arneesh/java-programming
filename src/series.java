
public class series
{
public static void main(String[] args)
{
 
    int i;
    int n=5;
    float sum=0;
    for(i=1;i<=n;i++) 
        // FACTORIAL BEGINS
    {
    int fact=i;
    for(int j=i-1;j>1;j--)
    {
    fact=fact*j;
    }
     
    // FACT ENDS      
        sum=sum+(float)(1.0/fact); 
        
        
}
    System.out.println("The value of mathematical constial e upto 5 terms is:");
    System.out.println(String.format("%.2f",sum));
    
}




}
