import java.util.Scanner;
import java.util.Arrays;
public class ReverseStr {
    public static char[] reverseStr(char[] ch )
    {
        int left = 0 ; int right = ch.length-1;
        while(left<right)
        {
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            right--;
            left++;
        }
        return ch;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int l = sc.nextInt();
        char arr[] = new char[l];
        System.out.print("Enter the Characters of the array(without spaces) : ");
        String str = sc.next();
        for (int i = 0 ; i<l ; i++)
        {
            arr[i]=str.charAt(i);
        }
        char []ans = reverseStr(arr);
        System.out.println(Arrays.toString(ans));
    }
}
