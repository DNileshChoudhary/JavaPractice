import java.util.*;

class Node
{
  int data ; 
  Node next ; 
  Node(int newData)
  {
	this.data = newData ; 
    this.next = null ;
  }
}

class Stack 
{
  Node head ;
  Stack()
  {
    this.head = null ;
  }
  
  boolean isEmpty() {return head == null ;}
  
  int push(int newData)
  {
    Node newNode = new Node(newData);
    newNode.next = head ;
    head = newNode ;
    return newData ;
  }
  
  int peak()
  {
    if(isEmpty()) return -1 ;
    return head.data ;
  }
  
  int pop()
  {
    if(isEmpty()) return -1 ;
	int tem = head.data ;
    head = head.next ; 
	return tem ;
  }
  
}

class StackPractice
{
  public static void main(String args[])
  {
    Stack st = new Stack();
    Scanner sc = new Scanner(System.in);
    System.out.print("1.Push\n2.Pop\n3.Peak\n4.isEmpty\n(Enter -1 to exit)\nEnter Your Choice(1-4) : ");
    int input = sc.nextInt();
    while(input!=-1)
    {
      if(input==1 )
      {
        System.out.print("	Enter the Data : ");
        int data = sc.nextInt();
        System.out.print(st.push(data)+" Pushed in Stack.");
      }
      else if(input == 2)
      {
        if(!st.isEmpty())
        System.out.print(st.pop()+" Popped successfully.");
        else 
        System.out.print("Stack is Empty!");
      }
      else if(input == 3)
      {
        if(!st.isEmpty()) System.out.print("Top is "+st.peak());
        else System.out.print("Stack is Empty");
      }
      else if(input == 4)
      {
        if(st.isEmpty()) System.out.print("Stack is Empty!");
        else System.out.print("Stack is NOT_Empty!!");
      }
      else
      {
        break;
      }
	  System.out.print("\n\n\n1.Push\n2.Pop\n3.Peak\n4.isEmpty\n(Enter -1 to exit)\nEnter Your Choice(1-4) : ");
      input = sc.nextInt();
    }
	System.out.print("Thank-You for using STACK!");
  }
}