package dsPractise;


class nodeT{
	int key;
	nodeT left,right;
	
	public nodeT(int key) {
		this.key = key;
		left = right = null;
	}
}
public class binaryTree {

	nodeT root;
	
	binaryTree(int key){
		root = new nodeT(key);
		}
	binaryTree(){
		root = null;
	}
	
	public static void main(String args[]) {
		binaryTree tree = new binaryTree();
		
		tree.root = new nodeT(1);
		
		tree.root.left = new nodeT(2);
		tree.root.right = new nodeT(3);
		
		
	}
}
