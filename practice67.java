/*
Given a set of reviews provided by the customers for different hotels and a string containing “Good Words”, you need to sort the reviews in descending order according to their “Goodness Value” (Higher goodness value first). We define the “Goodness Value” of a string as the number of “Good Words” in that string.

Note: Sorting should be stable. If review i and review j have the same “Goodness Value” then their original order would be preserved.
*/

public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        String[] aSplit = A.split("_");
        int size = B.size();
        int maxCount=0;
        HashMap<String, Integer> map = new HashMap();
        HashMap<Integer, ArrayList<Integer>> ansMap = new HashMap();
        for(int i=0; i<aSplit.length;i++){
            map.put(aSplit[i],1);
        }
        for(int i=0; i<size; i++){
            String temp = B.get(i);
            String[] biSplit = temp.split("_");
            int count=0;
            for(int j=0; j<biSplit.length; j++){
                if(map.get(biSplit[j]) != null){
                    count++;
                }
            }
            maxCount = maxCount<count?count:maxCount;
            if(ansMap.get(count) != null){
                ansMap.get(count).add(i);
            }else{
                ArrayList<Integer> st = new ArrayList();
                st.add(i);
                ansMap.put(count, st);
            }
        }
        ArrayList<Integer> ans = new ArrayList();
        for(int i=maxCount;i>=0; i--){
            if(ansMap.get(i) != null){
                ans.addAll(ansMap.get(i));
            }
        }
        return ans;
    }
}
