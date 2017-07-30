
public class Reverse_LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){data = d; next = null;}
	}
	
	void printReverse(Node head){
		
		if(head == null) return;		
		printReverse(head.next);		
		System.out.println(head.data + " ");
		
	}
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public static void main(String[] args) {
		
		Reverse_LinkedList llist = new Reverse_LinkedList();
		
		llist.push(5);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		
		llist.printReverse(llist.head);
		
	}

}
