import java.util.Scanner;
class charint{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
       String a,b,c,d,e;

       
      System.out.println("Enter first number");
       a = in.nextLine();
       System.out.println("Enter second number");
       b = in.nextLine();
       System.out.println("Enter third number");
       c = in.nextLine();
       System.out.println("Enter fourth number");
       d = in.nextLine();
       System.out.println("Enter fifth number");
       e = in.nextLine();

        int n = Integer.parseInt(a);
        int m = Integer.parseInt(b);
        int p = Integer.parseInt(c);
        int q = Integer.parseInt(d);
        int w = Integer.parseInt(e);
       
        
        System.out.println("The result is");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        // ADDITION
        
        System.out.println("The sum is");
        System.out.println(n+m+p+q+w);
        
        
        
        
    }
    
    
    
    
}