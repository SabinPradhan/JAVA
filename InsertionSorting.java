import java.util.Scanner;
class InsertionSorting{
    public void insertionsort(int[] data){
        int i,j,temp;
        for(i=1;i<data.length;i++){
            temp=data[i];
            for(j=i;j>0&&temp<data[j-1];j--){
                data[j]=data[j-1];
                
            }
            data[j]=temp;
        }
        
    }
    public void printArray(int data[])
    {
      
        System.out.println("The array after insertion sorting is ");
        for (int i = 0; i < data.length;i++)
            System.out.print(data[i] + " ");
 
       // System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array for sorting");
        int size=sc.nextInt();
        System.out.println("Enter the element for array");
         int data[]=new int[size];
        for(int i=0;i<size;i++){
             data[i]=sc.nextInt();
        }
        
        InsertionSorting ob=new InsertionSorting();
        ob.insertionsort(data);
        ob.printArray(data);
    }
}
