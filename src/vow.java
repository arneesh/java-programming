import java.util.Scanner;
class vow{

public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);

    String str;
    
    System.out.println("Enter the string ");
    str = in.nextLine();
    
        for(int i=0;i <str.length();i++)
        {
            if((str.charAt(i) == 'a') || (str.charAt(i) == 'e')  ||(str.charAt(i) == 'i') || (str.charAt(i) == 'o') ||(str.charAt(i) == 'u')) 
                { System.out.println("LALALALLA");
                
                
                
                
        }
             else{
                 System.out.println("No vowels are found");
             }
        }




}




}