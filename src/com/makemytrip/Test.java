package com.makemytrip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test
{

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        List<List<String>> result = new ArrayList<List<String>>();

        Arrays.sort(products);
        int j=1;
        while(j<searchWord.length()){
            List<String> li = new ArrayList<>();
            for(int i=0;i<products.length;i++){
                if(products[i].contains(searchWord.substring(0,j))){
                    li.add(products[i]);
                    if(li.size() == 3){
                        result.add(li);
                        break;
                    }
                }
            }
            j++;
        }
        return result;
    }



    public static void main(String[] args)
    {
       String[] products = new String[]{"mobile","mouse","moneypot","monitor","mousepad"};
        suggestedProducts(products, "mouse");
    }
}