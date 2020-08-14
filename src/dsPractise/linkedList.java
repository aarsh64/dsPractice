package dsPractise;

public class linkedList {
	
	Node head;
	int count;
	
	linkedList(){
		head = new Node(1);
		count = 0;
	}
	
	public boolean add(int d) {
		Node new_node  = new Node(d);
		Node temp = head;
		
		while(temp.next != null) {
			temp=temp.next;
		}
		temp.next = new_node;
		count++;
		System.out.println("Data: "+new_node.data+ " is added");
	return true;
	}
	
	public boolean addIndex(int index, int data) {
		Node new_node = new Node(data);
		Node current = head;
		int jump;
		if(index>count | index<1) {
			System.out.println("ERROR!");
		}
		else {
			jump = 0;
			while(jump<index-1) {
				current = current.next;
				jump++;
			}
			new_node.next = current.next;
			current.next = new_node;
		}
		return true;
	}
	
//	public boolean delF() {
//		Node temp = head;
//		head = head.next;
//		temp.next = null;
//		
//		return true;
//	}
//	public boolean delL() {
//		Node temp = head;
//		while(temp.next.next!=null) {
//			temp = temp.next;
//		}
//		temp.next = null;
//		return true;
//	}
//	public boolean delM(int index) {
//		Node temp = head;
//		int jump = 0;
//		while(jump<index-1) {
//			temp = temp.next;
//			jump++;
//		}
//		System.out.println("Deleted number is: "+temp.next.data+ " From index "+index);
//		temp.next = temp.next.next;
//		return true;
//	}
	
	public void show() {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
				System.out.println(">>"+temp.data);	
			}
	}
	
	public boolean del() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp= temp.next;
		}
		temp.next = null;
		System.out.println("DEl"+temp.data);
		return true;
	}
	public void nThNode(int index) {
		Node temp = head;
		int len = 0;
		while(temp.next!=null) {
			temp=temp.next;
			len++;
		}
		if(len<index)
			return;
		
		temp = head;
		for(int i =0;i<len-index+1;i++) {
			temp = temp.next;
		}
		System.out.println(temp.data);
		
	}

	public boolean circularOrNot(Node head) {
		
	
		if(head == null) 
			return true;
	
		Node temp = head.next;
		
			while(temp!=null && temp!=head) {
				temp= temp.next;
			}
		
		return (temp==head);
	}
	
	public static void main(String args[]) {
		linkedList p = new linkedList();
		p.add(5);
		p.add(10);
		p.add(15);
		p.add(20);
		p.add(25);
		p.addIndex(1,0);
		p.show();
		p.del();
//		p.delL();
//		p.delM(3);
		p.show();
		p.nThNode(3);
	System.out.println("Circular or not: "+p.circularOrNot(p.head));
		}
	
	}
