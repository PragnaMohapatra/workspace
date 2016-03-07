import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	int value;
	TreeNode leftnode;
	TreeNode rightnode;
	
	public TreeNode(int value){
		this.value= value;
	}
	
	public static void main(String... args){
		BST test = new BST();
		
		TreeNode TreeNode1= new TreeNode(50);
		TreeNode TreeNode2= new TreeNode(55);
		TreeNode TreeNode3= new TreeNode(60);
		TreeNode TreeNode4= new TreeNode(40);
		TreeNode TreeNode5= new TreeNode(45);
		TreeNode TreeNode6= new TreeNode(57);
		TreeNode TreeNode7= new TreeNode(67);
		TreeNode TreeNode8= new TreeNode(33);
		TreeNode TreeNode9= new TreeNode(30);
		TreeNode TreeNode10 = new TreeNode(20);
		TreeNode TreeNode11 = new TreeNode(22);
		
		test.add(TreeNode1);
		test.add(TreeNode2);
		test.add(TreeNode3);
		test.add(TreeNode4);
		test.add(TreeNode5);
		test.add(TreeNode6);
		test.add(TreeNode7);
		test.add(TreeNode8);
		test.add(TreeNode9);
		test.add(TreeNode10);
		test.add(TreeNode11);
		
		/*System.out.println(test);
		test.inOrderTraversal(test.root);
		System.out.println(test.findTheDepth(test.root));*/
		List<Integer> input = new ArrayList<Integer>();
		System.out.println(BST.isSameTreeNode(TreeNode1, TreeNode1));
		System.out.println(input);
		
	}

}

class BST {

	TreeNode root;

	public void add(TreeNode node) {
		boolean flag = true;

		if (this.root == null) {
			System.out.println("root is null so creating the root and returning");
			root = node;
			return;
		}
		TreeNode focus = root;
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
	
	public static void inOrderTraversal(TreeNode node){
		if(node==null){
			return;
		}
		inOrderTraversal(node.leftnode);
		System.out.println(node.value);
		inOrderTraversal(node.rightnode);
	}
	public int findTheDepth(TreeNode node){
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
	
	public static boolean isSameTreeNode(TreeNode p, TreeNode q) {
		
		if(p==null && q==null){
			return true;
		}
		if(p!=null && q==null){
			return false;
		}
		if(p==null && q!=null){
			return false;
		}
		
		List<Integer> tree1 = new ArrayList<>();
		List<Integer> tree2 = new ArrayList<>();
		tree1 = preOrder(p,tree1);
		tree2 = preOrder(q,tree2);
		for(int i=0;i<tree1.size();i++){
			if(tree1.get(i)!=tree2.get(i)){
				return false;
			}
		}
		
		return true;
	}
	
	public static List<Integer> preOrder(TreeNode node,List<Integer> list){
		
		if(node==null){
			return list;
		}
		
		list=preOrder(node.leftnode,list);
		list.add(node.value);
		list=preOrder(node.rightnode,list);
		
		return list;
	}
}
