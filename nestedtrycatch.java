package exception.handling;
public class nestedtrycatch {
    public static void main(String args[])
    {
        try{ 
           System.out.println("inside block 1");
           //int z=10/0;
            try{
                System.out.println("child 1");
                int a[]={1,2,3};
                a[5]=6;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("exception of child 1");
            }
            try{
                System.out.println("child of 2");
                int b=5/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
                System.out.println("exception of child 2");
            }
        }   
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
            System.out.println("exception of block 1");
        }
    }
}
