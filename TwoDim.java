//2-Dimensional Array
class TwoDim
{
	public static void main(String args[])
	{
		char alphabet[][]={{'A','B','C','D','E','F','G','H','I'},{'J','K','L','M','N','O','P','Q','R'},{'S','T','U','V','W','X','Y','Z','.'}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(alphabet[i][j]+"  ");
			}System.out.println();
		}
	}
}