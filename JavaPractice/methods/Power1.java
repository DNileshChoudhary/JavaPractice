package methods;
import java.util.Scanner;
public class Power1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ba = sc.nextInt();
        int po = sc.nextInt();
        sc.close();
        System.out.println(power1(ba,po));
    }
    public static int power1(int base , int pow)
    {      
        int mul = 1;
        for (int i = 1;i<=pow;i++)
        {
            mul = mul*base;
        }
        return mul;
    }
}