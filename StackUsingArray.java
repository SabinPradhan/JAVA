import java.util.Scanner;
class MyStack {
   private int STACKSIZE;
    private Integer stack[];
    MyStack(int STACKSIZE)
    {
    this.STACKSIZE = STACKSIZE;
    stack= new Integer[this.STACKSIZE];
    }
    int TOP=-1; //set value of top less than minimum size of stack as index of staack also starts form 0

   
    public void push(int data){
       if(TOP==STACKSIZE-1) {
           System.out.println("Stack Overflow"); //if user request to put data at index greater than 10 print  
       }
       else{
           TOP++;
           stack[TOP]=data;//top ko value maximum size samma napugnu jel samma data push garne
       }
    }
 public int pop(){
     if(TOP==-1){//user ley stack empty huda pane pop garna khojko ke print garna
         System.out.println("Stack Underflow");
     }
     else{
         System.out.println("Item deleted:"+stack[TOP]);//yade stack empty xaina vanya print garna
         TOP--;
     }
     return 0;
 }
 public int peek(){
     if(TOP==-1){//stack empty xa ke xaina check garna
         System.out.println("Stack Empty");
     }
     else{//yade empty xaina vanya stack ma top ma k xa tao dispaly garna
         System.out.println("Item at top:"+stack[TOP]);
     }
     return 0;
 }
public void view(){
if(TOP==-1){
    System.out.println("Stack emply");
}
else{
    for(int i=TOP;i>=0;i--){//stack ma k k data xa vanyaraw display garna ko lagi
        System.out.print(stack[i]+" ");
    }
    System.out.println("");
}
}
}
 class StackUsingArray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of stack");
         int STACKSIZE=sc.nextInt();
       MyStack ob=new MyStack(STACKSIZE);
        System.out.println("stack using array menu\n1.To push in stack\n2.To pop in stack\n3.To peek \n4.To view\n5.TO exit");
       while(true){
           int choice,data;
           System.out.println("Enter your choice");
          
           choice=sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("enter a number to push in any array");
                    data=sc.nextInt();
                    ob.push(data);
                   break;
               case 2:
                   ob.pop();
                   break;
               case 3:
                  
                   ob.peek();
                   break;
               case 4:
                   System.out.println("The elements in satck are: ");
                   ob.view();
                   break;
               case 5:
                   return;
               default:
                   System.out.println("invalid choice");
           }
       }
}
 }