
// Java program to check a palindrome or not

import java.util.Scanner;
class palindrome{

public static void main(String args[])
{
    int n, rev=0, rem=0,temp;
    
    Scanner in = new Scanner(System.in);

System.out.println("Enter the number:"); 
n = in.nextInt();
temp=n;
while(n>0)
{
    rem=n%10;
    n=n/10;
    rev=(rev*10)+rem;
    
}
System.out.println("The reversed number is:");
System.out.println(rev);

if(temp==rev)
{
    System.out.println("The number is a palindrome");
}
else
{
    System.out.println("The number is not a palindrome");
}

}


}