
class fiboloop
{

public static void main(String[] args)
{
int n, sum=0, a=0, b=1, c;
System.out.println("The Fibonacci series upto n terms is:");
System.out.print(a+" "+b+" ");

for(int i=1; i<=n-2; i++)
{
    c=a+b;
    a=b;
    b=c;
    System.out.print(c+" ");
    sum=sum+c;;
}
System.out.println("Sum is:"+sum);

}
}