/*
n a country popular for train travel, you have planned some train travelling one year in advance.  The days of the year that you will travel is given as an array days.  Each day is an integer from 1 to 365.

Train tickets are sold in 3 different ways:

a 1-day pass is sold for costs[0] dollars;
a 7-day pass is sold for costs[1] dollars;
a 30-day pass is sold for costs[2] dollars.
The passes allow that many days of consecutive travel.  For example, if we get a 7-day pass on day 2, then we can travel for 7 days: day 2, 3, 4, 5, 6, 7, and 8.

Return the minimum number of dollars you need to travel every day in the given list of days.
*/

class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        int size = days.length;
        int[] temp = new int[size];
        int minOfAllCost = min(min(cost[0], cost[1]), cost[2]);
        for(int i=0;i<size;i++){
            temp[i] = minOfAllCost;
        }
        
        for(int i=1;i<size;i++){
            temp[i] = temp[i-1]+minOfAllCost;
            for(int j=0;j<i;j++){
                int diff = (days[i]-days[j])+1;
                int min=400000;
                if(diff<=7){
                    if(j!=0){
                        min=temp[j-1]+cost[1];
                    }else{
                        min=cost[1];
                    }
                }
                
                if(diff<=30){
                    if(j!=0){
                        min=min(min,temp[j-1]+cost[2]);
                    }else{
                        min=min(min,cost[2]);
                    }
                }
              //  System.out.println(min+" "+temp[i]+" "+i+" "+j);
                temp[i]=min(min,temp[i]);
            }
        }
        return temp[size-1];
    }
    
    static int min(int num1, int num2){
        return num1>num2?num2:num1;
    }
}
