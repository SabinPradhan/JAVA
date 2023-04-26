package lab5;
import java.util.Scanner;
class Mul{
int mult(int x,int y)
    {
        if(y==1)
        {
            return x;
        }
        else
        {
            int mu=x*mult(x,y-1);
            return mu;
        }
    }
}
public class Recursion {
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Mul m=new Mul();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("multiplication is:"+m.mult(n,3));
    }  
}
