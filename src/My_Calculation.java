class Calculation {
   int z;
                Calculation()
                {
                                z=20;
                                System.out.println("iam in calculation calss constructor");
                }
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
               
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}
 
public class My_Calculation extends Calculation {
   My_Calculation()
                {
                               
                                System.out.println("iam in My_calculation calss constructor");
                }
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
               
   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
               // Calculation d= new Calculation();
                // demo1.addition(5,6);
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
                 // d.addition(12, 3);
                  //d.multiplication(3,4);
                  System.out.println("The difference in my calculation between the given numbers:"+demo.z);
   }
}