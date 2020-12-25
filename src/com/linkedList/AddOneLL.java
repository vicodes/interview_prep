package com.linkedList;


/*Input : 3->4->5
Output: 3->4->6*/
public class AddOneLL {

    public Node addOne(Node head){
        if(head == null)
            return head;
        Node curr = head;
        String str = "";
        String strNew = "";
        while(curr !=  null){
            str = str.concat(String.valueOf(curr.data));
            curr = curr.next;
        }
        curr = head;
        int n = Integer.parseInt(str);
        ++n;
        strNew = String.valueOf(n);
        if(strNew.length() == str.length()){
            for(int i=0 ; i<strNew.length();i++){
                curr.data = Integer.parseInt(String.valueOf(strNew.charAt(i)));
                curr = curr.next;
            }
            return head;
        }
        else{
            Node temp = new Node(-1);
            temp.next = head;
            curr = temp;
            for(int i=0 ; i<strNew.length();i++){
                curr.data = Integer.parseInt(String.valueOf(strNew.charAt(i)));
                curr = curr.next;
            }
            return temp;
        }
    }
}
