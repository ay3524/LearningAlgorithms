package interview_bit.arrays.f_valuer_ranges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String... args) {
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1, 2));
        intervalList.add(new Interval(3, 5));
        intervalList.add(new Interval(6, 7));
        intervalList.add(new Interval(8, 10));
        intervalList.add(new Interval(12, 16));

        Interval interval = new Interval(4, 9);

        print(insert(intervalList,interval));
    }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        intervals.add(newInterval);

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        for (int i = 0; i < intervals.size(); i++) {

        }
        return intervals;
    }

    public static List<Interval> insert1(List<Interval> intervals, Interval newInterval) {
        int x = newInterval.start;
        int y = newInterval.end;
        int a, b;

        //Add zeroes
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            a = interval.start;
            b = interval.end;
            if (a > x && a < y) {
                interval.start = 0;
            }

            if (b > x && b < y) {
                interval.end = 0;
            }
        }

        //Remove zeroes
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start == 0 && interval.end == 0) {
                intervals.remove(interval);
            }
        }

        //Now merge
//        for (int i = 0; i < intervals.size(); i++) {
//            Interval interval = intervals.get(i);
//            Interval interval1 = null;
//            if (i > 0) {
//                interval1 = intervals.get(i - 1);
//            }
//            if (i < intervals.size() - 1) {
//                interval1 = intervals.get(i + 1);
//            }
//            if (interval.start != 0 && interval.end != 0) {
//                continue;
//            }
//            if (interval.start == 0 && interval.end != 0) {
//                if (i == 0) {
//                    continue;
//                } else {
//                    //Code here
//                    //Check the previous was zero
//                    //Make [3,0] & [0,10] as [3,10]
//                    interval.end = interval1.end;
////                    intervals.remove(i + 1);
//                }
//            }
//            if (interval.start != 0 && interval.end == 0) {
//
//            }

//        }
        return intervals;
    }

    public static void print(List<Interval> intervals) {
        for (int i = 0; i < intervals.size(); i++) {
            System.out.print("[" + intervals.get(i).start + "," + intervals.get(i).end + "]");
            System.out.print(" ");
        }
    }

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}

