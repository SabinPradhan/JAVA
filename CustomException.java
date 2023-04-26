class CustomException extends Exception{
public String toString()
{
    return "I am from custom demo";
}
}
class customDemo {
public static void main(String args[])
{
try {
int a=1;
if(a==1)
{
throw new CustomException();
}
}
catch (CustomException ex) {
System.out.println(ex);
}
}

}