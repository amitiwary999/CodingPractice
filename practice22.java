public class Solution {
    public int uniquePaths(int A, int B) {
        int[][] temp = new int[A][B];
        for(int i=0; i<B; i++){
            temp[0][i] = 1;
        }
        for(int i=0; i<A; i++){
            temp[i][0] = 1;
        }
        for(int i=1; i<A; i++){
            for(int j=1; j<B; j++){
                temp[i][j] = temp[i-1][j]+temp[i][j-1];
            }
        }
        return temp[A-1][B-1];
    }
}
