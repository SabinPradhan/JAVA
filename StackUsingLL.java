import java.util.Scanner;

class LLStack{
    private java.util.LinkedList list=new java.util.LinkedList();
    public LLStack(){
        
    }
    public void clear(){
        list.clear();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void topE1(){
        if(!isEmpty()){
            System.out.println("Top element is "+ list.getLast()) ;
        }
        else{
            System.out.println("Stack is empty");
        }
        
    }
    public Object pop(){
        if(isEmpty())
           System.out.println("stack is empty");
       
        return list.removeLast();
    }
    public void push(Object el){
        list.addLast(el);
    }
    public String toString(){
        return list.toString();
    }
}
public class StackUsingLL {
    public static void main(String[] args){
        LLStack ob=new LLStack();
         System.out.println("stack using linked list menu\n1.To clear the stack \n2.To check if stack is empty\n3.To print top element in stack \n4.To push in stack\n5.To pop in stack\n6.TO exit");
       while(true){
          
           int choice,data;
           System.out.println("Enter your choice");
           Scanner sc=new Scanner(System.in);
           choice=sc.nextInt();
           switch(choice){
               case 1:
                   
                    ob.clear();
                    System.out.println("stack is cleared");
                   break;
               case 2:
                   System.out.println("the stack is empty:"+ ob.isEmpty());
                   break;
               case 3:
                  
                ob.topE1()  ;
                   break;
               case 4:
                   System.out.println("enter a number to push in an stack");
                    data=sc.nextInt();
                   ob.push(data);
                   break;
               case 5:
                    ob.pop();
                   break;
             
                   
               case 6:
                   return;
               default:
                   System.out.println("invalid choice");
           }
       }
    }
}