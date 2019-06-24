public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int size = a.size();
        int flag = 0;
        int ans = 0;
        int [] numbers = new int[size-1];
        for(int i=0; i<size; i++){
            int number = a.get(i);
            if(numbers[number-1] == number){
                flag = 1;
                ans = number;
                break;
            }else{
                numbers[number-1] = number;
            }
        }
        if(flag == 1){
            return ans;
        }else{
           return -1; 
        }
    }
}
