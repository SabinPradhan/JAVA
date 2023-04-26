
package lab4;
class Box{
    int l;
    int b;
    int h;
    
    void setdata(int le,int br,int he)
    {
        l=le;
        b=br;
        h=he;  
    }
    int volume()
    {
        return l*b*h;
    }
}
public class Method {
    public static void main(String args[])
    {
        Box b=new Box();
        Box b1=new Box();
        b.l=1;
        b.b=2;
        b.h=3;
        b1.setdata(2, 2, 3);
        System.out.println("the vlume of 1st box is:"+b.volume());
       System.out.println("the volume of 2nd box is:"+b1.volume());
                }
}
