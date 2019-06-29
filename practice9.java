
/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int size = A.size();
        int sum = 0;
        int max = 0;
        int negMax = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            int num = A.get(i);
            if(num > negMax){
                negMax = num;
            }
            int flag = num+sum;
            if(flag > 0){
                sum = flag;
            }else{
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
        }
        if(max == 0){
            return negMax;
        }else{
            return max;
        }
    }
}

