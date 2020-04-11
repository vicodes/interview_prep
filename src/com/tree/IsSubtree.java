package com.tree;

public class IsSubtree {

    public boolean isSubtree(Node s, Node t) {
        if (s == null) return false;
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSame(Node s, Node t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;

        if (s.data != t.data) return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

}
