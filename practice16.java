public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        int size= A.size();
        int high = 0;
        int low = 0;
        int mid = 0;
        int flag = 0;
        int count = 0;
        for(int i=0; i<size; i++){
            int num = A.get(i);
            if(num > high){
                high = num;
            }
        }
        while(low!=high){
            flag = 0;
            mid = (low+high+1)/2;
            for(int i=0; i<size; i++){
                count++;
                int number = A.get(i);
                if(number < mid){
                    flag++;
                }
            }
            if(flag<B){
                low = mid;
            }else{
                high = mid-1;
            }
        }
        return low;
        
    }
}
