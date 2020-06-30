 class exception2 {
   public static void main (String args[]) {
      
      try{
          int a[]=new int[5];  
a[10]=50; 
      }
      
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("The array is out of Bounds"+e);
      }
      catch (ArithmeticException e) {
         System.out.println ("Cannot be divided by zero"+e);
      }
   }
}



