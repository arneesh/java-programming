// Java program to find area and perimeter of a rectange

import java.util.Scanner;


class rectangle{

public static void main(String args[])
{
int a,b;
int area, perimeter;

Scanner in = new Scanner(System.in);

System.out.println("Enter the length of rectangle in cm:");
a = in.nextInt();
System.out.println("Enter the breadth of rectangle in cm");
b = in.nextInt();

area=(int)a*b;
perimeter=(int)2*(a+b);
System.out.println("The area of rectangle is :");
System.out.println(area+"cm.sq");
System.out.println("The perimeter of rectangle is :");
System.out.println(perimeter+"cm");



}
}