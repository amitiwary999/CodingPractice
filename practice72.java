/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Solution {
    public int maxProfit(final List<Integer> prices){

        if (prices == null || prices.size()< 2) {
            return 0;
        }

        ArrayList<Integer> left = new ArrayList<>(Collections.nCopies(prices.size(), 0));
        
        ArrayList<Integer> right = new ArrayList<>(Collections.nCopies(prices.size(), 0));

        left.set(0,0);
        
        int min = prices.get(0);
        
        for (int i = 1; i < prices.size(); i++) {
            min = Math.min(min, prices.get(i));
            left.set(i, Math.max(left.get(i - 1), prices.get(i) - min));
        }

        right.set(prices.size() - 1, 0);

        int max = prices.get(prices.size() - 1);

        for (int i = prices.size() - 2; i >= 0; i--) {
            max = Math.max(max, prices.get(i));
            right.set(i, Math.max(right.get(i + 1), max - prices.get(i)));
        }

        int maxProfit = 0;
        for (int i = 0; i < prices.size(); i++) {
            maxProfit = Math.max(maxProfit, left.get(i) + right.get(i));
        }

        return maxProfit;
    }
}

/*
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int size = A.size();
        int ans = 0;
      //  int[] temp = new int[size];
        int[] minA = new int[size];
        int[] maxA = new int[size];
        if(size > 0){
            int min = A.get(0);
            minA[0]=0;
            for(int i=1; i<size-1;i++){
                min = min(min, A.get(i));
                int temp = max(minA[i-1], A.get(i)-min);
                minA[i]=temp;
            }
            
            int max = A.get(size-1);
            maxA[size-1]=0;
            for(int i=size-2; i>=0; i--){
                max = max(max, A.get(i));
                int temp = max(maxA[i+1], max - A.get(i));
                maxA[i]=temp;
            }
            
            for(int i=0; i<size; i++){
                ans = max(ans, minA[i]+maxA[i]);
            }
        }
        return ans;
    }
    
    static int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
    
    static int min(int num1, int num2){
        return num2>num1?num1:num2;
    }
}
*/

/*
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int size = A.size();
        int ans = 0;
        int[] temp = new int[size];
        if(size > 0){
            for(int i=0;i<size-1;i++){
                int num1 = A.get(i);
                for(int j=i+1;j<size;j++){
                    int num2 = A.get(j);
                    if(num2>num1){
                        int flag = num2-num1;
                        if(j<size-1){
                        if(temp[j+1] == 0){
                            int diff = calInterTemp(j+1, size, A);
                            temp[j+1]=diff;
                            if(diff != -1){
                            ans = max(ans, flag+diff);
                            }else{
                                ans = max(ans, flag);
                            }
                            //calculate max;
                        }else{
                            if(temp[j+1] != -1){
                           ans = max(ans, flag+ temp[j+1]);
                            }else{
                                ans = max(ans, flag);
                            }
                        }
                        }else{
                            ans = max(ans, flag);
                        }
                    }
                }
            }
        }
        return ans;
    }
    
    static int calInterTemp(int j, int size, List<Integer> A){
        int min = A.get(j);
        int diff=-1;
        for(int i=j+1; i<size; i++){
            if(min<A.get(i)){
                int cal = A.get(i)-min;
                if(diff<cal){
                    diff=cal;
                }
            }else{
                min = A.get(i);
            }
         }
         return diff;
    }
    
    static int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
*/
