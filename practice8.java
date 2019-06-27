//Try in constant space

/*
Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        double size = A.size();
        int sizeInt = A.size();
        int a=0,b=0;
        long sum = 0;
        long sumS = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
       
       // int[] flag = new int[size];
        for(int i=0; i<sizeInt; i++){
            int num = A.get(i);
            sum = sum+num;
            sumS = sumS+(num*num);
           // if(flag[num-1] == num){
           //     a= num;
           // }else{
           //   flag[num-1] = num;  
           // }
        }
        long realSumD = (long)((size)*(size+1)/2);
        long realSumS = (long)((2*size+1)/3)*(realSumD);
        a = (int)((sum+realSumD)/2);
        long diff = (realSumD) - sum;
        long diffS = realSumS - sumS;
        long diffDiv = diffS/diff;
        b = diffDiv-a;
       
        ans.add(a);
        ans.add(b);
        return ans;
    }
}

