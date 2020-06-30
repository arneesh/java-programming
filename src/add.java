
class add
{
    
    public static void main(String[] args)
 {
     add a = new add();
     a.add();
     
 
     sub b = new sub();
     b.sub();
     
     mult c = new mult();
     c.mult();
     
     div d = new div();
     d.div();
 
 }
    public void add()
    {
        
    int x=2,y=3;
    int add;
    
    add=x+y;
  System.out.println("The addition of 2 and 3 is : "+add);
     }

    
}

 
class sub
{
    public void sub()
    {
        
    int x=2,y=3;
    int sub;
    
    sub=y-x;
  System.out.println("The subtraction of 3 and 2 is : "+sub);
    }
    
}

class mult
{
    public void mult()
    {
        
    int x=2,y=3;
    int mult;
    
    mult=y*x;
  System.out.println("The multiplication of 3 and 2 is : "+mult);
    }
    
}
 
 
 class div
{
    public void div()
    {
        
    float x=2,y=3;
    float div;
    
    div=y/x;
  System.out.println("The division of 3 and 2 is : "+div);
    }
    
}
 