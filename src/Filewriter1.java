
import java.io.*;  
class Filewriter1{  
 public static void main(String args[]){  
  try{  
   FileWriter fw=new FileWriter("xaa.txt");  
   fw.write("my name is arneesh");  
   fw.close();  
  }catch(Exception e){System.out.println(e);}  
  System.out.println("success");  
 }  
}  