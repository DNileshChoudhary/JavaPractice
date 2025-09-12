import java.util.*;
public class Infix2Prefix1
{
	public static int getPriority(char t)
	{
		char[] operators={'+','-','*','/','^'};
		int priority[]={   1,  1,  2,  2,  3};
		for(int i=0;i<operators.length;i++)
		{
			if(operators[i]==t)
			{
				return priority[i];
			}
		}	
	return -1;
	}
	public static void main(String args[]){
	String postfix="";
	
	Stack<Character> stk=new Stack<>();
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++){
		char token=s.charAt(i);
		if(token>='0' && token<='9'){
			//operand token
			postfix+=token;
		}else{
			if(stk.empty()){
				stk.push(token);
					continue;
			}
			char peekToken=stk.peek();
			int p1=getPriority(peekToken);
			int p2=getPriority(token);
			
			if(p2>p1){
				stk.push(token);
			}else{
				while(!stk.empty() && p2<=p1){
					postfix+=stk.pop();
					if(stk.size()>0){
						p1=getPriority(stk.peek());
					}else{
						break;
					}
				}
				stk.push(token);
			}
	}
}// end of for loop
	while(!stk.empty()){
		postfix+=stk.pop();
		}
		System.out.println("PostFix expression: " + postfix);
	}
}