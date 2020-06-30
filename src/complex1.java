import java.util.Scanner;

class complex1
{
    public static void main(String[] args)
    {
       int a,b,c,d,x,y,g,h;
       
       // FIRST COMPLEX INPUT
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the value of a:");
       a = in.nextInt();
       
      System.out.println("Enter the value of b:");
      b = in.nextInt();
       
       System.out.println("The complex number is:");
       System.out.print(a+"+"+"i"+b);
       
       System.out.println();
       
      
       
       // SECOND COMPLEX INPUT
       
       System.out.println("Enter the value of x:");
       x = in.nextInt();
       
      System.out.println("Enter the value of y:");
      y = in.nextInt();
       
       System.out.println("The complex number is:");
       System.out.print(x+"+"+"i"+y);
       
       System.out.println();
       
       // INPUT ENDS
       
       // ADDITION
        System.out.println("The addition is:");
       add(a,x,b,y);
       
       // SUBTRACTION
       System.out.println("The subtraction is:");
       
      sub(a,x,b,y);
       
       
       // Method for addition 
       
       public void add(int l, int m, int o, int k)
       {int n=0;
           
           n=l+m; 
           s=o+k;
        System.out.print(n+"+"+"i"+s);           
       }
       
       // Method for subtraction
       
       public void sub(int l , int m , int o, int p)
       {int q=0;
           
           q=l-m;
            r=o-k;           
           System.out.print(q+"+"+"i"+r);
       }
       
              
    }
    
        
    
}