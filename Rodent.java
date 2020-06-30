
class Rodent{
    
    public static void main(String args[]){
        System.out.println("Check");
    }
        
        void FoodHabbits()
        {
            System.out.println("Eats leaves");
            
        }
        
         void Diseases()
        {
            System.out.println("Plague");
        }
        void Kill()
        {
            System.out.println("Hit");
        }
        
    
    
}

class Mice extends Rodent{
    
     void FoodHabbits()
    {
        System.out.println("Eats Fruits");
        
    }
     void Diseases()
        {
            System.out.println("Abc");
        }
        void Kill()
        {
            System.out.println("Bit");
        }
    
    public static void main(String args[])
    {
        Mice a = new Mice();
        Mice x = new Mice();
        Mice l = new Mice();
        a.FoodHabbits();
        x.Diseases();
        l.Kill();
        
        
    }
}

class Gerbil extends Rodent{
    
    void FoodHabbits()
    {
        System.out.println("Eats Pizza");
        
    }
    void Diseases()
        {
            System.out.println("XYZ");
        }
        void Kill()
        {
            System.out.println("Mortein");
        }
    public static void main(String args[])
    {
        Gerbil b = new Gerbil();
        Gerbil y = new Gerbil();
        Gerbil m = new Gerbil();
        b.FoodHabbits();
        y.Diseases();
        m.Kill();
    }
}

class Hamster extends Rodent{
    
    void FoodHabbits()
    {
        System.out.println("Eats Carrots");
        
    }
    void Diseases()
        {
            System.out.println("Bites");
        }
        void Kill()
        {
            System.out.println("Trap");
        }
    public static void main(String args[])
    {
        Hamster c = new Hamster();
        Hamster z = new Hamster();
        Hamster n = new Hamster();
        
        c.FoodHabbits();
        z.Diseases();
        n.Kill();
    }
}