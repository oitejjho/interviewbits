package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        if(intervals == null || intervals.size() == 0)
            return new ArrayList<Interval>() {{add(newInterval);}};
        intervals.add(newInterval);
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval start1, Interval start2) {
                if (start1.start > start2.start)
                    return 1;
                else if (start1.start == start2.start)
                    return 0;
                else
                    return -1;
            }
        });

        for (int i = 0; i < intervals.size() - 1; i++) {
//            System.out.println(intervals.get(i).start + " -> " + intervals.get(i+1).start);
            if (intervals.get(i).end >= intervals.get(i + 1).start) {
                intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
                intervals.remove(i + 1);
                i--;
            }
        }

        return intervals;
    }
}
