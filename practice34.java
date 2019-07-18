/*
Find longest Arithmetic Progression in an integer array and return its length. More formally, find longest sequence of indeces, 0 < i1 < i2 < … < ik < ArraySize(0-indexed) such that sequence A[i1], A[i2], …, A[ik] is an Arithmetic Progression. Arithmetic Progression is a sequence in which all the differences between consecutive pairs are the same, i.e sequence B[0], B[1], B[2], …, B[m - 1] of length m is an Arithmetic Progression if and only if B[1] - B[0] == B[2] - B[1] == B[3] - B[2] == … == B[m - 1] - B[m - 2].
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        int size = A.size();
        HashMap<Integer, Integer> diffs = new HashMap();
        HashMap<Integer, Integer> ans = new HashMap();
        int max = 0;
        for(int i=1; i<size; i++){
            HashMap<Integer, Integer> local = new HashMap();
            for(int j=i-1; j>=0; j--){
                int num1 = A.get(i);
                int num2 = A.get(j);
                
                int diff = num1 - num2;
            
                Integer find = diffs.get(diff);
                if(find != null){
                    Integer findLocal = local.get(find);
                    if(findLocal == null){
                        local.put(find, 1);
                         int val = ans.get(diff);
                     ans.put(diff, val+1);
                     max = max>val+1?max:val+1;
                    }
                }else{
                     diffs.put(diff, 1);
                     ans.put(diff, 1);
                
                     max = max>1?max:1;
                }
            }
        }
        return max+1;
    }
}
