import java.util.Scanner;

class time1{
    
    public static void main(String args[])
    {
long hr,min,sec=0,t;
long hr1,min1,sec1=0,t1;
long a1,a2,a2,holda;


Scanner in = new Scanner(System.in);

System.out.println("Enter the time in seconds:");
sec = in.nextLong();

System.out.println("Enter the time1 in seconds:");
sec1 = in.nextLong();

hr = sec/3600;
t=sec%3600;
min=t/60;
sec=t%60;

hr1 = sec1/3600;
t1=sec1%3600;
min1=t1/60;
sec1=t1%60;


System.out.println("The time1 in  hh:mm:ss form is::"+hr+":"+min+":"+":"+sec);

System.out.println("The time2 in  hh:mm:ss form is::"+hr1+":"+min1+":"+":"+sec1);
      System.out.println();
      
      // TIME COMPARE BEGINS
      
    if(sec==sec1)
    {
        System.out.println("The both time inputs are equal");
    }  
    else 
        System.out.println("Both time inputs are not equal");
    System.out.println();
if(sec>sec1)
System.out.println("The time2 is greater than time1");

if(sec<sec1)
System.out.println("The time1 is greater than time2");    

// TIME COMPARE ENDS

// TIME ADD BEGINS

a1 = hr+hr1;
a2 = min+min1;
a3 = sec+sec1;







     
    }
    
    
    
    
}