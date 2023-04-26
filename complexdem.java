class Complex
{
    int real;
    int imaginary;
    Complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public void display()
    {
        System.out.println(real+"+"+imaginary+"*i");
    }
}
class Complex1 extends Complex{
    int rel;
    int img;
    Complex1(int real,int imaginary,int rel,int img)
    {
        super(real,imaginary);
        this.rel=rel;
        this.img=img;
    }
    void add()
    {
        super.display();
        System.out.println(this.rel+"+"+this.img+"*i");

      int re=super.real+rel;
       int im=super.imaginary+img;
       System.out.println(re+"+"+im+"*i");
    }
    
}
public class complexdem {
    public static void main(String args[])
    {
        //Object obj=new Complex(3,2);
     Complex1 co=new Complex1(3,2,5,2);
     co.add();
    }
}
