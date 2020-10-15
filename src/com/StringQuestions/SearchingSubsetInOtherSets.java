package com.StringQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Leetcode question : https://leetcode.com/problems/people-whose-list-of-favorite-companies-is-not-a-subset-of-another-list/submissions/
public class SearchingSubsetInOtherSets {

    // Using sets because for large data size it is faster than lists

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {

        Set<String>[] set = new Set[favoriteCompanies.size()];
        for (int i = 0; i < set.length; ++i)
            set[i] = new HashSet<>(favoriteCompanies.get(i));
        List<Integer> res = new ArrayList<>();
        outer:
        for (int i = 0; i < set.length; ++i) {
            for (int j = 0; j < set.length; ++j)
                if (i != j && set[j].containsAll(set[i]))
                    continue outer;
            res.add(i);
        }
        return res;

    }
}
