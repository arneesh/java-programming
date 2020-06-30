
public class fin123{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){System.out.println(e);}  
  finally{System.out.println("The content of finally block - Arneesh");}  
  System.out.println("Java lab 12345");  
  }  
}  