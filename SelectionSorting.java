import java.util.Scanner;

public class SelectionSorting {
    public static void selectionSort(int[] data){
       int i,j,least,temp;
       for(i=0;i<data.length;i++){
           for(j=i+1, least=i; j<data.length;j++){
                if(data[j]<data[least]){
                    least=j;
                    if(i!=least){
                        temp=data[least];
                        data[least]=data[i];
                        data[i]=temp;
                    }
                }
           }
   
        }
    }
    public void result(int[] data){
         System.out.println("The array after selection sorting is: ");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+ " ");
    }

    public static void main(String arg[]){
        SelectionSorting obj1 =new SelectionSorting ();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array for sorting");
        int size=sc.nextInt();
        System.out.println("Enter the element for array");
         int data[]=new int[size];
        for(int i=0;i<size;i++){
             data[i]=sc.nextInt();
        }
        obj1.selectionSort(data);
        obj1.result(data);
    }
}
