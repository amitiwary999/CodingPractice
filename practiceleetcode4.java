/*

Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.

Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.

Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.
*/

class Solution {
    public boolean stoneGame(int[] piles) {
        int sum = 0;
        int alex = 0;
        for (int i = 0, j = piles.length - 1; i < piles.length / 2; i++, j--) {
            alex += Math.max(piles[i],piles[j]);
            sum += piles[i] + piles[j];
        }
        return alex >= sum/2;
    }
}
