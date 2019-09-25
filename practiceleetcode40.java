class Solution {
    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int[] ans = new int[length];
        int[] odd = new int[length];
        
        int counter=0;
        int oddCounter=0;
        for(int i=0; i<length;i++){
            if(A[i]%2==0){
                ans[counter] = A[i];
                counter++;
            }else{
                odd[oddCounter]=A[i];
                oddCounter++;
            }
        }
        
        for(int j=0;j<oddCounter;j++){
            ans[counter]=odd[j];
            counter++;
        }
        return ans;
    }
}
