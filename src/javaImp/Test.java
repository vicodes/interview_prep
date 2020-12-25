package javaImp;

import com.tree.Node;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        Node tree = new Node(20);
        tree.left = new Node(8);
        tree.left.left = new Node(4);
        tree.left.right = new Node(12);
        tree.left.right.left = new Node(10);
        tree.left.right.right = new Node(14);
        tree.right = new Node(22);
        tree.right.right = new Node(25);
    }

}
