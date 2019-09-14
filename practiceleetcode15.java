/*
In LeetCode Store, there are some kinds of items to sell. Each item has a price.

However, there are some special offers, and a special offer consists of one or more different kinds of items with a sale price.

You are given the each item's price, a set of special offers, and the number we need to buy for each item. The job is to output the lowest price you have to pay for exactly certain items as given, where you could make optimal use of the special offers.

Each special offer is represented in the form of an array, the last number represents the price you need to pay for this special offer, other numbers represents how many specific items you could get if you buy this offer.

You could use any of special offers as many times as you want.
*/

class Solution {
      public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs, 0);
    }
    
    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int k) {
        if (k == special.size()) {
            int total = 0;
            for (int i = 0; i < price.size(); i++) {
                total += price.get(i) * needs.get(i);
            }
            
            return total;
        }
        
        int pay = dfs(price, special, needs, k + 1);
        
        List<Integer> offer = special.get(k);
        List<Integer> leftover = new ArrayList<>();
        
        for (int i = 0; i < needs.size(); i++) {
            if (needs.get(i) < offer.get(i)) break;
            leftover.add(needs.get(i) - offer.get(i));
        }

        if (leftover.size() == needs.size()) {
            pay = Math.min(pay, offer.get(offer.size() - 1) + dfs(price, special, leftover, k));
        }
        
        return pay;
    }
}
