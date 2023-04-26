package lab1.report;
import java.util.Scanner;
class prime {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    boolean ch=true;
    System.out.println("Enter a number:");
    int a=sc.nextInt();
     System.out.println("Enter a number:");
     int b=sc.nextInt(); 
    for(int i=2;i<a;i++)
    {
        if(a%2==0)
            ch=false;
        break;
    }
    if(ch)
    { 
     for(int i=2;i<b;i++)
    {
        if(b%2==0)
            ch=false;
        break;
    }
    }
    if(ch)
    {
        int c=a+b;
        System.out.println("tne addition is:"+c);
    }
    else
        System.out.println("enter prime numbers");
    }
}
