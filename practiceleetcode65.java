/*
Given an array of scores that are non-negative integers. Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on. Each time a player picks a number, that number will not be available for the next player. This continues until all the scores have been chosen. The player with the maximum score wins.

Given an array of scores, predict whether player 1 is the winner. You can assume each player plays to maximize his score.
*/

class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int size = nums.length;
        int[][] ans = new int[size][size];
        for(int i=0;i<size;i++){
            ans[0][i] = 0;
        }
        for(int i=1; i<size; i++){
            for(int j=i-1; j>=0; j--){
               ans[i][j] = max(nums[i] - ans[i-1][j], nums[j]-ans[i][j+1]);
            }
        }
        
        if(ans[size-1][0] >= 0){
            return true;
        }else{
            return false;
        }
    }
    private int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
