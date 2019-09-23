/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?
*/

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i; 
	    int n = arr.length; 
        List<Integer> ans = new ArrayList();
	    for (i = 0; i < n; i++) { 
            int flag = arr[i]%n;
            if(flag==0){
                if(arr[flag] > n && arr[flag]<=2*n){
                    ans.add(n);
                }
            } else if (arr[flag] > n) { 
			    if (arr[flag] <= 2 * n) { 
                    ans.add(flag);
                } 
            }
            arr[flag] += n; 
        }
        return ans;
    }
}
/*
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n= nums.length;
        List<Integer> ans = new ArrayList();
        for(int i = 0; i < n; i++){
            int cur = nums[i];
            while(cur > n){
                cur = cur-n;
            }
            nums[cur-1] += n;
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > 2 * n){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
*/
