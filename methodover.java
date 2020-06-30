 
 class methodover{
     
     public static void main(String[] args)
     {
         
         over ob = new over();
         ob.area(5);
         ob.area(3,4);
         
         double a=3.476;
         ob.area(a);
         double q = 3.5;
         double y = 2.5;
         ob.area(q,y);
     }
     
 }
 
 class over{
     
     // SQUARE
     void area(int a)
     {
         System.out.println("The area os square is:"+ a*a);   
     }
     // RECTANGLE
     void area(int x , int y)
     {
         System.out.println("The area of rectangle is:"+(x*y));
     }
     // CIRCLE
     void area(double r)
     {
         double p = (3.14*r*r);
         System.out.println("The area of cicle is:"+p);
     }
     // RHOMBUS
     void area(double o, double t)
     {
         System.out.println("The area of rhombus is:"+((o*t)/2));
     }
     
 }
 
 
 