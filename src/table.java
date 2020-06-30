
import java.util.Scanner;

class table
{

public static void main(String[] args)
{
int a;
int b;
System.out.println("Enter the integer for table:");
Scanner in = new Scanner(System.in);
a = in.nextInt();
System.out.println("The table is:");
for(b=1;b<=10;b++)
{
System.out.println(a+"*"+b+"="+(a*b));
}
}
}