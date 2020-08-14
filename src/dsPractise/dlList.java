package dsPractise;

public class dlList {

	dllNode head;
	dllNode tail;
	int length;
	
	public dlList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	 
	 public boolean addFirst(int data) {
		 	dllNode new_node = new dllNode(data);
		 	
		 	
		 		new_node.next = head;
		 		new_node.prev =  null;
		 		if(head!=null)
		 		{
		 		head.prev =new_node;
		 		}
		 	head = new_node;
		 	return true;
		}
	 
	 public boolean append(int data) {
		 	
		 dllNode new_node = new dllNode(data);
		 dllNode last = head;
		 
		 new_node.next = null;
		 if(head == null) {
			 new_node.next = head;
			 head = new_node;
			 return true;
		 }
		 
		 
		 while(last.next != null) {
			 last = last.next;
		 }
		 last.next = new_node;
		 new_node.prev = last;
		 return true;
	 }
	 
	 public boolean addIndex(int data, int index) {
		 int jump = 0;
		 dllNode new_node = new dllNode(data);
		 dllNode x = head;
		 while(jump<index-1) {
			 x=x.next;
			 jump++;
		 }
		 new_node.prev = x;
		 x.next.prev = new_node;
		 new_node.next = x.next;
		 return true;
	 }
	 public void show(dllNode x) {
		 dllNode n = null;
		while(x!=null) {
			System.out.println(x.data);
			n = x;
			x = x.next;	
		}
		
		//Reverse printiting
		while(n!=null) {
			System.out.println(">>"+n.data);
			n=n.prev;
		}
	 }
	 
	 public static void main(String args[]) {
		 dlList n = new dlList();
		 n.append(5);
		 n.append(10);
		 n.addFirst(0);
		 n.addIndex(4,1);
		 n.show(n.head);
	 }
}