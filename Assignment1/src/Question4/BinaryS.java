package Question4;

import java.util.Scanner;

public class BinaryS 
{
	 public static void main(String[] args) 
	{
		   int arr[]= {80,70,60,50,40,30,20,10};
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter the element to be searched:");
		   int key=sc.nextInt();
		   System.out.println(BsearchKey(arr,key));
		  

		}

		private static String BsearchKey(int[] arr, int key) 
		{
	       int left=0;
	       int right=arr.length-1;
	       int mid;
	       int camparsions=0;
	       while(left<=right)
	       {
	    	  mid=(left+right)/2;
	    	  camparsions++;
	    	  if(arr[mid]==key)
	    	  {
	    		return "In Binary search Element "+key+" Found at "+mid+" after "+camparsions+" comparsions";
	    		 
	    	  }
	    	  else if(key<arr[mid])
	    	  {
	    		  
	    		  left=mid+1;
	    	  }
	    	  else
	    		  right=mid-1;
	    		  
	       }
		   return "In Binary search Element "+key+" not Found after "+camparsions+" comparsions";

		
	    }
}
