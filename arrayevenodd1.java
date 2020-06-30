
import java.util.Scanner;

class arrayevenodd1
{

public static void main(String[] args)
{
    int[] arr = new int[8];
    int i;
    
Scanner in = new Scanner(System.in);

System.out.println("Enter the elements in an array:");
for(i=0;i<=7;i++)
arr[i] = in.nextInt();

System.out.println("The elements entered in the array are:");
for(i=0;i<=7;i++)
System.out.println(arr[i]);

for(i=0;i<=7;i++)
{
if(arr[i]%2!=0)
{
System.out.println("The number is odd:");
System.out.println(arr[i]);
}
else
{
System.out.println("The number is even:");
System.out.println(arr[i]);
}
}

}
}