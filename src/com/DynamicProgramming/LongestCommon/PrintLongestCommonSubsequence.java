package com.DynamicProgramming.LongestCommon;

public class PrintLongestCommonSubsequence {

    public String printLcs(String X, String Y, int m, int n)
    {
        int[][] L = new int[m+1][n+1];

        //1.build table to find lcs length
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        //2. Following code is used to print LCS
        int index = L[m][n];
        int temp = index;

        // Create a character array to store the lcs string
        char[] ch = new char[index+1];
        ch[index] = '\u0000'; // Set the terminating character

        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = m;
        int j = n;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (X.charAt(i-1) == Y.charAt(j-1)) {
                ch[index-1] = X.charAt(i-1);
                i--; j--; index--;
            }

            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }
         return ch.toString();
    }

}
