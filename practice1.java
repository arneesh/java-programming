// Java program to perform arithemetic operations on input taken by user
import java.util.Scanner;

class practice1
{
    public static void main(String[] args)
    {
    int x,y;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x = in.nextInt();
    System.out.println("Enter the value of y:");
    y = in.nextInt();
    
    System.out.println("The sum is:");
    System.out.println(x+y);
    System.out.println("The difference is:");
    System.out.println(x-y);
    System.out.println("The product is:");
    System.out.println(x*y);
    System.out.println("The division is:");
    float c = (float)x/y;
    System.out.println(c);
    
    
    
    }
}