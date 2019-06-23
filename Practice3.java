import java.util.*;

/**
 * Definition for an interval.
*/
  class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }


class Solution {
/*
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        int size = intervals.size();
        int innerSize = 0;
        int flag = 0;
        int flagJ=0;
        ArrayList<Integer> maintainPos = new ArrayList<Integer>();
        ArrayList<Interval> intervalsAns = new ArrayList<Interval>();
        for(int i=0; i<size; i++){
            flag = 0;
            Interval interval = intervals.get(i);
            int start = interval.start; int end = interval.end;
            if(i>0){
                innerSize = intervalsAns.size();
            for(int j=0; j<innerSize; j++){
                Interval intervalI = intervalsAns.get(j);
                int startI = intervalI.start; int endI = intervalI.end;
                
                if(endI >= start){
                
                    start = startI>start?start:startI;
                    end = endI>end?endI:end;
                    if(flag == 0){
                    flagJ = j;
                    }
                    Interval intervalO = new Interval(start, end);
                    if(flag == 0){
                      intervalsAns.set(j,intervalO);
                    }else{
                      intervalsAns.set(flagJ,intervalO);  
                      maintainPos.add(j);
                    }
                    flag= 1;
                }
            }
            if(flag == 0){
                Interval intervalO = new Interval(start, end);
                intervalsAns.add(intervalO);
                innerSize++;
            }
            for(int j=0; j<maintainPos.size();j++){
                intervalsAns.remove(maintainPos.get(j));
            }
            maintainPos.clear();
            }else{
                intervalsAns.add(new Interval(start, end));
                innerSize++;
            }
        }
        return intervalsAns;
    }
*/

/*
[ (30, 63), (66, 94), (36, 87), (16, 86), (26, 85), (24, 50), (17, 84), (5, 25), (67, 81), (23, 54), (84, 99), (48, 85), (23, 28), (3, 86), (63, 79), (18, 73), (6, 68), (34, 40), (61, 66), (60, 96), (95, 99), (1, 10), (4, 82), (19, 78), (23, 61), (30, 45), (53, 87), (10, 42), (80, 93), (33, 73), (64, 65), (29, 71), (73, 89), (2, 98), (62, 67), (84, 98), (43, 58), (20, 45), (86, 92), (22, 100), (72, 74), (5, 52), (48, 56), (69, 93), (8, 98), (37, 47), (19, 45), (22, 99), (34, 97), (21, 80), (58, 77), (48, 66), (59, 91), (18, 33), (2, 7), (8, 92), (12, 32), (17, 83), (11, 16), (60, 75), (9, 11), (3, 61), (4, 18), (53, 68), (17, 39), (18, 93), (15, 55), (4, 34), (48, 85), (61, 65), (59, 77), (15, 37), (62, 82), (4, 78), (80, 96), (4, 42), (15, 48), (27, 45) ]
*/

public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   ArrayList<Interval> intervals = new ArrayList<Interval>();
   for(int i=0; i<size; i++){
     int start = sc.nextInt();
     int end = sc.nextInt();
     Interval interval = new Interval(start, end);
     intervals.add(interval);
   }

   ArrayList<Interval> merged = merge(intervals);
   print(merged);
}
public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null) return null;
        
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        ArrayList<Interval> merged = new ArrayList<>();
        
        for (Interval current : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() -1).end < current.start) {
                merged.add(current);
            } else {
                merged.get(merged.size() -1).end = Math.max(current.end, 
                                                   merged.get(merged.size() -1).end);
            }
        }
        return merged;
    }

public static void print(ArrayList<Interval> merged){
   for(int i=0; i<merged.size(); i++){
    System.out.println(merged.get(i).start+"  "+merged.get(i).end);
  }
}
}

