// Write a Java program take 2 values input add and sub using const

class constnew
{
    double a;
    double b;
    
    
}
class const1 {
    public static void main(String[] args)
    {
        
        
        constnew newconst = new constnew();
        constnew newconst1 = new constnew();
        double sum;
        double sum1;
        double difference;
        double difference1;
        
        newconst.a=10;
        newconst.b=5;
             
         newconst1.a=10;
        newconst1.b=5;
        
        
        
        sum = newconst.a+newconst.b;
        sum1 = newconst1.a+newconst1.b;
        differnece = newconst.a - newconst.b;
        difference1 =  newconst1.a - newconst1.b;
        
        System.out.println("The sum is:"+" "+sum);
        System.out.println("The difference is:"+" "+difference);
        System.out.println("The sum is:"+" "+sum1);
        System.out.println("The difference is:"+" "+difference1);
        
        
    }
}






