/*
Given a 2 * N Grid of numbers, choose numbers such that the sum of the numbers
is maximum and no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.
*/

public class Solution {
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        int col = A.get(0).size();
        int max=0;
        int flag = max(A.get(0).get(0), A.get(1).get(0));
        for(int i=0;i<col;i++){
            if(i==0){
               max =  max(A.get(0).get(0),A.get(1).get(0)); 
            }else if(i==1){
               int temp = max(A.get(0).get(i), A.get(1).get(i));
               max = max(max, temp);
            }else{
                int posMax = max(A.get(0).get(i-2), A.get(1).get(i-2));
                flag = flag>posMax?flag:posMax;
                int num = max(A.get(0).get(i), A.get(1).get(i));
                A.get(0).set(i, A.get(0).get(i)+flag);
                A.get(1).set(i, A.get(1).get(i)+flag);
                max = max>(flag+num)?max:(flag+num);
            }
        }
        return max;
    }
    
    static int max(int i, int j){
        return i>j?i:j;
    }
}
