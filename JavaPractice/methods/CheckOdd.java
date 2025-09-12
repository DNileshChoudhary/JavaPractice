package methods;
import java.util.Scanner;
public class CheckOdd {
    public boolean isOdd(int n)
    {
        boolean odd = false;
        if(n%2==0)
        {
            odd = true;
        }
        return odd;
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        sc.close();
        CheckOdd obj = new CheckOdd();
        boolean ans = obj.isOdd(n);
        System.out.println(n+" is an Even number is : "+ans);
    }
}
