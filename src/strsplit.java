public class strsplit{
   public static void main(String args[]){
      String Str = new String("Arneesh-Aima-Aima-Arneesh");

      System.out.println("Return Value :" );
      for (String retval: Str.split("-")){
         System.out.println(retval);
      }
    
      
      
   }
}