
package lab4;
class Parameterized{
    int l;
    int b;
    Parameterized(int l,int b){
        this.l=l;
        this.b=b;
    }       
}
public class Parameterized_constructor {
    public static void main(String args[])
    {
      Parameterized p=new Parameterized(2,3);
      int area=p.l*p.b;
      System.out.println("the area is:"+area);
    }
}
