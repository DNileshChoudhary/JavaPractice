import java.util.*;
class Node
{
	int data ; 
	Node link ; 
	Node(int data)
	{
		this.data = data ;
		this.link = null ;
	}
}
class LinkedList
{
	Node head = null ;
	Scanner sc = new Scanner(System.in);
	void create(int n)
	{
		System.out.print("Enter the Data for new Node : ");
		for(int i = 0 ; i<n ; i++)
		{
			
			Node newnode = new Node(sc.nextInt());
			if(head == null)
			{
				head = newnode;
			}
			else
			{
				Node t = head ;
				while(t.link!=null)
				{
					t=t.link ; 
				}
				t.link = newnode ;
			}
		}
	}
	void traversal()
	{
		Node t = head ;
		System.out.println("The LinkedList is : ");
		while(t!=null)
		{
			System.out.print(t.data+" ");

			t=t.link ;
		}
	}
	void insertAtBegining(int d)
	{
		Node newnode = new Node(d);
		newnode.link = head ;
		head = newnode;
	}
	void insertAtEnd(int d)
	{
		Node newnode = new Node(d);
		Node t = head ; 
		while(t.link!=null)
		{
			t=t.link;
		}
		t.link = newnode;
	}
	void insertInMiddle(int pos , int d)
	{
		Node newnode = new Node(d);
		int ctr = 1 ;
		Node t = head ;
		while(ctr<pos)
		{
			t = t.link;
			ctr++;
		}
		newnode.link = t.link ; 
		t.link = newnode;
	}
	public static void main(String args[])
	{
		System.out.print("Enter the Number of Nodes : ");
		LinkedList obj = new LinkedList();
		int n = obj.sc.nextInt();
		obj.create(n);
		obj.traversal();
		System.out.print("\nEnter the data for Begining Node  : ");
		int d = obj.sc.nextInt();
		obj.insertAtBegining(d);
		obj.traversal();
		System.out.print("\nEnter the data for Ending Node  : ");
		d = obj.sc.nextInt();
		obj.insertAtEnd(d);
		obj.traversal();
		System.out.print("\nEnter the Position to Insert :");
		int pos = obj.sc.nextInt();
		System.out.print("Enter the Data : ");
		d = obj.sc.nextInt();
		obj.insertInMiddle(pos,d);
		obj.traversal();
	}
}