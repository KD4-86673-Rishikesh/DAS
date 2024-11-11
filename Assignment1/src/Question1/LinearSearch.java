package Question1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
	   int arr[]= {10,20,30,40,50,60,20,80};
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the element to be searched:");
	   int key=sc.nextInt();
	   int index=searchKey(arr,key);
	   if(index!=-1)
	   {
		   System.out.println("Last Occurance of Element Found at index : "+index);
	   }else
	   {
		   System.out.println("Element no found");
	   }

	}

	private static int searchKey(int[] arr, int key) 
	{
		int index=-1;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==key)
			   index=i;
	   }
	   return index;
		
	}

}
