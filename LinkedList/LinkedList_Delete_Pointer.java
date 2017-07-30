
public class LinkedList_Delete_Pointer {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d) {data = d; next = null;}
	}
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList(){
		Node tNode = head;
		while(tNode != null){
			System.out.println(tNode.data + " ");
			tNode = tNode.next;
		}
	}
	
	public void deleteNode(Node Node_ptr){
		Node temp = Node_ptr.next;
		Node_ptr.data = temp.data;
		Node_ptr.next = temp.next;
		temp = null;
	}
	
	public static void main(String[] args) {
		LinkedList_Delete_Pointer llist = new LinkedList_Delete_Pointer();
		
		llist.push(1);
		llist.push(4);
		llist.push(5);
		llist.push(7);
		llist.push(9);
		
		System.out.println("Before deleting");
		llist.printList();
		
		llist.deleteNode(llist.head);
		
		System.out.println("\n After deleting");
		llist.printList();
		
	}
	
	
	
}




