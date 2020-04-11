package com.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


//Solution using queue
public class TopView {

     class QueueObj{
        Node node;
        int hd;       //Horizontal Distance
         QueueObj(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public void TopView(Node node){

        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();

        if(node == null) return;
        else q.add(new QueueObj(node,0));

        while(!q.isEmpty()){
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }
            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1));
            }
        }

        for(Map.Entry<Integer,Node> entry : topViewMap.entrySet()){
            System.out.print(entry.getValue().data);
        }
    }
}
