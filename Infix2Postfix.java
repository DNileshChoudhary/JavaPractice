import java.util.Stack;
import java.util.Scanner;
public class Infix2Postfix
{
	 public static int priority(char op){
		 switch(op){
			 case '+':
			 case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			default:
				return -1;
		 }
	 }
	 
	public static void main(String args[])
	{
		 
		String postFix = "";
		Stack<Character> stk = new Stack<>();
		 
		String s = "(2+3)*5-6^7";
		for(int i = 0 ; i<s.length() ; i++)
		{
			char token = s.charAt(i);
			if(token>='0' && token <='9')
			{
				postFix+=token;
			}else if(token=='('){
				stk.push(token);
			}else if(token==')'){
				while(!stk.isEmpty() && stk.peek()!='('){
					postFix+=stk.pop();
				}
				if(!stk.isEmpty() && stk.peek()=='('){
					stk.pop();
				}
			}
			else
			{
						while(!stk.empty() && priority(token)<= priority(stk.peek()))
						{
							postFix+=stk.pop();	 
						}
						stk.push(token);
			}
			 
		}
		while(!stk.empty())
		{
			postFix+=stk.pop();
		}
		System.out.print(postFix);
	}
}