import java.util.Scanner;
import java.lang.*;

class quad
{

public static void main(String[] args)
{
    double a,b,c,d,root1,root2;
    int ch=0;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the value of a:");
    a = in.nextInt();
    
     System.out.println("Enter the value of b:");
    b = in.nextInt();
    
     System.out.println("Enter the value of c:");
    c = in.nextInt();
    
    d=(b*b)-(4*a*c);
    
    if (a==0)
    {
        System.out.println("The roots does not exits:");
    }
    else
    {
       if(d>0)
        ch=1;
    if(d==0)
        ch=2;
    if(d<0)
        ch=3;
        
        switch(ch)
		{
		case 1:
			System.out.println("Real and Distinct roots exist:");
			root1 = ((-b) + Math.sqrt(d))/2*a;
			root2 = ((-b) - Math.sqrt(d))/2*a;
		    System.out.println("Root1:"+root1);
			System.out.println("Root2:"+root2);
			break;
			
			case 2:
				System.out.println("Equal and same roots exist");
				root1= -b/2*a;
				root2= -b/2*a;
				System.out.println("Root1 and Root2 are:"+root1+root2);
				break;
				
				case 3:
					System.out.println("There are no real solutions: ");
					break;
					
					default: System.out.println("xyz");
        
        }   
    
}
}

}