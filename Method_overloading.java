
package lab5;
class Changing_datatype
{
int l;
int b;
int add(int l,int b)
{
return l+b;
}
double add(double l,double b)
{
    return l+b;
}
}
public class Method_overloading {
   public static void main(String args[])
   {
       Changing_datatype C=new Changing_datatype();
       System.out.println("addtion="+C.add(2,3));
       System.out.println("addtion="+C.add(5.0,6.0));
       
   }
}
