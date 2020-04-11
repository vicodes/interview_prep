package com.mediumcommon;

// Not tested on all testcases
public class StockBuySell {

    public static void findMax(int[] price, int n){
        int z=0,flag = 0;
        for(int i=0;i<n-1;i++){
            if(price[i+1]>=price[i] && i!=n-2){
                continue;
            }
            else if(price[i+1]>price[i] && i==n-2){
                System.out.print("(" + z + " " + (i+1) +")");
                flag =1;
            }
            else{
                if(z!=i){
                    System.out.print("(" + z + " " + i + ")" + " ");
                    flag = 1;
                }
                z=i+1;
            }
        }
        if(flag==0)
            System.out.print("No Profit");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,33,30,44,70,75};
        findMax(arr,arr.length);
    }
}
