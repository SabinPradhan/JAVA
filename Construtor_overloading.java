package lab5;
class Constructor
{
    int length;
    int breadth;
    int height;
    Constructor(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    Constructor()
    {
        System.out.println("this s the example of constructor overloding");
    }
    Constructor(int length,int breadth,int height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    int area()
    {
        return length*breadth;
    }
    int volume()
    {
        return length*breadth*height;
    }
}
public class Construtor_overloading {
    public static void main(String args[])
    {
        Constructor C=new Constructor();
        Constructor C1=new Constructor(2,3);
        Constructor C2=new Constructor(2,2,3);
        System.out.println("the area is"+C1.area());
        System.out.println("the volume is"+C2.volume());
    }
}
