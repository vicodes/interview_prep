package com.arraysQuestions;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hp = new HashMap<>();

        int n1 = nums1.length, n2 = nums2.length;

        for(int a : nums1){
            hp.put(a, hp.getOrDefault(a,0)+1);
        }
        for(int b : nums2){
            if(hp.getOrDefault(b,0) > 0){
                arr.add(b);
                hp.put(b, hp.get(b)-1);
            }
        }

        int[] res = new int[arr.size()];
        for(int i=0; i< res.length; i++){
            res[i] = arr.get(i);
        }
        return res;
    }

}
