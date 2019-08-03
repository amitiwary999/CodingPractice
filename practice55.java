/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
*/

public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int size = a.size();
        int s=0;
        int e=size;
        int mid = (s+e)/2;
        while(s<e){
        if(a.get(mid)==b){
            return mid;
        }else if(a.get(mid)>b){
           e=mid; 
        }else{
           s=mid+1; 
        }
        mid = (s+e)/2;
        }
        return s;
    }
}
