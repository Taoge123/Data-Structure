
public class RemoveDuplicateSortedList {
	Node head; 
	
	class Node{
		int data;
		Node next;
		Node(int d){data = d; next = null;}
	}
	
	void removeDuplicates(){
		
		Node current = head;
		
		Node next_next;
		
		if(head == null)
			return;
		
		while(current.next != null){
			
			if(current.data == current.next.data){
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			}
			else
				current = current.next;
		}
	}
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RemoveDuplicateSortedList list = new RemoveDuplicateSortedList();
		
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(4);
		list.push(4);
		
		System.out.println("before");
		list.printList();
		
		list.removeDuplicates();
		
		System.out.println("after");
		list.printList();
	
	}
	

}







