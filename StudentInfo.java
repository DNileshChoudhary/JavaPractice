import java.util.Scanner;
class StudentInfo
{
	public static void main(String args[])
	{
		Scanner sc;
		sc= new Scanner(System.in);
		System.out.println("Enter Rollno : ");
		int rollno = sc.nextInt(); // to read int
		System.out.println("Enter name : ");
		String nam=sc.next(); // to read string with single word
		System.out.println("Enter average : ");
		float avg=sc.nextFloat(); // to read float 
		System.out.println("Enter section name (A-Z): ");
		char sec;
		sec=sc.next().charAt(0);
		System.out.println("Student Data ");
		System.out.println("-------------");
		System.out.println("Rollno. ="+rollno+ "\n" + "Name="+nam+ "\n" + "Average Marks ="+avg + "\n"+"Section="+sec);
	}
}
