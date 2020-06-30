import java.util.Scanner;

class salary{
    
    public static void main(String[] args)
    {
        int empno;
        String empname;
        int basic;
        double DA,HRA,CCA,PF,PT;
        double gross_salary, net_salary;
        
         Scanner in = new Scanner(System.in);
    
    
    System.out.println("Enter the Employee number:");
    empno = Integer.parseInt(in.nextLine());
    
    
    System.out.println("Enter the Employee name:"+" " );
    empname = in.nextLine();
     
     
     System.out.println("Enter the basic:");
    basic = Integer.parseInt(in.nextLine());
        
        
       

DA= (basic*50)/100;
HRA= (basic*25)/100;
CCA=240;
PF=(basic*10)/100;
PT=100;


gross_salary = basic+DA+HRA;
net_salary = gross_salary-PF-PT-CCA;

System.out.println("The gross salary is:"+gross_salary);
System.out.println("The net salary is:"+net_salary);


       
         
    }
    
    
    
    
    
    
}