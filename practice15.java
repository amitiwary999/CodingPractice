public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        int size = A.size();
        ArrayList<Integer> ans = new ArrayList(Collections.nCopies(size, -1));
        for(int i=size-2; i>=0;i--){
            int num = A.get(i);
            int prevNum = A.get(i+1);
            int flag = -1;
            if(prevNum > num){
                flag = prevNum;
            }else{
                for(int j=i+1; j<size; j++){
                    int temp = ans.get(j);
                    if(temp > num){
                        flag = temp;
                        break;
                    }
                }
            }
            ans.set(i, flag);
        }
        return ans;
    }
}
