import java.util.Scanner;
 class Recursion1{
	 int fact(int n){
	if(n == 1||n==0){
		return 1;
	}
	else{
            int rec_f=n*fact(n-1);
		return rec_f;	
		}
	}
 }
  class Factorial{      
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	Recursion1 r=new Recursion1();
        System.out.println("Enter a number to find its factorial");
        int a=sc.nextInt();
	System.out.print("Factorial of "+a+" is:"+r.fact(a));
        }
    }