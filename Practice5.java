/*
Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1
On returning, the array A should be :

0 0 0
1 0 1
1 0 1
Note that this will be evaluated on the extra memory used. Try to minimize the space and time complexity.
*/

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int size = a.size(); 
        int maxrow = -1;
        int[] zero = new int[a.get(0).size()];
        ArrayList<Integer> deflt = new ArrayList<Integer>(a.get(0).size());
        for(int i=0; i<a.get(0).size(); i++){
            deflt.add(i, 0);
        }
        for(int i=0; i<size; i++){
            maxrow = -1;
            for(int j=0; j<a.get(i).size();j++){
                if(a.get(i).get(j) == 0){
                    if(zero[j] != 1){
                    for(int k=0; k<i; k++){
                        a.get(k).set(j,0);
                    }
                    }
                    maxrow = i;
                    zero[j] = 1;
                }else{
                    if(zero[j] == 1){
                        a.get(i).set(j, 0);
                    }
                }
                
            }
            if(maxrow != -1){
                    a.set(i, deflt);
                }
        }
    }
}
