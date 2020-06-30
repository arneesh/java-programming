// Decimal to binary 

import java.util.Scanner;
class dectobin{
 
  public void convertBinary(int num){
     int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(binary[i]);
     }
  }
 
  public static void main(String a[]){
      
      int n;
      
      System.out.println("Enter the decimal number to be converted to binary");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      
     dectobin obj = new dectobin();
     System.out.println("Binary representation of the no.: ");
     obj.convertBinary(n);
     
     System.out.println();
     System.out.println();
     
     // HEXADECIMAL
     
      int rem,temp;
        
     // For storing result
     String str2=""; 
 
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
      n=temp;
     while(n>0)
     {
       rem=n%16; 
       str2=hex[rem]+str2; 
       n=n/16;
     }
     System.out.println("Decimal to hexadecimal: "+str2);
     
     System.out.println();
     
     // OCTAL
      int gam;
 
    // For storing result
    String str=""; 
 
    // Digits in Octal number system
    char dig[]={'0','1','2','3','4','5','6','7'};
 
    while(temp>0)
    {
       gam=n%8; 
       str=dig[gam]+str; 
       temp=temp/8;
    }
    System.out.println("Decimal to octal: "+str);
     
  
     
     
  }
}