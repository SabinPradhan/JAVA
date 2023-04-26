interface calc
{
    int add(int a,int b);
    int subtraction(int a,int b);
    int multiple(int a,int b);
    float divide(int a,int b);
}
class Calculator implements calc
{
    //@Override
    public int add(int a,int b)
    {
        return a+b;
    }
   // @Override
  public  int subtraction(int a,int b)
  {
      return a-b;
    }
    //@Override
  public int multiple(int a,int b)
  {
      return a*b;
  }
    //@Override
  public float divide(int a,int b)
  {
      return a/b;
  }
}
public class calculate {
   public static void main(String args[])
 {
     Calculator obj=new Calculator();
    // obj.add(2,3);
     //obj.subtraction(3,4);
     //obj.multiple(5,6);
     //obj.divide(9,3);
     System.out.println("the addition of a and b is "+obj.add(2,3));
     System.out.println("the subtraction of a and b is "+obj.subtraction(7,3));
     System.out.println("the multipliaction of a and b is "+obj.multiple(5,3));
     System.out.println("the division of a and b is"+obj.divide(9,3));
 }  
}
