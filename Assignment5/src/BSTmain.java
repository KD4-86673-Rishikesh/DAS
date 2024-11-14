
public class BSTmain {

	public static void main(String[] args) 
	{
		BST bst=new BST();
//		bst.addNode(8);
//		bst.addNode(3);
//		bst.addNode(10);
//		bst.addNode(2);
//		bst.addNode(6);
//		bst.addNode(4);
//		bst.addNode(7);
//		bst.addNode(9);
//		bst.addNode(15);
//		bst.addNode(14);
		bst.recursiveAddNode(8);
		bst.recursiveAddNode(3);
		bst.recursiveAddNode(10);
		bst.recursiveAddNode(2);
		bst.recursiveAddNode(6);
		bst.recursiveAddNode(4);
		bst.recursiveAddNode(7);
		bst.recursiveAddNode(9);
		bst.recursiveAddNode(15);
		bst.recursiveAddNode(14);
		
		System.out.println("POSTORDER:");
		bst.postOrder();
		System.out.println();
		if(bst.binaryRecursiveSearch(10)!=null)
		      System.out.println("Element Found !!!");
		else
		      System.out.println("Element not Found !!!");
		if(bst.binaryRecursiveSearch(100)!=null)
		      System.out.println("Element Found !!!");
		else
		      System.out.println("Element not Found !!!");
		
		
		

	}

}
