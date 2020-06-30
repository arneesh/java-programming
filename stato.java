


class stato{  
static int count=0;
  
stato(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
stato c1=new stato();  
count++;
stato c2=new stato();
count++;  
stato c3=new stato(); 
count++; 


System.out.println("The total number of times a function is being called is :"+count);

  
 }  
}  

























