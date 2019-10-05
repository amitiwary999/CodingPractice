/*
Today, the bookstore owner has a store open for customers.length minutes.  Every minute, some number of customers (customers[i]) enter the store, and all those customers leave after the end of that minute.

On some minutes, the bookstore owner is grumpy.  If the bookstore owner is grumpy on the i-th minute, grumpy[i] = 1, otherwise grumpy[i] = 0.  When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise they are satisfied.

The bookstore owner knows a secret technique to keep themselves not grumpy for X minutes straight, but can only use it once.

Return the maximum number of customers that can be satisfied throughout the day.
*/

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int length = customers.length;
        int[][] allSum = new int[length][length];
        int[][] noGrumpsySum = new int[length][length];
        int max=0;
        
        for(int i=0; i<length;i++){
            int sum = customers[i];
             int noGrumpsy = 0;
            if(grumpy[i] == 0){
                noGrumpsy = customers[i];
            }
            allSum[i][i] = sum;
            noGrumpsySum[i][i] = noGrumpsy;
            
            for(int j=i+1;j<length;j++){
                if(grumpy[j] == 0){
                    noGrumpsy = noGrumpsy + customers[j];
                }
                sum = customers[j]+sum;
                allSum[i][j] = sum;
                noGrumpsySum[i][j] = noGrumpsy;
            }
        }
        
        for(int i=0;i<=length-X;i++){
            int sum = 0;
            if(i==0){
               sum = allSum[i][i+X-1]+noGrumpsySum[i+X][length-1];
            }else if(i==length-X){
                sum = noGrumpsySum[0][i-1]+allSum[i][i+X-1];
            }else{
                sum = noGrumpsySum[0][i-1]+allSum[i][i+X-1]+noGrumpsySum[i+X][length-1];
            }
            
            max = max(max,sum);
        }
        return max;
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}


/*
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int maxSum=0;
        int len=grumpy.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=grumpy[i]*customers[i];
        }
        for(int i=0;i<X;i++){
            maxSum+=arr[i];
        }
        int sum=maxSum;
        for(int i=1;i<=len-X;i++){
            sum=sum-arr[i-1]+arr[i-1+X];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        int ret=maxSum;
        for(int i=0;i<len;i++){
            ret+=(grumpy[i]^1)*customers[i];
        }
        return ret;
    }
}
*/

/*
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int allZeroSum = 0;
        int length = customers.length;
        int ans=0;
        for(int i = 0 ; i < length; i ++){
            if(grumpy[i] == 1){
                continue;
            }
            else{
                allZeroSum+=customers[i];
                customers[i] = 0;
            }
        }
        int max = 0 ;
        int sum = 0;
        for(int i=0 ; i<=length-X ; i++){
            if(i==0){
                for(int j = 0; j < X ;j++){
                    sum += customers[j];
                }
            }
            else{
                sum = sum - customers[i-1] + customers[i + X - 1];
            }
            max = Math.max(max,sum);
        }
        ans = allZeroSum + max;
        return ans;
        
    }
}
*/
