import java.util.Scanner;
class stringpatrep{
    
    public static void main(String args[])
    {
System.out.println("Enter the String:");
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
StringBuffer s = new StringBuffer(str);

System.out.println("Enter the String:");
Scanner sc1 = new Scanner(System.in);
String str1 = sc1.nextLine();
StringBuffer s1 = new StringBuffer(str1);

int count[] = new int[10]; 
int i=0;
int j=0;
for(i=0,j=0;i<=str.length,j<=str1.length;i++,j++)
{
    
    System.out.println("Abc"+str);
    System.out.println("Abcd"+str1);
    
}



    }
}