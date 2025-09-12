import java.util.*;
public class CombineStrings
{
    public static String combineString(String s1,String s2)
    {
        return s1+s2+s1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Two Strings : ");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.print(combineString(s1,s2));
    }
}
