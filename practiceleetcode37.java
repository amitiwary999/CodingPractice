/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] leftHalf = new int[length];
        int[] rightHalf = new int[length];
        int[] ans = new int[length];
        leftHalf[0]=1;
        rightHalf[length-1]=1;
        for(int i=0;i<length-1;i++){
            leftHalf[i+1]=leftHalf[i]*nums[i];
        }
        
        for(int i=length-1;i>0;i--){
            rightHalf[i-1]=rightHalf[i]*nums[i];
        }
        
        for(int i=0;i<length;i++){
            ans[i]=leftHalf[i]*rightHalf[i];
        }
        return ans;
    }
}
