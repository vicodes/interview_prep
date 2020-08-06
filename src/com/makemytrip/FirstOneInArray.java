package com.makemytrip;

// Java program to find the index of
// first '1' in a sorted array of 0's and 1's
class FirstOneInArray {

    // function to find the index of first '1'
    // binary search technique is applied
    public static int indexOfFirstOne(int arr[], int low,
                                      int high)
    {
        while (low <= high) {
            int mid = (low + high) / 2;

            // if true, then 'mid' is the index of first '1'
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1]
                    == 0))
                return mid;

                // first '1' lies to the left of 'mid'
            else if (arr[mid] == 1)
                high = mid - 1;

                // first '1' lies to the right of 'mid'
            else
                low = mid + 1;
        }

        // 1's are not present in the array
        return -1;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
        int n = arr.length;
        System.out.println(indexOfFirstOne(arr, 0,
                n - 1));

    }
}

