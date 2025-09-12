import java.util.*;
public class ExactMultiple

{
    public static int exactMultiple(int n,int m)
    {
        if(n%m==0)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(exactMultiple(n,m));
    }
}
