
import java.util.Scanner;
import java.lang.*;

class newseries{
    
    public static void main(String[] args)
    {
       int a,i,j,k;
       double[] arr = new double[10];

Scanner in = new Scanner(System.in);

System.out.println("Enter the value of a:"); 
a = in.nextInt(); 


System.out.println("The array is :");

for(i=0;i<=9;i++)
{ arr[i] = Math.pow(a,i+1);
System.out.println(arr[i]);
}       
    }
    
}

