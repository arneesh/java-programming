import java.util.Scanner;

class LowFundsException extends Exception{  
 LowFundsException(String s){  
  super(s);  
 }  
}  
class banke1{  

   static void amountwith(int money)throws LowFundsException{  
     if(money>1000)  
      throw new LowFundsException("not enough money in account");  
     else  
      System.out.println("withdraw successful");  
   }  
     
   public static void main(String args[]){ 
System.out.println("The total money in account is : $1000");
int n;
Scanner in = new Scanner(System.in);
  System.out.println("Enter the amount you want to withdraw:");
n= in.nextInt();   
      try{  
      // The amount you want to withdraw
      amountwith(n);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
        
  }  
}  