import java.util.Scanner;

class Complex{
      
        int real,imag;

        void initialize(int a,int b){
              real = a;
              imag = b;       
          }

        void display(){
        	if(imag<0)
              System.out.println("Complex no is = "+real+"-i"+(-imag));
        	else
        		System.out.println("Complex no is = "+real+"+i"+imag);
         }

        Complex add(Complex a){
              Complex temp = new Complex();
              temp.real=real+a.real;
              temp.imag=imag+a.imag;
              return temp;
        }

        Complex sub(Complex a){
              Complex temp = new Complex();
              temp.real=real-a.real;
              temp.imag=imag-a.imag;
              return temp;
        }

        public static void main(String args[]){

              Complex c1= new Complex();
              Complex c2= new Complex();

              Scanner s = new Scanner(System.in);

              int a1 = s.nextInt();
              int b1 = s.nextInt();
              c1.initialize(a1,b1);

              int a2 = s.nextInt();
              int b2 = s.nextInt();
              c2.initialize(a2,b2);

              Complex c3= c1.add(c2);
              Complex c4= c1.sub(c2);

              System.out.print("Addition : ");
              c3.display();

              System.out.print("Subtraction : ");
              c4.display();

        }
}