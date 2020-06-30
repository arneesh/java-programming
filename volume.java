
import java.util.Scanner;

class volume
{
    
    public static void main(String[] args)
    {
        int a,b,c,volume;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the length:");
        a = in.nextInt();
        
        System.out.println("Enter the width:");
        b = in.nextInt();
        
        System.out.println("Enter the depth");
        c = in.nextInt();
        
        volume= a*b*c;
        System.out.println("The volume is:"+ volume);
        
    }
}