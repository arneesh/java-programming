// Java program to reverse a number

class reverse{

public static void main(String args[])
{
int n=123, rev=0, rem=0;

System.out.println("The number to be reversed is :");
System.out.println("123");

while(n>0)
{
    rem=n%10;
    n=n/10;
    rev=(rev*10)+rem;
}
System.out.println("The reversed number is:");
System.out.println(rev);

}


}