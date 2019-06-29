public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int size = (2*A)-1;
        int flag = A;
        ArrayList<Integer> init = new ArrayList<Integer>(Collections.nCopies(size, A));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        // ans.add(0, init);
        // ans.add(1, init);
        for(int i=0; i<A; i++){
           // flag = flag-1;
            ArrayList<Integer> num = new ArrayList<Integer>(Collections.nCopies(size, A));
            flag = A;
            int check = A-i;
            for(int j=1;j<A;j++){
                if(flag != check)
                flag = flag-1;
                num.set(j,flag);
                num.set((size-1)-j, flag);
            }
            
            ans.add(i, num);
            if(flag != 1){
            ans.add(i+1, num);
            }
        }
        return ans;
    }
}

