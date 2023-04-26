import java.util.Scanner;

class IntegerSLLNode {

    public int info; //primitive datatype
    public IntegerSLLNode next;//user defined data type(node type)reference variable

    public IntegerSLLNode(int i) {
        this.info = i;
        this.next = null;
    }

    public IntegerSLLNode(int i, IntegerSLLNode next) {//two argument constructor
        info = i;
        this.next = next;
    }
}

class LinkedList {

    public IntegerSLLNode head, tail;

    public LinkedList() {
        head = tail = null;
    }

    //TO check link list is empty or not
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    //To insert at head
    public void insertAtHead(int el) {
        head = new IntegerSLLNode(el, head);
        if (tail == null) {
            tail = head;//time complexity O(1) ////  
        }
    }

    //TO delete from head whose time complexity is O(1)
    public int deleteFromHead() {
        int el = head.info;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return el;
    }

    //TO insert at tail
    public void insertAtTail(int el) {
        if (!isEmpty()) {
            tail.next = new IntegerSLLNode(el);
            tail = tail.next;
        } else {
            head = tail = new IntegerSLLNode(el);
        }
    }
//TO delete from head whose time complexity is O(1)

    public int deleteFromTail() {
        int el = tail.info;
        if (head == tail) {
            head = tail = null;
        } else {
            IntegerSLLNode temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail=temp;
            tail.next=null;
        }
        return el;
    }

    //To insert at any postion whose time complexity is O(n)
    public void insertAtAnyPos(int pos, int el) {
        
        if (pos == 1) {
            insertAtHead(el);
            return;
        }
        if (!isEmpty()) {
            IntegerSLLNode tmp = head;
            IntegerSLLNode newNode = new IntegerSLLNode(el);
            for (int k = 1; k < pos - 1; k++) {
                tmp = tmp.next;
                if (tmp == null) {
                    System.out.println("\nnumber of node is less ");
                    return;
                }
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        } else {
            System.out.println("list is empty");
        }
    }

    //To delete from any postion whose time comlextiy is O(n)
    public void deleteAtAnyPos(int pos) {
        if (pos == 1) {
            deleteFromHead();
            return;
        }
        if (!isEmpty()) {
            IntegerSLLNode tmp = head;
            IntegerSLLNode delnode;
            for (int k = 1; k < pos - 1; k++) {
                tmp = tmp.next;
                if (tmp == null) {
                    System.out.println("\nthe postion is less than size of linked list");
                    return;
                }
            }
            delnode = tmp.next;
            tmp.next = delnode.next;
        } else {
            System.out.println("\nlist is empty");
        }

    }

    //TO print all data of linked list
    public void printAll() {
        IntegerSLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.info + "->");
            temp = temp.next;//time complexity O(n)
        }
    }

    //to serach key whose time complexity is O(n)
    public boolean isInList(int el) {
        boolean inlist = false;
        IntegerSLLNode tmp = head;
        while (tmp != null) {
            if (tmp.info == el) {
                inlist = true;
                break;

            }
           
            tmp = tmp.next;
        }
        return inlist;
    }
    
}

public class Create {

    public static void main(String args[]) {
        System.out.println("Singly linked list created");
        LinkedList mylist = new LinkedList();
        System.out.println("Singly linked list creation menu:\n1.To check if the lst is empty or not\n2.To add a node at head\n3.To delete a node from head\n4.To add node at tail\n5.To delete a node from tail\n6.To insert node at any position\n7.To delete from any position\n8.To search a node in the list\n9.To traverse the list\n10.exit");
        while(true){
             System.out.println();         
            System.out.println("enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            int data,pos;
            switch(choice){
                case 1:
                    System.out.println("The current Singly linked list is:" +mylist.isEmpty());
                    break;
                    
                case 2:
                    System.out.println("you have chosen to add node at head");
                    System.out.println("enter an element");
                     data=sc.nextInt();
                    mylist.insertAtHead(data);
                    break;
                    
                case 3:
                    System.out.println("Sucessfully deleted from head "+mylist.deleteFromHead());
                    break;
                    
                case 4:
                    System.out.println("you have chosen to add node at tail");
                    System.out.println("enter an element");
                    data=sc.nextInt();
                    mylist.insertAtTail(data);
                    break;
                    
                case 5:
                    System.out.println("Sucessfully deleted from tail "+mylist.deleteFromTail());
                    break;
                    
                case 6:
                    System.out.println("you have chosen to add node at any position");
                    System.out.println("enter an position");
                     pos=sc.nextInt();
                     if(pos==0){
                         System.out.println("the list starts from 1 index");
                     }
                     else{
                    System.out.println("enter an element");
                    data=sc.nextInt();
                   mylist.insertAtAnyPos(pos,data);
                     }
                    break;
                    
                case 7:
                    System.out.println("you have chosen to delete node at any position");
                    System.out.println("enter an position");
                     pos=sc.nextInt();
                     if(pos==0){
                         System.out.println("the list starts from 1 index");
                     }
                     else{
                    mylist.deleteAtAnyPos(pos);
                     }
                    break;
                    
                case 8:
                  System.out.println("enter an element to search a node in the list ");
                  int search= sc.nextInt();
                 System.out.println("the searched node is in the list: "+ mylist.isInList(search));
                  break;
                  
                case 9:
                    System.out.println(" traversal of list is:");
                    mylist.printAll();
                  break;
                  
                case 10:
                    return;
                    
                default:
                    System.out.println("invalid choice data");
                
                    
            }
        }
    }
}