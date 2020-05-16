package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    private int V;
    private LinkedList<Integer> adj[];

    DFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0 ;i<v;i++){
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v,int e){
        adj[v].add(e);
    }

    public void DFS(int s){
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        st.push(s);
        while(!st.isEmpty()){
            s = st.pop();
            if(!visited[s]){
                System.out.print(s + " ");
                visited[s] = true;
            }
            Iterator<Integer> itr = adj[s].listIterator();
            while(itr.hasNext()){
                int n = itr.next();
                if(!visited[n]) {
                    st.push(n);
                }
            }
        }
    }


    public static void main(String args[])
    {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(0);
    }

}
