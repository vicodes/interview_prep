package com.arraysQuestions;

//Input :  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
//        Output :  3 (1-> 3 -> 8 -> 9)

class MinJumpsInArray
{
    static int minJumps(int arr[])
    {
        if (arr.length <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int ladder = arr[0];
        int stair = arr[0];
        int jump = 1;


        // Start traversing array
        for (int i = 1; i < arr.length; i++)
        {
            // Check if we have reached the end of the array
            if (i == arr.length - 1)
                return jump;

            // updating maxReach
            ladder = Math.max(ladder, i+arr[i]);

            // we use a step to get to the current index
            stair--;

            // If no further steps left
            if (stair == 0)
            {
                // we must have used a jump
                jump++;

                //Check if the current index/position or lesser index
                // is the maximum reach point from the previous indexes
                if(i>=ladder)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                stair = ladder - i;
            }
        }

        return -1;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        // calling minJumps method
        System.out.println(minJumps(arr));
    }
}
