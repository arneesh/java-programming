import java.util.Scanner;
public class mathpowers {
    public static void main(String args[])
    {
        Scanner a = new Scanner (System.in);
        System.out.print("Enter string: ");
        String s = a.nextLine();
        int count = 0;
        for (char c : s.toCharArray())
        {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            {
                c = '_';
                System.out.println (c[i]);
            }
        }
        System.out.println("Your string has " + count + " upper case letters.");
    }
}