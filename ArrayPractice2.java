public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> flag = new ArrayList<Integer>();
        for(int i=0; i<A; i++){
            ArrayList<Integer> inner = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(j==0){
                    inner.add(j, 1);
                }else if(j==i){
                    inner.add(j, 1);
                }else{
                    inner.add(j, flag.get(j)+flag.get(j-1) );
                }
            }
            flag.clear();
            flag.addAll(inner);
            list.add(i, inner);
        }
        return list;
    }
    
}
