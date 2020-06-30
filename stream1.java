import java.io.*;  
class stream1{  
  public static void main(String args[]) throws Exception{  
    
     FileOutputStream fout=new FileOutputStream("abc.txt");  
     String s="arneesh aima is in IT AAAAA";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
     
  }  
}  