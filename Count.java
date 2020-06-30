
import java.util.Scanner;

class Count{
    static int n=0;
    
    void Count(){
        n++;
    }
    public static void main(String args[]){
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        Count c4 = new Count();
        
        c1.Count();
        c2.Count();
        c3.Count();
        c4.Count();
        
        System.out.println("Count ="+n);
    }
}