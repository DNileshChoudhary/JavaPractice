import java.util.*;
public class LastDigitSum
{
    public static int sumOfLastDigit(int n1,int n2)
    {
        int a = Math.abs(n1%10);
        int b = Math.abs(n2%10);
        return a+b;
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Two Numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = sumOfLastDigit(n1,n2);
        System.out.print("The Sum of Last Digit is : "+res);
    }
}
