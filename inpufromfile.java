import java.io.*;
public class inpufromfile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      File input = new File("Records\Record");
BufferedReader in = new BufferedReader(
        new InputStreamReader(new FileInputStream(input), "UTF8"));

while((r = in.readLine()) != null) {
    System.out.println(r);
}
in.close();
   }
}