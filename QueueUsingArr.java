import java.util.*;
class QueueUsingArr
{
	static int n ;
	static int arr[] = new int[n];	
	static int front =-1, rear = -1 ;
	public static boolean isEmpty()
	{
		return front==-1 ;
	}
	public static boolean isFull()
	{
		return rear==n-1;
	}
	public static void enqueue(int data)
	{
		if(isFull()) 
		{
			System.out.print("Queue is Full!!!");
			return;
		}
		if(front==-1) front=rear=0;
		else rear++;
		arr[front]=data;
	}
	public static int dequeue()
	{
		if(isEmpty()) return -1;
		int val = arr[front];
		if(front==rear) front=rear=-1;
		else  front++;
		return val ;
	}
	public static void display()
	{
		if(isEmpty()) 
		{
			System.out.print("Queue is Empty!!!");
			return ;
		}
		for(int i = front ; i<=rear ;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Queue : ");
		n = sc.nextInt();
		System.out.print("\n1.Enqueue\n2.Dequeue\n3.IsFull\n4.IsEmpty\n5.Display\n  (Enter -1 to exit)\nEnter your choice(1-5) :");
		int input = sc.nextInt();
		while(input!=-1)
		{
			switch(input)
			{
				case 1 : 
						System.out.print("  Enter the Data : ");
						enqueue(sc.nextInt());
						break;
				case 2 : dequeue(); break;
				case 3 : isFull(); break ;
				case 4 : isEmpty(); break;
				case 5 : display(); break ;
				default : return;
			}
			System.out.print("1.Enqueue\n2.Dequeue\n3.IsFull\n4.IsEmpty\n5.Display\n  (Enter -1 to exit)\nEnter your choice(1-5) :");
			input = sc.nextInt();
		}
	}
}