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

odd(x,y);

// EVEN NUMBERS

System.out.println("The even numbers between the limit are :");
even(x,y);


 // PRIME NUMBERS
 
 System.out.println("The prime numbers are:");
 
 prime(x,y);

    }
    // Method for prime numbers
    public static void prime(int a,int b){
         for(int m=a;m<b;++m)
 {
     boolean flag=true;
     for(int n=2;n<=m/2;++n)
     {
         if(m%n==0)
         {
             flag=false;
             break;
         }
         }
     
  if(flag==true)
         System.out.println(m);
 }
    }
    
    // Method for even numbers
    public static void even(int a, int b)
    {
        for(int j=a;j<=b;j++)
     {
        if(j%2==0)
      {
      System.out.println(j+" ");
      }
     }  
           
    }
    
    // Method for odd numbers
    public static void odd(int a, int b)
    {
        
        for(int i=a;i<=b;i++)
    {
     if(i%2!=0)
     {
     System.out.println(i+" ");
     }
    } 
            
    }
    
       
    }
    
   





