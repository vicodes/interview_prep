package com.arraysQuestions.binarySearch;

//https://leetcode.com/problems/find-peak-element/

// Explanation :Most people have figured out the binary search solution but are not able to
// understand how its working What we are essentially doing is going in the direction of the rising
// slope(by choosing the element which is greater than
// current). How does that guarantee the result? Think about it, there are 2 possibilities.
// a) rising slope has to keep rising till end of the array b) rising slope will encounter
// a lesser element and go down.
//In both scenarios we will have an answer. In a) the answer is the end element because we take the boundary
// as -INFINITY b) the answer is the largest element before the slope falls. Hope this makes things clearer.
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        while(low < high)
        {
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;
            if(nums[mid1] < nums[mid2])
                low = mid2;
            else
                high = mid1;
        }
        return low;
    }

}


