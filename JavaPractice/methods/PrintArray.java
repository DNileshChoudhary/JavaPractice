package methods;
import java.util.*;

public class PrintArray {
    public static String printArr(int[] arr)
    {
        return Arrays.toString(arr);
    }
    public static void main(String arg[])
    {
        int[] arr = {3,4,4,5,6,6,5};
        System.out.println(printArr(arr));
    }
}
