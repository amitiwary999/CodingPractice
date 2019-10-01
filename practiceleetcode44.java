/*
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Note:

All numbers will be positive integers.
The solution set must not contain duplicate combinations.
*/

class Solution {
        List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) { 
        ans = new ArrayList<>();
        if(k <= 0 || n < 1 || n > 45) return ans;
        
        doCalCalculation(new ArrayList<>(), k, n, n);
        return ans;
    }
    
    private void doCalCalculation(List<Integer> list, int k, int num, int sum) {
        if(sum < 0) return;
        if(sum == 0) {
            if(list.size() == k) {
                ans.add(new ArrayList<>(list));
            }
			return;
        }
        
        for(int i = Math.min(9, num); i > 0; i--) {//we can use only 1,9 num
            list.add(i);
            doCalCalculation(list, k, i - 1, sum - i);
            list.remove(list.size() - 1);
        }
    }
}
