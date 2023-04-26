
package lab5;
class Stat{
    static int count=0;
    double l;
    double b;
    Stat()
    {
        System.out.println("Static example");
        count++;
    }
    Stat(int l,int b)
    {
        System.out.println("the area is"+(l*b));
        count ++;
    }
    Stat(double l,double b)
    {
     this.l=l;
     this.b=b;
     count ++;
    }
    //double add()
   // {
     //   return l+b;
    //}
}
public class Static_Demo {
    public static void main(String args[])
    {
        Stat s=new Stat();
        Stat s1=new Stat(2,3);
        Stat s2=new Stat(3.0,4.0);
        //System.out.println("the addition is"+s2.add());
        System.out.println("the number of times object has been created is:"+Stat.count);
    }
}
