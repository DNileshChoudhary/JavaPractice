import java.util.Scanner;
class GradePoint
{	public static void main(String args[])
	{	int gp;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade ");
		grade = sc.next().charAt(0);
		switch( grade)
		{	case 'S': gp=10; break;
			case 'A' :  gp=9; break;
			case 'B' : gp=8; break;
			case 'C' : gp=7; break;
			case 'D' : gp=6; break;
			case 'E' : gp=5; break;
			default : gp=0;
		}
		System.out.println("Grade Point ="+gp);
	}
}