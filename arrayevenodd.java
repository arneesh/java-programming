
import java.util.Scanner;

class arrayevenodd
{

public static void main(String[] args)
{
    int[] arr = new int[8];
    int i,j,k;
    int[] arr1 = new int[8];
    int[] arr2 = new int[8];
    
Scanner in = new Scanner(System.in);

System.out.println("Enter the elements in an array:");
for(i=0;i<=7;i++)
{
arr[i] = in.nextInt();
System.out.println(arr[i]);
}
System.out.println("The elements entered in the array are:");
for(i=0;i<=7;i++)
System.out.println(arr[i]);
k=0;
j=0;
for(i=0;i<=7;i++)
{
if(arr[i]%2!=0)
{
arr1[j]= arr[i];
System.out.println("arr1[]"+arr1[j]);
j++;
}
else
{arr2[k]=arr[i];
k++;
}
}
System.out.println("The odd numbers are are:");
for(j=0;j<=7;j++)
{
System.out.println(arr1[j]  +" " +j);
}

System.out.println("The even numbers are:");
for(k=0;k<=7;k++)
{
System.out.println(arr2[k]); 
}

}
}
