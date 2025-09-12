package methods;

public class Equals {
    public static boolean equals(int arr1[],int arr2[])
    {
        int l1 = arr1.length;
        int l2 = arr2.length;
        boolean yes= false;
        if(l1==l2)
        {
            for (int i = 0; i < l1;i++)
            {
                if(arr1[i]==arr2[i])
                {
                    yes = true;
                }
                else
                {
                    yes = false;
                }
            }
        }
        return yes;
    } 
    public static void main(String args[])
    {
        int arr1[]={3,33,3,4,5,6};
        int arr2[]={3,33,3,4,5};
        System.out.println(equals(arr1,arr2));
    }
}
