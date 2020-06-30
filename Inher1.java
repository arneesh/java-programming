
class Rodent{
    
   
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
   
}

class Inher1{
    
    public static void main(String args[]){
        
        Rodent a[] = new Rodent[4];
        a[0] = new Rodent();
        a[1] = new Mice();
        a[2] = new Gerbil();
        a[3] = new Hamster();
        
        
        
        // OTHER METHOD USING METHOD AND OBJECTS
        
       /* Mice a = new Mice();
        Mice x = new Mice();
        Mice l = new Mice();
        a.FoodHabbits();
        x.Diseases();
        l.Kill();
        
        Gerbil b = new Gerbil();
        Gerbil y = new Gerbil();
        Gerbil m = new Gerbil();
        b.FoodHabbits();
        y.Diseases();
        m.Kill();
        
        Hamster c = new Hamster();
        Hamster z = new Hamster();
        Hamster n = new Hamster();
        
        c.FoodHabbits();
        z.Diseases();
        n.Kill();              */
        
    }
    
}





