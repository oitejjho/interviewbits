package company.interview.prep;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    public static void main(String args[]) {

        ArrayList<Interval> lists = new ArrayList<>();
//        lists.add(new Interval(8, 10));
//        lists.add(new Interval(2, 6));
//        lists.add(new Interval(1, 3));
//        lists.add(new Interval(15, 18));

        lists.add(new Interval(0, 0));
        lists.add(new Interval(1, 3));
        lists.add(new Interval(2, 5));
        lists.add(new Interval(4, 7));
        lists.add(new Interval(6, 8));

        merge(lists);

    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        // merge intervals
//        intervals.add(interval);

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
