/*
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int size = nums.length;
        if(size==1){
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            
            if(nums[i]<min){
                min=nums[i];
            }
        }
        
        int[] temp = new int[max+1-min];
        for(int i=0;i<size;i++){
            int num = nums[i]-min;
            int prev = temp[num];
            temp[num] = prev+1; 
        }
        
        int tempLength = temp.length-1;
        int ans=0;
        while(k>0){
            if(temp[tempLength]!=0){
                int flag = temp[tempLength];
                k=k-flag;
                ans=tempLength;
            }
             tempLength--;
        }
        return ans+min;
    }
}
