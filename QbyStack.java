import java.util.Stack;
import java.util.Arrays;

class QbyStack
{
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> st2 = new Stack<>();
	
	void enqueue(int data)
	{
		st1.push(data);
	}
	boolean isEmpty()
	{
		return st1.isEmpty()==st2.isEmpty();
	}
	int dequeue()
	{
		if(isEmpty()) return -1 ;
		if(st2.isEmpty())
		{
			while(!st1.isEmpty())
			{
				st2.push(st1.pop());
			}
		}
		return st2.pop();
	}
	
	int peek()
	{
		if(isEmpty()) return -1 ;
		if(st2.isEmpty())
		{
			while(!st1.isEmpty())
			{
				st2.push(st1.pop());
			}
		}
		return st2.peek();
	}
	
	public static void main(String args[])
	{
		QbyStack q = new QbyStack();
		q.enqueue(34);
		q.enqueue(45);
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
	}
}