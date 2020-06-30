
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tatareg {

   private static final String REGEX = "tata";
   private static final String INPUT = "tataashdbahsbtataujsdk";
   private static Pattern pattern;
   private static Matcher matcher;

   public static void main( String args[] ) {
      pattern = Pattern.compile(REGEX);
      matcher = pattern.matcher(INPUT);

      System.out.println("Current REGEX is: "+REGEX);
      System.out.println("Current INPUT is: "+INPUT);

      System.out.println("The word tata is found in the string: "+matcher.lookingAt());
      
   }
}