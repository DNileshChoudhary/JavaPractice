import java.util.*;
class CircleComputation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of the Circle : ");
		int r = sc.nextInt();
		double  area= Math.PI*r*r;
		double perimeter=2*Math.PI*r;
		System.out.println("The Diameter is : "+(2*r));
		System.out.printf("The Area is : %.2f\n",area);
		System.out.printf("The Circumference is : %.2f\n",perimeter);
	}
}