
class Time{
 
   int hh,mm,ss;

   void initialize(int a,int b,int c){
        if( a <24 && b<60 && c<60 && a >=0 && b>=0 && c>=0){
              hh = a;
              mm = b;
              ss = c;      
        }else{
                 System.out.println("Invalid values"); 
                 System.exit(0);
                 }
          }
 
  void display(){                   
              System.out.println("Time = "+hh+":"+mm+":"+ss);
         }

  Time add(Time a){
              Time t = new Time();
              t.hh = hh + a.hh;
              t.mm = mm + a.mm;
              t.ss = ss + a.ss;
              
              if(t.ss>=60){
                  t.ss=t.ss-60;
                  t.mm++;
              }
              if(t.mm>=60){
                  t.mm=t.mm-60;
                  t.hh++;
              }
              if(t.hh>=24)
                t.hh=t.hh-24;
  
              return t;
         }

  Time sub(Time a){
              Time t = new Time();
              t.hh = hh - a.hh;
              t.mm = mm - a.mm;
              t.ss = ss - a.ss;
              if(t.ss<0){
                  t.ss=60+t.ss;
                  t.mm--;
              }
              if(t.mm<0){
                  t.mm=60+t.mm;
                  t.hh--;
              }
              if(t.hh<0)
                t.hh=24+t.hh;
  
              return t;
         }

  void compare(Time a){
	        String t=(hh+":"+mm+":"+ss);
              if(hh > a.hh)
                  System.out.println(t+" is larger"); 
              else if(hh < a.hh)
                  System.out.println(t+" is smaller"); 
              else {
                  if(mm > a.mm)
                      System.out.println(t+" is larger"); 
                  else if(mm < a.mm)
                      System.out.println(t+" is smaller"); 
                  else {
                    if(ss > a.ss)
                        System.out.println(t+" is larger"); 
                    else if(ss < a.ss)
                        System.out.println(t+" is smaller"); 
                    else 
                       System.out.println("Both are equal");
                               } 
                      }


               }

    public static void main(String args[]){
              
              Time t1= new Time();
              Time t2= new Time();

              t1.initialize(2,36,0);
              t2.initialize(16,15,15);
              t1.display();
              t2.display();

              Time t3= t1.add(t2);
              Time t4= t1.sub(t2);

              System.out.print("Addition : ");
              t3.display();

              System.out.print("Subtraction : ");
              t4.display();

              System.out.print("Compare : ");
              t1.compare(t2);
     }

}