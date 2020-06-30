import java.util.Scanner;

class passvalue1
{
    public static void main(String[] args)
    {
    
        int x;
        int y;
        int i;
        int j;
        int m;
        int n;
        int flag=0;
      
           Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the value of x:");
        x = in.nextInt();
        
        System.out.println("Enter the value of y:");
        y = in.nextInt(); 
    
    
// ODD NUMBERS
System.out.println("The odd numbers between the limit are :");

for(i=x;i<=y;i++)
{
if(i%2!=0)
{
System.out.println(i+" ");
}
} 

// EVEN NUMBERS

System.out.println("The even numbers between the limit are :");

for(j=x;j<=y;j++)
{
if(j%2!=0)
{
System.out.println(j+" ");
}
}  
 // PRIME NUMBERS
 
 System.out.println("The prime numbers are:");
 
 for(m=x;m<y;++m)
 {
     flag=0;
     for(n=2;n<=m/2;++n)
     {
         if(m%n==0)
         {
             flag=1;
             break;
         }
         }
     
     if(flag==0)
         System.out.println(m);
 }
 

    }
    }
    
   





