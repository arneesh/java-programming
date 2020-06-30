// Decimal to binary pre defined method

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
  }
}