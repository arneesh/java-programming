import java.lang.*;

public class StringDemo {

   public static void main(String[] args) {
   int a[]= {77,31,45,66,155,88,44,90,99,22,21,25,19};
 
 String s = new String(a,3,6);
  //a[0]=
   //  String str = new String(a);
   System.out.println("String = " + s);
        
   // codepoint at index 1
   int retval = s.codePointAt(0);
        
   // prints character at index1 in string
   System.out.println("Character(unicode point) = " + retval);
   } 
}