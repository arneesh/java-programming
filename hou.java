
import java.util.Scanner;
class hou
 {
int h,m,s;
static int count=0;


hou(int h1,int h2,int h3)
{
	hou.count++;
	h=h1;m=h2;s=h3;
}

hou(hou f)
{	
	count++;
	h=f.h;
	m=f.m;
	s=f.s;
}
hou()
{	
	count++;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter hours");
      h = in.nextInt();
	System.out.println("Enter mins");
      m = in.nextInt();
	  System.out.println("Enter seconds");
      s = in.nextInt();
}
public static void main(String[] args)
{
	hou a,b,c,d;
	a=new hou();
	b=new hou(4,5,6);
	c=new hou(a);
	a.display();
	b.display();
	c.display();
	d=a.add(b);
	System.out.println("after adding time is");
	d.display();
	System.out.println("total number of time constructor is called is "+count);
	a=null;
	b=null;
	c=null;
	
	d=null;
	System.gc();
}
public void finalize()
{
	System.out.println("finalize called");
	}  

void display()
{
	System.out.println("new time values are");
	System.out.println(h);
	System.out.println(this.m);
	System.out.println(this.s);
	
}
hou add(hou g)    
{
hou temp=new hou();
count++;
System.out.println("total number of time constructor is called is "+count);
temp.h=h+g.h;
temp.m=m+g.m;
temp.s=s+g.s;
return temp;
}
 }

