class Node
{
	int data ; 
	Node next ; 
	Node(int new_data)
	{
		this.next = null ;
		this.data = new_data ; 
	}
}

class Stack
{
	Node head;
	
	Stack()
	{
		this.head = null ;
	}
	
	boolean isEmpty()
	{
		return head==null;
	}
	
	void push(int new_data)
	{
		Node newNode = new Node(new_data);
		newNode.next = head ;
		head = newNode;
	}
	
	void pop()
	{
		if(isEmpty()) return ;
		head = head.next ; 
	}
	
	int peak()
	{
		if(isEmpty()) return Integer.MIN_VALUE;
		return head.data ;
	}
	
}

public class Stack1
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(12);
		st.push(34);
		System.out.println(st.peak());
		st.pop();
		System.out.println(st.peak());
		st.pop();
		System.out.print(st.peak());
	}
}