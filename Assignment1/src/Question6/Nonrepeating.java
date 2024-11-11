package Question6;

public class Nonrepeating {

	public static void main(String[] args) 
	{
	    int	arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
	    findFirstNonRepeating(arr);
	}

	private static void findFirstNonRepeating(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{  
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		    if(count<2)
		    {
		        System.out.println("FirstNonRepeating element of array is "+arr[i]);
		        break;
		    }
		}
		
	}

}
