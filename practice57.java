/*
There are N children standing in a line. Each child is assigned a rating value.

 You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?
*/
public class Solution {
    public int candy(ArrayList<Integer> A) {
        int size = A.size();
        int[] ans = new int[size];
        int ansVal=0;
        for(int i=0;i<size;i++){
            if(i==0){
               ans[i]=1; 
            }else{
                if(A.get(i)>A.get(i-1)){
                ans[i]=ans[i-1]+1;
                }else{
                    ans[i]=1;
                }
            }
        }
        
        for(int i=size-1;i>=0;i--){
            if(i==size-1){
               ans[i] = ans[i]>1?ans[i]:1; 
            }else{
                if(A.get(i)>A.get(i+1))
               ans[i]=ans[i]>ans[i+1]+1?ans[i]:ans[i+1]+1; 
            }
            ansVal = ansVal+ans[i];
        }
        return ansVal;
    }
}
