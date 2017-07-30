

public class RemoveDuplicateUnsortedList {
	
	static Node head;
	static class Node{
		int data;
		
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void remove_duplicates(){
		Node ptr1 = null; 
		Node ptr2 = null; 
		Node dup = null;
		ptr1 = head;
		
		while(ptr1 != null && ptr1.next != null){
			ptr2 = ptr1;
			while(ptr2.next != null){
				if(ptr1.data == ptr2.next.data){
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}else{
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
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
		RemoveDuplicateUnsortedList list = new RemoveDuplicateUnsortedList();
		
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(5);
		list.push(5);
		list.push(5);
		
		System.out.println("before");
		list.printList();
		
		list.remove_duplicates();
		
		System.out.println("after");
		list.printList();
	
	}

}
