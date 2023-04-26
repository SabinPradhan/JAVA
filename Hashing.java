
import java.util.Scanner;

public class Hashing {
    int tablesize;
    Integer[] arr;
    public Hashing(int tablesize)
    {
        this.tablesize=tablesize;
        arr=new Integer[tablesize];
    }
    public int hashfunction(int key)
    {
        return key%this.tablesize;
    }
    public boolean collision(int index)
    {
        return (arr[index]!=null);
    }
    public void inserthash(int key)
    {

        int index=hashfunction(key);
        int i=1;

        while(collision(index))
        {
            index=(hashfunction(key)+i)%this.tablesize;
            i++;
        }
        arr[index]=key;
    }
    public void search(int key)
    {
        boolean found= false;
        int index=hashfunction(key);
        int i=1;
        if(arr[index]==key)
        {
            found=true;
        }
        
        else {
            while (arr[index] != key && i <= arr.length ) {
                index = (hashfunction(key) + i) % this.tablesize;
                if (arr[index] == key) {
                    found = true;
                    break;
                }
                
                i++;

            }
        }

        if(found)
        {
            System.out.println(key+"is found in table");
        }
        else
        {
            System.out.println("not found");
        }



    }
    void deletehash(int key)
    {
        boolean found= false;
        int index=hashfunction(key);
        int i=1;
        if(arr[index]==key)
        {
            found=true;
        }
        else {
            while (arr[index] != key && i <= arr.length && arr[index]==null) {
                index = (hashfunction(key) + i) % this.tablesize;
                if (arr[index] == key) {
                    found = true;
                    break;
                }
                
                i++;

            }
        }
        if(found)
        {
            int keytodelete=arr[index];
            arr[index]=null;
            System.out.println(keytodelete+"deleted fromt table");
        }
        else
        {
            System.out.println("no such element");
        }
    }
    public void printAll()
    {
        for (Integer var:arr
             ) {
            System.out.println(var);
        }
    }
}

class Hashdemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of hashing table");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the key");
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        Hashing h=new Hashing(size);
        for(int i=0;i<size;i++){
                   h.inserthash(arr[i]);

        }
        
       
//        for (int var:arr) {
//            h.inserthash(var);
//        }
System.out.println("elements after hashing");
        h.printAll();
 
 System.out.println(" element you want to delete");
       h.deletehash(sc.nextInt());
       
         System.out.println("element you want to search");
       h.search(sc.nextInt());
        h.printAll();
    }

}