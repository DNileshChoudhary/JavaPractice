import java.util.*;
class HarmonicSum
{
	public static double HarmonicSumL2R(int n)
	{
		double sumL2R=0;
		for(int i =1 ; i<=n; i++)
		{
			sumL2R+=1.0/i;
		}
		return sumL2R;
	}
	public static double HarmonicSumR2L(int n)
	{
		double sumR2L=0;
		for(int i = n;i>0;i--)
		{
			sumR2L+=1.0/i;
		}
		return sumR2L;
	}
	public static void main(String args[])
	{	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms,n : ");
		int n = sc.nextInt();
		double sumL2R=HarmonicSumL2R(n);
		double sumR2L=HarmonicSumR2L(n);
		double newL2R=(int)(sumL2R*1000000)/1000000.0;
		double newR2L=(int)(sumR2L*1000000)/1000000.0;
		
		double absoluteDifference=Math.abs(newL2R-newR2L);
		
		System.out.printf("HarmonicSum from Left to Right : %.15f\n",sumL2R);
		System.out.printf("HarmonicSum from Right to Left : %.15f\n",sumR2L);
		System.out.printf("Absolute Difference : %.15f\n",absoluteDifference);
		System.out.println(sumL2R);
		System.out.println(sumR2L);
		System.out.println(newL2R);
		System.out.println(newR2L);
		if (newL2R==newR2L)
		{
			System.out.println("Both sums are Equal.");
		}
		else if (newL2R>newR2L)
		{
			System.out.println("Sum from Left to Right is Greater.");
		}
		else
		{
			System.out.println("Sum from Right to Left is Greater.");
		}
	}
}