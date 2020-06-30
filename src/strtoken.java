import java.util.StringTokenizer;
 

public class strtoken {
 
	public static void main(String args[]) {
		String s = "Arneesh Aima";
		
 	
		StringTokenizer str = new StringTokenizer(s);
 
		System.out.println("Splitting the string on the basis of space tokens");
		while (str.hasMoreTokens()) {
 
			System.out.println(str.nextElement());
 
		}
		
 
	}
 
}