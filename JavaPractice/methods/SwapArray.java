package methods;
import java.util.Arrays;
public class SwapArray {
    public static boolean swapArray(int arr1[],int arr2[])
    {
        boolean done = false;
        if(arr1.length==arr2.length)
        {
            for(int i = 0 ; i<arr1.length ; i++)
            {
                int temp = arr1[i];
                arr1[i]=arr2[i];
                arr2[i]=temp;
            }
            done = true;
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        }
        return done;
    }
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={7,8,9,10,12};
        System.out.print(swapArray(arr1,arr2));
    }
    
}
