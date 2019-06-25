public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int size = a.size(); 
        int maxrow = -1;
        int[] zero = new int[a.get(0).size()];
        ArrayList<Integer> deflt = new ArrayList<Integer>(a.get(0).size());
        for(int i=0; i<a.get(0).size(); i++){
            deflt.add(i, 0);
        }
        for(int i=0; i<size; i++){
            maxrow = -1;
            for(int j=0; j<a.get(i).size();j++){
                if(a.get(i).get(j) == 0){
                    if(zero[j] != 1){
                    for(int k=0; k<i; k++){
                        a.get(k).set(j,0);
                    }
                    }
                    maxrow = i;
                    zero[j] = 1;
                }else{
                    if(zero[j] == 1){
                        a.get(i).set(j, 0);
                    }
                }
                
            }
            if(maxrow != -1){
                    a.set(i, deflt);
                }
        }
    }
}
