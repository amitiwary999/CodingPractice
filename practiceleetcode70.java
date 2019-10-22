/*
There are a number of spherical balloons spread in two-dimensional space. For each balloon, provided input is the start and end coordinates of the horizontal diameter. Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice. Start is always smaller than end. There will be at most 104 balloons.

An arrow can be shot up exactly vertically from different points along the x-axis. A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend. There is no limit to the number of arrows that can be shot. An arrow once shot keeps travelling up infinitely. The problem is to find the minimum number of arrows that must be shot to burst all balloons.
*/

class Solution {
    public int findMinArrowShots(int[][] points) {
        int length = points.length;
        if(length == 1){
            return 1;
        }else if(length == 0){
            return 0;
        }
               Arrays.sort(points, new Comparator<int[]>() {
             public int compare(int[] o1, int[] o2) {
                 if(o1[0] == o2[0]){
                     return o1[1]-o2[1];
                 }else{
                  return o1[0]-o2[0];
                 }
             }
        });
        
        int ans = 1;
        int max = points[0][1];
        for(int i=1; i<length; i++){
            if(points[i][0]>max){
                max = points[i][1];
                ans++;
            }else{
                max = min(max, points[i][1]);
            }
        }
        return ans;
    }
    
    private int min(int num1, int num2){
        return num1<num2?num1:num2;
    }
}

/*
class Solution {
public int findMinArrowShots(int[][] p) {
        if(p.length == 0) return 0;
        Arrays.sort(p, new Comparator<int[]>(){
           public int compare(int[] e1, int[] e2){
               return e1[1]-e2[1];
           } 
        });
        int count = 1, lastShotAt = p[0][1];
        for(int[] e : p){
            if(e[0] <= lastShotAt)
                continue;
            lastShotAt = e[1];
            ++count;
        }
        return count;
    }
}
*/



