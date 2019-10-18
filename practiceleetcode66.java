/*
Given an array nums of integers, you can perform operations on the array.

In each operation, you pick any nums[i] and delete it to earn nums[i] points. After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.

You start with 0 points. Return the maximum number of points you can earn by applying such operations.
*/



class Solution {
    public int deleteAndEarn(int[] nums) {
        int size = nums.length;
        if(size > 0){
            if(size == 1){
                return nums[0];
            }
            Arrays.sort(nums);
        
            ArrayList<Integer> sumNum = new ArrayList();
            ArrayList<Integer> diffNum = new ArrayList();
            int num = nums[0];
            sumNum.add(num);
            int sizeCount = 1;
            diffNum.add(num);
            for(int i=1; i<size; i++){
                if(num == nums[i]){
                    sumNum.set(sizeCount-1, sumNum.get(sizeCount-1)+num);
                }else{
                    num = nums[i];
                    sumNum.add(num);
                    sizeCount++;
                    diffNum.add(num);
                }
                
            }
            
            if(sizeCount == 1){
                return sumNum.get(0);
            }
            
            if((diffNum.get(1) - diffNum.get(0)) == 1){
                if(sumNum.get(1)<sumNum.get(0)){
                    sumNum.set(1, sumNum.get(0));
                }
            }else{
               sumNum.set(1, sumNum.get(0)+sumNum.get(1)); 
            }
            for(int i=2; i<sizeCount; i++){
                if((diffNum.get(i) - diffNum.get(i-1)) == 1){
                    sumNum.set(i, max(sumNum.get(i)+sumNum.get(i-2), sumNum.get(i-1)));
                }else{
                    sumNum.set(i, sumNum.get(i)+sumNum.get(i-1));
                }
            }
            return sumNum.get(sizeCount-1);
        }else{
            return 0;
        }
        
    }
    
    private int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}



class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0) return 0;
        int max = 0;
        int[] arr = new int[10001];
        for(int n:nums){
            arr[n] = arr[n]+1; 
            max = max(max, n);
        }
        int[] ans = new int[max+1];
        ans[1]=arr[1];
        for(int i=2; i<=max; i++){
            if(arr[i]==0) {
                ans[i]=ans[i-1];
            }
            else {
                ans[i]=max(ans[i-1], ans[i-2]+arr[i]*i);
            }
        }
        
        return ans[max];
    }
    
    private int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
