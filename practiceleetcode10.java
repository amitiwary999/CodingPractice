/*
We have a sequence of books: the i-th book has thickness books[i][0] and height books[i][1].

We want to place these books in order onto bookcase shelves that have total width shelf_width.

We choose some of the books to place on this shelf (such that the sum of their thickness is <= shelf_width), then build another level of shelf of the bookcase so that the total height of the bookcase has increased by the maximum height of the books we just put down.  We repeat this process until there are no more books to place.

Note again that at each step of the above process, the order of the books we place is the same order as the given sequence of books.  For example, if we have an ordered list of 5 books, we might place the first and second book onto the first shelf, the third book on the second shelf, and the fourth and fifth book on the last shelf.

Return the minimum possible height that the total bookshelf can be after placing shelves in this manner.
*/

class Solution {
       public int minHeightShelves(int[][] books, int shelf_width) {
        int[]minHeight = new int[books.length];
        for (int i = 0; i < books.length; i++) {
            int curWidth = books[i][0];
            int curMaxHeight = books[i][1];
            minHeight[i] = i == 0 ? books[i][1] : books[i][1] + minHeight[i - 1];
            for (int j = i - 1; j >= 0; j--) {
                curWidth += books[j][0];
                if (curWidth > shelf_width) {
                    break;
                }
                curMaxHeight = Math.max(curMaxHeight, books[j][1]);
                if (j == 0) {
                    minHeight[i] = Math.min(minHeight[i], curMaxHeight);
                } else {
                    minHeight[i] = Math.min(minHeight[i], curMaxHeight + minHeight[j - 1]);
                }
            }
        }
        return minHeight[minHeight.length - 1];
    }
}
