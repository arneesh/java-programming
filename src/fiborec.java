import java.util.Scanner;

public class fiborec {

   public static void main(String[] args)
   {
       int n;
       
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter the value of n: ");
       n = in.nextInt();
       for (int i = 0; i <= n; i++) {
           System.out.print(fibonacci(i) + " ");
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