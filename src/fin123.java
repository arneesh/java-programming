
public class fin123{  
  public static void main(String args[]){  
  try{  
   int data=50/0;  
    
  }  
  catch(ArithmeticException e){System.out.println("The content of catch block:"+e);}  
  finally{System.out.println("The content of finally block - Arneesh");}  
  System.out.println("Java lab 12345");  
  }  
}  