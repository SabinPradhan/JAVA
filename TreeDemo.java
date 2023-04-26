class IntBSTNode {
    public int key;
    public IntBSTNode left, right;

    public IntBSTNode() {
        left = right = null;
    }

    public IntBSTNode(int el) {
        this.key = el;
        left = right = null;
    }

    public IntBSTNode(int el, IntBSTNode lf, IntBSTNode rt) {
        key = el;
        left = lf;
        right = rt;
    }
}

 class IntBST {
    //root node
    public IntBSTNode root;

    public IntBST() {
        root = null;
    }

    public void visit(IntBSTNode el) {
        System.out.print(el.key + " ");
    }

    public void insert(int el) {
        IntBSTNode p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.key < el) {
                p = p.right;
            } else
                p = p.left;
        }
        if (root == null) {
            root = new IntBSTNode(el);

        } else if (prev.key < el) {
            prev.right = new IntBSTNode(el);
        } else {
            prev.left = new IntBSTNode(el);
        }
    }

    public IntBSTNode search(IntBSTNode p, int el) {
        while (p != null) {
            if (el == p.key) {
                return p;
            } else if (el < p.key) {
                p = p.left;
            } else p = p.right;

        }
        return null;
    }
    public void preorder(IntBSTNode p)//VLR
    {
        if(p!=null)
        {
            visit(p);
            preorder(p.left);
            preorder(p.right);
        }
    }
    public void inorder(IntBSTNode p)//LVR
    {
        if(p!=null)
        {
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }
    public void postorder(IntBSTNode p)//LRV
    {
        if(p!=null)
        {
            postorder(p.left);
            postorder(p.right);
            visit(p);

        }
    }

    public void deleteByCopying(int el) {
        IntBSTNode node, p = root, prev = null;
        while (p != null && p.key != el)
        {
            prev = p;

            if (p.key < el)
                p = p.right;
            else p = p.left;
        }
        node = p;
        if (p != null && p.key == el) {
            if (node.right == null)
                node = node.left;
            else if (node.left == null)

                node = node.right;
            else {
                IntBSTNode tmp = node.left;

                IntBSTNode previous = node;

                while (tmp.right != null) {
                    previous = tmp;
                            tmp = tmp.right;
                }
                node.key = tmp.key;
                if (previous == node)

                    previous.left = tmp.left;
                else previous.right = tmp.left;
            }
            if (p == root)
                root = node;
            else if (prev.left == p)
                prev.left = node;
            else prev.right = node;
        }
        else if (root != null)
            System.out.println("key " + el + " is not in the tree");
        else System.out.println("the tree is empty");
    }

    //breadth first traversal
    public void breadthFirst()
    {
        IntBSTNode p=root;
        Queue queue=new Queue(15);
        if(p!=null)
        {
            queue.enqueue(p);
            while(!queue.isEmpty()){
                p=queue.dequeue();
                visit(p);
                if(p.left!=null)
                {
                    queue.enqueue(p.left);
                }
                if(p.right!=null)
                {
                    queue.enqueue(p.right);
                }
            }
        }

    }
}
class Queue {
    public int front, rear;
    public IntBSTNode[] queuearray;
    public int maxsize;

    public Queue(int maxsize) {
        front = rear = -1;
        this.maxsize = maxsize;
        queuearray = new IntBSTNode[maxsize];
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return ((front == rear + 1) || (front == 0 && rear == maxsize - 1));
    }

    public IntBSTNode dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        } else if (front == rear) {
            IntBSTNode deleted_node = queuearray[front];
            front = rear = -1;
            return deleted_node;
        } else {
            IntBSTNode deleted_no = queuearray[front];
            front = (front + 1) % maxsize;
            return deleted_no;
        }


    }

    public void printAll() {
        int temp=front;
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }
        System.out.print(queuearray[temp]);
        while(temp!=rear)
        {
            temp=(temp+1)%maxsize;
            System.out.print("-->"+queuearray[temp]);
        }
        System.out.println();
    }

    public void enqueue(IntBSTNode element) {
        if (isEmpty()) {
            rear++;
            queuearray[rear] = element;
            front++;
        } else if (isFull()) {
            System.out.println("queue is full");
        } else {
            rear = (rear + 1) % maxsize;
            queuearray[rear] = element;
        }
    }


}


class TreeDemo {
    public static void main(String[] args) {
        IntBST mytree = new IntBST();
        mytree.insert(12);
        mytree.insert(9);
        mytree.insert(18);
        mytree.insert(1);
        mytree.insert(11);
        mytree.insert(14);
        mytree.insert(27);
        //mytree.visit(mytree.root.left.left);
        if(mytree.search(mytree.root, 14)!=null){
            System.out.println("searched element is in the tree");
        }
        else
        {
            System.out.println("no such element is in the tree");
        }
//        System.out.println("\ninorder traversal");
//        mytree.inorder(mytree.root);
//        System.out.println("\npreorder traversal");
//        mytree.preorder(mytree.root);
        System.out.println("\npostorder traversal");
        mytree.postorder(mytree.root);
        System.out.println("\nBreadth First traversal");
        mytree.breadthFirst();
        System.out.println("After deletion");
        mytree.deleteByCopying(18);
        mytree.postorder(mytree.root);

    }
}
//preorder traversal(VLR)
//postorder(LVR)
//inorder traversal(LRV)e




