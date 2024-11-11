package Question2;

import java.util.Scanner;
public class Search {

public static void main(String[] args) 
	{
	   int arr[]= {10,20,30,40,50,60,70,80};
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the element to be searched:");
	   int key=sc.nextInt();
	   System.out.println(searchKey(arr,key));
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
    		  right=mid-1;
    	  }
    	  else
    		  left=mid+1;
       }
	   return "In Binary search Element "+key+" not Found after "+camparsions+" comparsions";

	
    }

	private static String searchKey(int[] arr, int key) 
	{
	   int camparsions=0;
	   for(int i=0;i<arr.length;i++)
	   {
		    camparsions++;
		   if(arr[i]==key)
		   {
			   
	           return "In linear search Element "+key+" Found at "+i+" after "+camparsions+" comparsions";
	         

		   }
	   }
	   return "In linear search Element "+key+" not Found after "+camparsions+" comparsions";

		
	}

}
