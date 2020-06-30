
class primenumbers
 {
     public static void main(String args[])
 { 
 int i,j,flag=0;
 System.out.println("The prime numbers are:");
 
 for(i=2;i<500;++i)
 {
     flag=0;
     for(j=2;j<=i/2;++j)
     {
         if(i%j==0)
         {
             flag=1;
             break;
         }
         }
     
     if(flag==0)
         System.out.println(i);
 }
 }
 }
