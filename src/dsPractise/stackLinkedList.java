package dsPractise;

public class stackLinkedList {
	Node top;
	class Node{
		Node link;
		int data;
	}
	
	public void push(int data) {
		Node new_node = new Node();
		
		new_node.data = data;
		
		new_node.link = top;
		
		top = new_node;
	}
	
	public int peek() {
		return top.data;
		}
	
	public void pop() {
		top = top.link;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	public void show() {
		Node new_node = top;
		
		while(top!=null) {
			System.out.println(">>"+top.data);
			top = top.link;			
		}
	}
	
	public static void main(String[] args) {
		stackLinkedList p = new stackLinkedList();
		System.out.println("isEmpty(): "+p.isEmpty());

		p.push(5);
		p.push(10);
		p.push(15);
		p.push(20);
		p.pop();
		System.out.println("isEmpty(): "+p.isEmpty());

		System.out.println("Peek(): "+p.peek());
		p.show();
		
	}
}
