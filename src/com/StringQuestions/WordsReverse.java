package com.StringQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Input:
        2
        i.like.this.program.very.much
        pqr.mno

        Output:
        i.ekil.siht.margorp.yrev.hcum
        rqp.onm*/

public class WordsReverse {

    public static void  reverseString(String str[]){
        for(int i=0;i<str.length;i++) {
            StringBuilder sb = new StringBuilder(str[i]);
            sb.reverse();
            if(i!=0)
                System.out.print("." + sb);
            else
                System.out.print(sb);
        }
        System.out.println();
    }

}
