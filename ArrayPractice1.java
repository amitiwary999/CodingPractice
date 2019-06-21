public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int size = A.size();
        int max = 0;
        int temp = 0;
        int i;
        for(i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                int inumber = A.get(i);
                int jnumber = A.get(j);
                int numberDiff = 0;
                if(inumber>jnumber){
                    numberDiff = inumber-jnumber;
                }else{
                   numberDiff = jnumber-inumber; 
                }
                int posDiff = (j)-(i);
                temp = ((numberDiff <= 0) ? 0 - numberDiff : numberDiff)+posDiff;
                if(temp>max){
                    max = temp;
                }
            }
        }
        return max;
    }
}
