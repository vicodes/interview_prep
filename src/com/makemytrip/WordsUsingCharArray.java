package com.makemytrip;

/*Input : Dict - {"go","bat","me","eat","goal", "boy", "run"}
        arr[] = {'e','o','b', 'a','m','g', 'l'}
Output : go, me, goal.*/

public class WordsUsingCharArray {

    public static void printWords(String[] dict, char[] arr){
        int[] a = new int[26];
        for(int i=0;i<arr.length;i++){
            int z = arr[i] - 97;
            a[z] = 1;
        }

        for(int i=0;i<dict.length;i++){
            int flag=0;
            for(int j=0;j<dict[i].length();j++){
                char ch = dict[i].charAt(j);
                if(a[ch-97]==1){
                    flag=1;
                    continue;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.println(dict[i]);
        }
    }


    public static void main(String[] args) {
        String[] dict  = {"go","bat","me","eat","goal","boy","run"};
        char arr[] = {'e', 'o', 'b', 'a', 'm', 'g', 'l'} ;
        printWords(dict,arr);
    }
}
