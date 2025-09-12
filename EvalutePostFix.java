//2346-*+

import java.util.*;
class EvalutePostFix
{
	public static void main(String args[])
	{
		Stack<Double> stk = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		double result ; 
		for(int i = 0 ; i<s.length() ; i++)
		{
			char tkn = s.charAt(i);
			if(tkn>='0' && tkn<='9')
			{
				 stk.push((double)(token-48));
			}
			else//operator
			{
				int b = stk.pop();
				int a = stk.pop();
				switch(token):
				{
					case '+' :
						result = a+b;
						break;
					case '-' :
						result = a-b;
					case '*' : 
				}
			}
		}
	}
}