package lab4;
class Callvalue
{
    int a;
    int b;
    void dis(int a,int b)
    {
        a=a+10;
        b=b+10;
        System.out.println("value in dis="+a+","+b);
    }
}
public class Callbyvalue {
    public static void main(String args[])
    {
        int a=2;
        int b=3;
        Callvalue C=new Callvalue();
        System.out.println("value before call:\na="+a+",b="+b);
                C.dis(a,b);
        System.out.println("value after call:\na="+a+",b="+b);
    }
}
