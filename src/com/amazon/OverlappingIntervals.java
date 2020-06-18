package com.amazon;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]*/

public class OverlappingIntervals {

    class Interval{
        int start;
        int end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;

        // Sort by ascending starting point using an anonymous Comparator
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval t1, Interval t2) {
                return t1.start - t2.start;
            }
        });

        List<Interval> result = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (Interval interval : intervals) {
            if (interval.start <= end) // Overlapping intervals, move the end if needed
                end = Math.max(end, interval.end);
            else {                     // Disjoint intervals, add the previous one and reset bounds
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        // Add the last interval
        result.add(new Interval(start, end));
        return result;
    }

}
