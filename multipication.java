package lab1.report;
import java.util.Scanner;
class Multipication {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("The multiplication table of "+a+" is:");
      for(int i=1;i<=10;i++)
      {
          System.out.println(a+"*"+i+"="+(a*i));
      }
    }
}
