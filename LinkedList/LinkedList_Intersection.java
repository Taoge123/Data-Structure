class LinkedList_Intersection
{
    Node head; 
 

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    void getUnion(Node head1, Node head2)
    {
        Node t1 = head1, t2 = head2;
 
        while (t1 != null)
        {
            push(t1.data);
            t1 = t1.next;
        }
 
        while (t2 != null)
        {
            if (!isPresent(head, t2.data))
                push(t2.data);
            t2 = t2.next;
        }
    }
 
    void getIntersection(Node head1, Node head2)
    {
        Node result = null;
        Node t1 = head1;


        while (t1 != null)
        {
            if (isPresent(head2, t1.data))
                push(t1.data);
            t1 = t1.next;
        }
    }
 
    /* Utility function to print list */
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
 
 
    /*  Inserts a node at start of linked list */
    void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
 
    /* A utilty function that returns true if data is present
       in linked list  else return false */
    boolean isPresent (Node head, int data)
    {
        Node t = head;
        while (t != null)
        {
            if (t.data == data)
                return true;
            t = t.next;
        }
        return false;
    }
 
 
    /* Drier program to test above functions */
    public static void main(String args[])
    {
    	LinkedList_Intersection llist1 = new LinkedList_Intersection();
    	LinkedList_Intersection llist2 = new LinkedList_Intersection();
    	LinkedList_Intersection unin = new LinkedList_Intersection();
    	LinkedList_Intersection intersecn = new LinkedList_Intersection();
 
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);
 
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);
 
        intersecn.getIntersection(llist1.head, llist2.head);
        unin.getUnion(llist1.head, llist2.head);
 
        System.out.println("First List is");
        llist1.printList();
 
        System.out.println("Second List is");
        llist2.printList();
 
        System.out.println("Intersection List is");
        intersecn.printList();
 
        System.out.println("Union List is");
        unin.printList();
    }
} 