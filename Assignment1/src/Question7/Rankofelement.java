package Question7;

public class Rankofelement 
{

  public static void main(String[] args) 
	{
	    int	arr[]= {10, 20, 15, 3, 4, 4, 1};
	    int rank=findRankOfElement(arr,4);
	    System.out.println("Rank of element is "+rank);
	    
	}

	private static int findRankOfElement(int[] arr,int key) {
		int rank=0;
		for(int i=0;i<arr.length;i++)
		{  
			if(arr[i]<=key)
				rank++;
		}
		return rank;
		
	}

}
