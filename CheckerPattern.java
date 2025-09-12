import java.util.*;
class CheckerPattern 
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter the size of Square n : ");
		 int n= sc.nextInt();
		 for (int i = 1 ; i<=n ; i++ )
		 {		
			if (i%2!=0)
			{
				for(int j =1 ; j<= n;j++)
				{
					System.out.print("# ");
				}
			}
			else
			{
				for(int j =1 ; j<= n;j++)
				{
					System.out.print(" #");
				}
			}
			System.out.println();
		 }
	}	
}