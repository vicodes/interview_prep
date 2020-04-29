package com.amazon;

import java.util.HashSet;
import java.util.LinkedList;

/*Input : list1 = 3->1->5->7
        list2 = 8->2->5->3
        x = 10
Output : 2
The pairs are: (5, 5) and (7, 3)*/
//Idea is to store first elements in hashset and then subtract sum from  second list elements and
//check if that value is there in hashset.
public class PairsWithSumInLL {

    static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
    {
        int count = 0;

        HashSet<Integer> hs = new HashSet<>();

        for(Integer temp :  head1) {
            hs.add(temp);
        }

        for(Integer temp : head2) {
            if (!(hs.contains(x - temp)))
                count++;
        }
        return count;
    }
}
