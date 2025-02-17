import java.util.Arrays;
// Time Complexity : O(logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        while(l<=r)
        {
            int mid = l + (r-l)/2;

            if(arr[mid] == x)
                return mid;
            else if (arr[mid] < x) // search right half
                l = mid+1;
            else
                r = mid-1; // search left half

        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        // sorted array as input to binary search because algorithm works on sorted array
        Arrays.sort(arr);
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
