package com.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalSum {

    class QueueObj{
        Node node;
        int hd;       //Horizontal Distance
        QueueObj(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }


    public void verticalSum(Node node) {
        // add your code here
        Map<Integer, Integer> mp =  new TreeMap<>();
        Queue<QueueObj> qu = new LinkedList<>();

        if(node==null)  return;

        qu.add(new  QueueObj(node,0));

        while(!qu.isEmpty()){
            QueueObj temp = qu.poll();
            if(!mp.containsKey(temp.hd)){
                mp.put(temp.hd,temp.node.data);
            }
            else{
                int s = mp.get(temp.hd);
                mp.put(temp.hd, s+temp.node.data);
            }

            if(temp.node.left !=null)
                qu.add(new QueueObj(temp.node.left,temp.hd-1));

            if(temp.node.right !=null)
                qu.add(new QueueObj(temp.node.right,temp.hd+1));
        }

        for(Map.Entry<Integer,Integer> entry :  mp.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
    }

}
