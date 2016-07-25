
 
class Gems
    static boolean Subset (int arr[], int n, int sum)
    {
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
        if (arr[n-1] > sum)
            return isSubsetSum (arr, n-1, sum);
        return isSubsetSum (arr, n-1, sum) ||
               isSubsetSum (arr, n-1, sum-arr[n-1]);
    }
 
    static boolean Partition (int arr[], int n)
    {
       
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        if (sum%2 != 0)
            return false;
        return Subset (arr, n, sum/2);
    }

    public static void main (String[] args)
    {
 
        int arr[] = {3, 1, 5, 9, 12};//counts of rubies and emeralds
        int n = arr.length;
        if (partition(arr, n) == true)
            System.out.println("Can be divided");
        else
            System.out.println("Can not be divided");
    }
}

