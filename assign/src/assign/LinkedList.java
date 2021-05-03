package assign;


public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head== null) {
		head=node;
		
	}else {
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	}
		
		
	}
	
	public void show() {
		Node node=head;
		while(node.next != null) {
			System.out.println(node.data);
			node=node.next;
			
		}
		System.out.println(node.data);
	}
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.insert(12);
		l.insert(23);
		l.insert(33);
		
		l.show();

		
		
	}

}

class Node{

int data;
Node next;

}