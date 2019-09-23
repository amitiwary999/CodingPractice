/*
Initially, all the cards start face down (unrevealed) in one deck.

Now, you do the following steps repeatedly, until all cards are revealed:

Take the top card of the deck, reveal it, and take it out of the deck.
If there are still cards in the deck, put the next top card of the deck at the bottom of the deck.
If there are still unrevealed cards, go back to step 1.  Otherwise, stop.
Return an ordering of the deck that would reveal the cards in increasing order.

The first entry in the answer is considered to be the top of the deck.
*/

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        List<Integer> indices = new ArrayList(deck.length);
        for(int i = 0; i < deck.length; i++) {
            indices.add(i);
        }
        Arrays.sort(deck);
        int[] ans = new int[deck.length];
        int i = -1;
        int j = 0;
        while(indices.size() > 0) {
            if(i == indices.size()-1 || indices.size()==1) i = 0;
            else if(i == indices.size()) i = 1;
            else i += 1;
            int index = indices.get(i);
            indices.remove(i);
            ans[index] = deck[j];
            j++;
        }
        return ans;
    }
}
