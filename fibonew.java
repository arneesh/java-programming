import java.util.Scanner;

public class fibonew {

   public static void main(String[] args)
   {
       int n;
       int c,a=0,b=1;
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter the value of n: ");
       n = in.nextInt();
       System.out.println("The fibonacci series upto n terms using recursion is:");
       for (int i = 0; i < n; i++)
           System.out.print(fibonacci(i) + " ");
       System.out.println();
      
System.out.println("The Fibonacci series upto n terms without recursion is:");
System.out.print(a+" "+b+" ");

for(int j=1; j<=n-2; j++)
{
    c=a+b;
    a=b;
    b=c;
    System.out.print(c+" ");
}


      }
       
   

   public static int fibonacci(int n) 
   {
       if (n == 0) {
           return 0;
       } else if (n == 1) {
           return 1;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }
}