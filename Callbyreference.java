package lab4;
class Reference{
    int a;
    int b;
    Reference(int a,int b)
    {
     this.a=a;
     this.b=b;
    }
    void dis(Reference R)//passing object(call by reference
    {
       R.a=R.a+10;
       R.b=R.b+10;
        System.out.println("value in dis="+R.a+","+R.b);
    }
}
public class Callbyreference {
 public static void main(String args[])
    {
        Reference R=new Reference(2,3);
        System.out.println("value before call\na="+R.a+",b="+R.b);
          R.dis(R);
        System.out.println("value after call\na="+R.a+",b="+R.b);
    }   
}
