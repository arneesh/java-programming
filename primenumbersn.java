import java.util.Scanner;

class primenumbersn
 {
     public static void main(String args[])
 { 
 int n;
 int i,j,flag=0;
 System.out.println("Enter the number upto which prime numbers are to be found:");
 Scanner in = new Scanner(System.in);
 n = in.nextInt();
 
 System.out.println("The prime numbers are:");
 
 for(i=2;i<n;++i)
 {
     flag=0;
     for(j=2;j<=i/2;++j)
     {
         if(i%j==0)
         {
             flag=1;
             break;
         }
         }
     
     if(flag==0)
         System.out.println(i);
 }
 }
 }
