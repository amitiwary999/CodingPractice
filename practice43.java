/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int size = A.size();
        int max = 0;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                int num = A.get(j)-A.get(i);
                if(num > max){
                    max = num;
                }
            }
        }
        return max;
    }
}

/*
another way
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int size = A.size();
         int flag = -1;
        int diff=0;
        int[] temp = new int[size];
        if(size > 0){
        int min = A.get(0);
        for(int i=1; i<size; i++){
            if(min<A.get(i)){
                int cal = A.get(i)-min;
                if(diff<cal){
                    diff=cal;
                }
            }else{
                min = A.get(i);
            }
         }
        }
        return diff;
    }
}
*/
