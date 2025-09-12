package methods;

public class Search {
    public static int search(int arr[],int key)
    {
        int l = arr.length;
        int ans = -1 ;
        boolean y = false;
        for(int i = 0 ; i<l;i++)
        {
            if(arr[i]==key)
            {
                ans = i;
                y = true;
                break;
            }
        }
        if(y)
        {
            return ans;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,4,5,1,6,7,8,9};
        int key = 5;
        System.out.print(search(arr,key));
    }
}
