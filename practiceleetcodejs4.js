/*
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
*/

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findKthLargest = function(nums, k) {
        let size = nums.length;
        if(size==1){
            return nums[0];
        }
        let max = Number.MIN_SAFE_INTEGER;
        let min = Number.MAX_SAFE_INTEGER;
        for(let i=0;i<size;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            
            if(nums[i]<min){
                min=nums[i];
            }
        }
       
        let temp = new Array(max+1-min).fill(0);
    
        for(let i=0;i<size;i++){
            let num = nums[i]-min;
            let prev = temp[num];
            temp[num] = prev+1; 
        }
        
        let tempLength = temp.length-1;
        let ans=0;
        while(k>0){
            if(temp[tempLength]!=0){
                let flag = temp[tempLength];
                k=k-flag;
                ans=tempLength;
            }
             tempLength--;
        }
        return ans+min;
};
