package com.StringQuestions;
/*Example:
        Input:
        2
        i.like.this.program.very.much
        pqr.mno

        Output:
        much.very.program.this.like.i
        mno.pqr*/

import java.lang.*;
import java.io.*;

class WordsPositionRev {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String str[] = br.readLine().split("\\.");
            for(int j=str.length-1;j>=0;j--){
                if(j!=0)
                    System.out.print(str[j] + ".");
                else
                    System.out.print(str[j]);
            }
            System.out.println();
        }
    }
}