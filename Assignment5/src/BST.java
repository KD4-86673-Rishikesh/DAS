
public class BST {
   static class Node{
	   private int data;
	   private Node left,right;
	   
	   public Node(int value)
	   {
		  data=value;
		  left=right=null;
	   }
	   
   }
   private Node root;
   
   BST()
   {
	   root=null;
   }
    boolean isEmpty()
    {
    	return root==null;
    }
    
    public void addNode(int value)
    {
    	Node newnode=new Node(value);
    	if(root==null)
    		root =newnode;
    	else
    	{
    	   Node trav=root;
    	   while(true)
    	   {
    		      if(value<trav.data)
    		     {
    			      if(trav.left==null)
    			      {
    			    	  trav.left=newnode;
    			    	  break;
    			      }
    			      else
    			    	  trav=trav.left;
    		     }
    		      else
     		     {
     			      if(trav.right==null)
     			      {
     			    	  trav.right=newnode;
     			    	  break;
     			      }
     			      else
     			    	  trav=trav.right;
     		     
    	        }
    	
    	}
     }
   }
   private Node recursiveAddNode(Node node ,int value)
    {
	    if(node==null)
	    	return new Node(value);
	    
	    else if(value<node.data)
	    	node.left=recursiveAddNode(node.left, value);
	    else
	    	node.right=recursiveAddNode(node.right, value);
		return node;
	  
    }
   public void recursiveAddNode(int value)
   {
	   root=recursiveAddNode(root,value);
   }
    
// method 2   
// private Node recursiveAddNode(Node trav ,int value)
//{
//	    if(trav==null)
//	          return new Node(value);
//	     else if(value<trav.data)
//	     {
//	    	 if(trav.left==null)
//	    	       trav.left=new Node(value);
//	    	 else
//	    		 recursiveAddNode( trav.left,value);
//
//	     }
//	     else
//	     {
//	    	 if(trav.right==null)
//	    	 {
//	    		 trav.right=new Node(value);
//	    	 }
//	    	 else
//	    	    recursiveAddNode(trav.right, value);
//	     }
//	    	
//		return trav;
//	  
//}
//public void recursiveAddNode(int value)
//{
//	   root=recursiveAddNode(root,value);
//}
   
   private void preOrder(Node N)
   {
	   if(N==null)
		    return ;
	   System.out.print(" "+N.data);
	   preOrder(N.left);
	   preOrder(N.right);
   }
   public void preOrder()
   {
	   preOrder(root);
   }
   private void inOrder(Node N)
   {
	   if(N==null)
		    return ;
	   inOrder(N.left);
	   System.out.print(" "+N.data);
	   inOrder(N.right);
   }
   public void inOrder()
   {
	   inOrder(root);
   }
   private void postOrder(Node N)
   {
	   if(N==null)
		    return ;
	   postOrder(N.left);
	   postOrder(N.right);
	   System.out.print(" "+N.data);
   }
   public void postOrder()
   {
	   postOrder(root);
   }
   public Node binarySearch(int key)
   {
	   Node trav=root;
	   
	   while(trav!=null)
		   
	   {
		   if(trav.data==key)
			   return trav;
		   else if(key<trav.data)
			    trav=trav.left;
		   else
			   trav=trav.right;
	   }
	   return null;
   }
   public Node binaryRecursiveSearch(Node trav,int key)
   {
	   if(trav==null)
		   return null;
	   if(trav.data==key)
			   return trav;
	   else if(key<trav.data)
		  return binaryRecursiveSearch(trav.left, key);
	   else
	    return binaryRecursiveSearch(trav.right, key);
	   
 }
   public Node binaryRecursiveSearch(int key)
   {
	   return binaryRecursiveSearch(root,key);
   }

//////////////////////////////////////////////////////////////////////////////////////////////////
   
   
   //deleting node 
   
   //finding parent of node to delete
   public Node[] binarySearchWithParent(int key)
   {
	   Node trav=root;
	   Node parent=null;
	   while(trav!=null)
		   
	   {
		   if(trav.data==key)
			   break;
		   else if(key<trav.data)
		   {
			    parent=trav;
			    trav=trav.left;
		   }
		   else
		   {
			   parent=trav;
			   trav=trav.right;
		   }
	   }
	   if(trav==null)
		     parent=null;
	   return new Node[]{trav,parent};
   }
public void deletenode(int key)
{
	Node arr[]=binarySearchWithParent(key);
	Node temp=arr[0];
	Node parent=arr[1];
	
	if(temp==null)
		 return;
	if(temp.left!=null && temp.right!=null)
	{
		Node pred=temp.left;
		parent=temp;
		while(pred.right!=null)
		{
			parent=pred;
			pred=pred.right;
			
		}
		temp.data=pred.data;
		temp=pred;
	}
	
	// node have right child
	if(temp.left==null)
	{
		if(temp==root)
			root=temp.right;
		else if(temp==parent.left)
			parent.left=temp.right;
		else if(temp==parent.right)
			parent.right=temp.right;
	}
	
	//node have left child
	if(temp.right==null)
	{
		if(temp==root)
			root=temp.left;
		else if(temp==parent.left)
			parent.left=temp.left;
		else if(temp==parent.right)
			parent.right=temp.left;
	}
	
}


}
   
