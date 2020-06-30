
public class equals {

   public static void main(String args[]) {
      String Str1 = new String("Hellow Wolrd");
      String Str2 = Str1;
      String Str3 = new String("Hello World");
      boolean retVal;

      retVal = Str1.equals( Str2 );
      System.out.println("Returned Value = " + retVal );

      retVal = Str1.equals( Str3 );
      System.out.println("Returned Value = " + retVal );
   }
}