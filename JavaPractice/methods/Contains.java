package methods;

public class Contains {
    public static boolean contains(int arr[],int key)
    {
        boolean isThere = false;
        int l = arr.length;
        for(int i = 0;i<l;i++)
        {
            if(arr[i]==key)
            {
                isThere = true;
                break;
            }
        }
        return isThere;
    }
    public static void main(String []args)
    {
        int [] arr = {3,5,6,7,8,8,9,0};
        int key = 9;
        System.out.println(contains(arr, key));
    }
}
