
interface doctors
{
   public void method1();
   public void method2();
}
class hos1 implements doctors
{
  public void method1()
  {
      System.out.println("Degree");
  }
  public void method2()
  {
      System.out.println("Specialization");
  }
  public static void main(String arg[])
  {
      doctors obj = new hos1();
      obj. method1();
  }
}



























