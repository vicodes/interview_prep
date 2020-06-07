package com.hardcommon;

//DP solution- space optimized
// operations to convert str1 to str2
class EDIST {

    static int editDistDP(String str1, String str2, int m, int n)
    {
        // Create a table to store results of subproblems
        int dp[][] = new int[m + 1][n + 1];

        // Fill d[][] in bottom up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to
                // insert all characters of second string
                if (i == 0)
                    dp[i][j] = j; // Min. operations = j

                    // If second string is empty, only option is to
                    // remove all characters of second string
                else if (j == 0)
                    dp[i][j] = i; // Min. operations = i

                    // If last characters are same, ignore last char
                    // and recur for remaining string
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                    // If the last character is different, consider all
                    // possibilities and find the minimum
                else
                    dp[i][j] = 1 + min(dp[i][j - 1], // Insert
                            dp[i - 1][j], // Remove
                            dp[i - 1][j - 1]); // Replace
            }
        }

        return dp[m][n];
    }

    public static int editDistSpaceOptimised(String str1, String str2, int m, int n) {
        int[][] mem = new int[2][n + 1];
        // Base condition-- pre filling if second string is empty
        for (int i = 0; i <= n; i++){
            mem[0][i] = i;
        }
        //Loop for every character in second string
        for (int i = 1; i <= m; i++) {
            // Loop for every character in first string
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    mem[i % 2][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    mem[i % 2][j] = mem[(i - 1) % 2][j - 1];
                } else {
                    mem[i % 2][j] = 1
                            + Math.min(mem[(i - 1) % 2][j], Math.min(mem[(i - 1) % 2][j - 1], mem[i % 2][j - 1]));
                }
            }
        }
        return mem[m % 2][n];
    }
    static int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }


    public static void main(String args[])
    {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
    }
}
/*This code is contributed by Rajat Mishra*/

