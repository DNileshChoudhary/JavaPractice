import java.util.Scanner;
import java.util.Queue ;
import java.util.LinkedList;

class StackByQ
{
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	void push(int data)
	{
		q2.add(data);
		while(!q1.isEmpty())
		{
			q2.add(q1.remove());
		}
		Queue<Integer> tem = q1;
		q1 = q2 ;
		q2 = tem ;
	}
	
	int pop()
	{
		if(q1.isEmpty()) return -1 ;
		return q1.remove();
	}
	
	int peek()
	{
		if(q1.isEmpty()) return -1 ;
		return q1.peek();
	}
	
	boolean isEmpty()
	{
		return q1.isEmpty();
	}
	
	public static void main(String args[])
	{
		StackByQ st = new StackByQ();
		st.push(45);
		st.push(67);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}


