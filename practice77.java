public class Solution {
    public int black(ArrayList<String> A) {
        if (A.size() == 0 || A.get(0).length() == 0) {
            return 0;
        }
        
        final int width = A.get(0).length();
        final int height = A.size();
        
        boolean[][] field = new boolean[width][height];
        
        for (int i = 0; i < width; i ++) {
            for (int j = 0; j < height; j ++) {
                field[i][j] = A.get(j).charAt(i) == 'X';
            }
        }
        
        int shapeCount = 0;
        
        for (int i = 0; i < width; i ++) {
            for (int j = 0; j < height; j ++) {
                if (field[i][j]) {
                    shapeCount++;
                    clear(field, i, j);   
                }
            }
        }
        
        return shapeCount;
    }
    
    private void clear(boolean[][] field, int x, int y) {
        if (x < 0 || x >= field.length) {
            return;
        }
        if (y < 0 || y >= field[0].length) {
            return;
        }
        if (!field[x][y]) {
            return;
        }
        
        field[x][y] = false;
        clear(field, x + 1, y);
        clear(field, x, y + 1);
        clear(field, x - 1, y);
        clear(field, x, y - 1);
    }
}
