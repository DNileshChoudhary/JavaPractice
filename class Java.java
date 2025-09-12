import java.util.Scanner;
class Java
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++)
        System.out.println("Hello World!");
    }
}