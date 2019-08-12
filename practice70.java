/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.
Return an integer corresponding to the maximum product possible.
*/

class Solution {
    public:
        int maxProduct(int A[], int n) {
            // store the result that is the max we have found so far
            int r = A[0];

            // imax/imin stores the max/min product of
            // subarray that ends with the current number A[i]
            for (int i = 1, imax = r, imin = r; i < n; i++) {
                // multiplied by a negative makes big number smaller, small number bigger
                // so we redefine the extremums by swapping them
                if (A[i] < 0)
                    swap(imax, imin);

                // max/min product for the current number is either the current number itself
                // or the max/min by the previous number times the current one
                imax = max(A[i], imax * A[i]);
                imin = min(A[i], imin * A[i]);

                // the newly computed max value is a candidate for our global result
                r = max(r, imax);
            }
            return r;
        }
};

/*
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProduct(final List<Integer> A) {
        int start = 0;
        int negF = 1;
        int mid = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++){
            int num = A.get(i);
            if(num == 0){
                ans = max(ans, start);
                start = 0;
                negF=1;
            }else if(num>0){
                if(start==0){
                    start = num;
                }else{
                    start = start*num;  
                }
            }else{
                negF = negF*num;
                if(negF>0){
                    if(start>0){
                        start = negF*start;
                    }else{
                       start = negF; 
                    }
                    ans = max(ans, start);
                    mid=0;
                }else{
                    if(start>0){
                       negF = negF*start;
                   }
                   mid = start;
                start=0; 
                }
            }
        }
        int temp = max(ans, start);
        int ansTemp = max(temp, mid);
        start = 0;
        negF = 1;
        mid = Integer.MIN_VALUE;
        ans = Integer.MIN_VALUE;
        
        for(int i=A.size()-1; i>=0; i--){
            int num = A.get(i);
            if(num == 0){
                ans = max(ans, start);
                start = 0;
                negF=1;
            }else if(num>0){
                if(start==0){
                    start = num;
                }else{
                    start = start*num;  
                }
            }else{
                negF = negF*num;
                if(negF>0){
                    if(start>0){
                        start = negF*start;
                    }else{
                       start = negF; 
                    }
                    ans = max(ans, start);
                    mid=0;
                }else{
                   if(start>0){
                       negF = negF*start;
                   }
                   mid = start;
                start=0; 
                }
            }
        }
        int temp2 = max(ans, start);
        int ansTemp2 = max(temp2, mid);
        return max(ansTemp, ansTemp2);
    }
    
    static int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
*/
