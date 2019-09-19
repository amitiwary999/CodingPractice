/*
You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.

Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.

Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.
*/
class Solution {
    public int findLongestChain(int[][] pairs) {
        int size = pairs.length;
        int[] ans = new int[size];
        
        Arrays.sort(pairs, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        if(o1[1]==o2[1])
                    return o1[0]-o2[0];
                return o1[1] - o2[1];
    }
});
        for(int i=1; i<size; i++){
            ans[i]=1;
            int[] nextPair = pairs[i];
            for(int j=i-1;j>=0;j--){
                int[] pair = pairs[j];
                int diff = nextPair[0]-pair[1];
                if(diff>0){
                    if(j>0){
                        ans[i]=max(ans[i], ans[j]+1);
                    }else{
                        ans[i]=max(ans[i], 2);
                    }
                }else{
                    if(j>0){
                    ans[i]=max(ans[i],ans[i-1]);
                    }
                }
                System.out.println(ans[i]+" "+i+" "+j+" "+pairs[i][0]);
            }
        }
        return ans[size-1];
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

/*
class Solution {
public int findLongestChain(int[][] pairs) {
    int size = pairs.length;
    Arrays.sort(pairs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[1]==b[1])
                    return a[0]-b[0];
                return a[1] - b[1];
            }
        });
    
        int ans = 1, last = 0;
        for(int i=1; i < size; i++){
            if(pairs[i][0] > pairs[last][1]){
                ans++;
                last = i;
            }
        }
        return ans;            
    }
}
*/
