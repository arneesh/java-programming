

import java.util.Scanner;

class binarysearch{

public static void main(String[] args)
{
    int[] arr = new int[8];
    int i,j,temp;
Scanner in = new Scanner(System.in);

System.out.println("Enter the elements in an array:");

for(i=0;i<=7;i++)
arr[i] = in.nextInt();

System.out.println("The array before sorting is :");
for(i=0;i<=7;i++)
    System.out.print(arr[i]+"\t");
System.out.println(" ");
    


for(i=0;i<=6;i++)
{
    for(j=0;j<=6-i;j++)
    {
        if(arr[j]>arr[j+1])
        {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            
        }
    }
       
}
System.out.println("The sorted array is:");
for(i=0;i<=7;i++)
System.out.println(arr[i]);
}
}