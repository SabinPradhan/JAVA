import java.util.Scanner;

public class MergeSorting {
    public static void merge (int a[],int l,int m,int r){
        int b[]=new int [a.length];
        int x=l;
        int y=m;
        int k=l;
        while(x<m && y<=r){
            if(a[x]<a[y])
                b[k++]=a[x++];
            else
                b[k++]=a[y++];
        }
        while(x<m){
            b[k++]=a[x++];
        }   
        while(y<=r){
            b[k++]=a[y++];
        }
        for(int i=l; i<=r; i++)
            a[i]=b[i];
    }
    public static void mergesort(int a[],int l,int r){
        int m;
        if(l<r){
            m=(l+r)/2;
            mergesort(a,l,m);
            mergesort(a,m+1,r);
            merge(a,l,m+1,r);
        }
    }
    public void result(int arr[]){
        System.out.println("The array after merge sorting is: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main (String args[]){   
        MergeSorting xyz=new  MergeSorting ();
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array for sorting");
        int size=sc.nextInt();
        System.out.println("Enter the element for array");
         int a[]=new int[size];
        for(int i=0;i<size;i++){
             a[i]=sc.nextInt();
        }
        xyz.mergesort(a,0,a.length-1);
        
        xyz.result(a);
    }
}



