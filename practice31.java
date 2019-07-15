/*
Find the longest increasing subsequence of a given sequence / array.

In other words, find a subsequence of array in which the subsequence’s elements are in strictly increasing order, and in which the subsequence is as long as possible. 
This subsequence is not necessarily contiguous, or unique.
In this case, we only care about the length of the longest increasing subsequence.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        int size = A.size();
        int max = 0;
        int[] lis = new int[size];
        for ( int i = 0; i < size; i++ ) 
              lis[i] = 1;
        for ( int i = 1; i < size; i++ ){ 
            for (int j = 0; j < i; j++ )  {
                if ( A.get(i) > A.get(j) && lis[i] < lis[j] + 1){ 
                    lis[i] = lis[j] + 1; 
                }
            }
        }
  
           for (int i = 0; i < size; i++ ) 
              if ( max < lis[i] ) 
                 max = lis[i]; 
        return max;
    }
}

/*
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        int size = A.size();
        int max = 1;
        int[][] temp = new int[size][size];
        for(int i=0; i<size; i++){
            temp[i][0] = 1;
            temp[0][i] = 1;
        }
        
        for(int i=0; i<size-1; i++){
            int num1 = A.get(i);
            if(i > 0){
                temp[i][i] = temp[i-1][i];
            }
            for(int j=i+1; j<size; j++){
                int num2 = A.get(j);
                if(num2 > num1){
                    if(i > 0){
                        temp[i][j] = temp[i][i]+1 > temp[i-1][j]?temp[i][i]+1:temp[i-1][j] ;
                    }else{
                       temp[i][j] = temp[i][i]+1 ; 
                    }
                   
                   if(max < temp[i][j]){
                       max = temp[i][j];
                   }
                }else{
                    if(i > 0){
                    temp[i][j] = temp[i-1][j];
                    }
                }
            }
        }
        return max;
    }
}

*/
