package com.graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N) {

        Stack<Integer> st = new Stack<>();
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];

        for(int i=0;i<N;i++){
            for(int j = 0; j<list.get(i).size();j++){
                int n = list.get(i).get(j);
                if(!visited[n]) {
                    st.push(n);
                    visited[n] = true;
                }
            }
        }
        int m = 0;
        while(!st.isEmpty()){
            arr[m] = st.pop();
            m++;
        }
        return arr;
    }
}
