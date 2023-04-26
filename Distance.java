
package lab4;
import java.util.Scanner;
class Shape{
    int point1;
    int point2;
}
public class Distance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Shape s=new Shape();
        Shape s1=new Shape();
        System.out.println("Enter two points of a line");
         s.point1=sc.nextInt();
        s.point2=sc.nextInt();
        s1.point1=12;
        s1.point2=11;
        double d1=Math.pow((s1.point1-s.point1),2);
        double d2=Math.pow((s1.point2-s.point2),2);
        double d=Math.sqrt(d1+d2);
        System.out.println("the points are:"+s.point1+","+s.point2+","+s1.point1+","+s1.point2);
        System.out.println("their distance is"+d);
    }
}
