/* // while loop is entry control
syntax
initiallization
while(conditional_expression)
{
	// statements
	// operation
}
*/
// print 1 to 20 using loop

class WhileDemo
{
	public static void main(String args[])
	{	int i;
		i=1;
		while(true) // infinite loop
		{	System.out.print(i+"\t");
			i++;
		}
	}
}