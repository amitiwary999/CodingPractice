/*
Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
*/

public class Solution {
    public void arrange(ArrayList<Integer> a) {
        int size = a.size();
        for(int i=0; i<size; i++){
            a.set(i, a.get(i)+(a.get(a.get(i))%size)*size);
        }
        
        for(int i=0; i<size; i++){
            a.set(i, a.get(i)/size);
        }
    }
}
