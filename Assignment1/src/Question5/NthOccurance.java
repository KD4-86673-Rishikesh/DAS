package Question5;

public class NthOccurance 
{
     public static void main(String[] args) 
     {
	   int arr[]= {10,20,33,20,30,20,40,30};
	   System.out.println(searchKey(arr,20,9));
	}
     private static int searchKey(int[] arr, int key,int occurance) 
 	{
 	   int count=0;
 	   for(int i=0;i<arr.length;i++)
 	   {
 		   
 		   if(arr[i]==key)
 		   {
 			   count++;
 			   if(count==occurance)
 				     return i;
 			   
 		   }
 	   }
 	   
 			   
	return -1;
 	  

 		
 	}
}
