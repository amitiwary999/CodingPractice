/*
Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap();
        int max = 0;
        int ans = 0;
        for(int i=0; i<A.size();i++){
            int num = A.get(i);
            if(map.get(num) != null){
                int count = map.get(num)+1;
                map.put(num, count);
            }else{
                map.put(num, 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next(); 
            int temp = entry.getValue();
            if(max < temp){
                max = temp;
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
