
public class Tree {
	int value;
	Tree leftnode;
	Tree rightnode;
	
	public Tree(int value){
		this.value= value;
	}
	
	public static void main(String... args){
		BST test = new BST();
		
		Tree tree1= new Tree(50);
		Tree tree2= new Tree(55);
		Tree tree3= new Tree(60);
		Tree tree4= new Tree(40);
		Tree tree5= new Tree(45);
		Tree tree6= new Tree(57);
		Tree tree7= new Tree(67);
		Tree tree8= new Tree(33);
		Tree tree9= new Tree(30);
		Tree tree10 = new Tree(20);
		Tree tree11 = new Tree(22);
		
		test.add(tree1);
		test.add(tree2);
		test.add(tree3);
		test.add(tree4);
		test.add(tree5);
		test.add(tree6);
		test.add(tree7);
		test.add(tree8);
		test.add(tree9);
		test.add(tree10);
		test.add(tree11);
		
		System.out.println(test);
		test.inOrderTraversal(test.root);
		System.out.println(test.findTheDepth(test.root));
	}

}

class BST {

	Tree root;

	public void add(Tree node) {
		boolean flag = true;

		if (this.root == null) {
			System.out.println("root is null so creating the root and returning");
			root = node;
			return;
		}
		Tree focus = root;
		while (flag) {

			if (node.value > focus.value) {
				if (focus.rightnode == null) {
					focus.rightnode = node;
					flag = false;
				} else {
					focus = focus.rightnode;
				}

			} else {
				if (node.value < focus.value) {
					if (focus.leftnode == null) {
						focus.leftnode = node;
						flag = false;
					} else {
						focus = focus.leftnode;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Tree node){
		if(node==null){
			return;
		}
		inOrderTraversal(node.leftnode);
		System.out.println(node.value);
		inOrderTraversal(node.rightnode);
	}
	public int findTheDepth(Tree node){
		if(node==null){
			return 0;
		}
		int leftDepth = findTheDepth(node.leftnode);
		int rightDepth = findTheDepth(node.rightnode); 
		if(leftDepth>rightDepth){
			return leftDepth+1;
		}else{
			return rightDepth+1;
		}
	}
}
