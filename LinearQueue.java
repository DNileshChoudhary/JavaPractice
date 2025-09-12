import java.util.*;
class Queue
{
	int[] arr ;
	int rear ,front,size  ;
	Queue(int capacity)
	{
		arr = new int[capacity];
		rear = front = -1 ;
		size = capacity;
	}
	
	boolean isEmpty()
	{
		return front==-1; 
	}
	
	boolean isFull()
	{
		return rear == (size-1) ;
	}
	
	void enqueue(int data)
	{
		if(rear == size-1)
		{
			System.out.println("Queue is FULL");
			return ;
		}
		if(front==-1)
		{
			front = rear = 0 ; 
		}
		else
		{
			rear++;
		}
		arr[rear] = data ;
	}
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is EMPTY!!!");
			return -1;
		}
		int val = arr[front];
		if(front==rear) front = rear = -1 ;
		else front++;
		return val ;
	}
	
	int peek()
	{
		if(isEmpty()) return -1 ;
		return arr[front];
	}
}

class LinearQueue
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Queue size : ");
		Queue q = new Queue(sc.nextInt());
		System.out.print("\n1.Enqueue \n2.Dequeue \n3.IsFull\n4.IsEmpty\n5.Peek\n  (Enter -1 to end)\n	Enter your choice(1-5) : ");
		int input = sc.nextInt();
		while(input!=-1)
		{
			switch(input)
			{
				case 1 : if(q.isFull())	System.out.println("Queue is Full!!!");
				else 
				{
					System.out.print("	  Enter the Data : ");
					q.enqueue(sc.nextInt());
				}
				break;
				case 2 : 
				System.out.println((!q.isEmpty())?" "+ q.dequeue()+" is Dequeued.":"Queue is Empty!!");
				break;
				case 3 :
				System.out.println(q.isFull());
				break;
				case 4 : System.out.println(q.isEmpty()); break;
				case 5 : System.out.print(q.peek()); break;
				default : break; 
			}
			System.out.print("\n1.Enqueue \n2.Dequeue \n3.IsFull\n4.IsEmpty\n5.Peek\n  (Enter -1 to end)\n	Enter your choice(1-5) : ");
			input = sc.nextInt();
		}
		
	}
}