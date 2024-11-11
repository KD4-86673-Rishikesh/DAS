package Question3;

public class LinearQueue 
{
   private int[] arr;
   private int front;
   private int rear;
   private final int SIZE;
   
   LinearQueue(int size)
   {
	   SIZE=size;
	   arr=new int[SIZE];
	   front=rear=0;

   }

public boolean isFull() {
	return rear==SIZE;
}

public void push(int value) 
{
   arr[rear++]=value;	
	
}

public boolean isEmpty() {
	return front==rear;
}

public int pop() 
{
	int temp=arr[front];
	front++;
	return temp;
}

public int peek() {
	return arr[front];
}


   
}
