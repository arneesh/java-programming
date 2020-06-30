
class box
{
    double height;
    double width;
    double depth;
}

class boxdemo
{
    public static void main(String[] args)
    {
        box mybox = new box();
        box newbox = new box();
        double volume;
        double volume1;
        mybox.width=10;
        mybox.height=20;
        mybox.depth=10;
        
         newbox.width=20;
        newbox.height=20;
        newbox.depth=20;
        
        
        
        volume= mybox.height*mybox.depth*mybox.width;
        volume1=newbox.height*newbox.depth*newbox.width;
        
        System.out.println("The volume is:"+" "+volume);
        System.out.println("The volume1 is:"+" "+volume1);
        
        
    }
}