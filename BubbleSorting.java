import java.util.Scanner;

public class BubbleSorting {
    public static void bubbleSort(int[] data){
        int i ,j,temp;
        for(i=0;i<data.length;i++){
            for(j=0;j<data.length-i-1;j++){
                if(data[j]>data[j+1]){
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    
    }
    public void result(int[] data){
        System.out.println("The array after bubble sorting is: ");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i] + " ");
    }

    public static void main(String arg[]){
        BubbleSorting obj =new BubbleSorting ();
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array for sorting");
        int size=sc.nextInt();
        System.out.println("Enter the element for array");
         int data[]=new int[size];
        for(int i=0;i<size;i++){
             data[i]=sc.nextInt();
        }
        
        obj.bubbleSort(data);
        obj.result(data);
    }
}
