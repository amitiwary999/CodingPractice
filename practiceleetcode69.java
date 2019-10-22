/*
Given an array of strings, group anagrams together.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> ans = new ArrayList();
        ArrayList<String> uniqueString = new ArrayList();
        for(int i=0; i<strs.length; i++){
            char []arr = strs[i].toCharArray(); 
            Arrays.sort(arr); 
            String currString = String.valueOf(arr);
            int found = -1;
            for(int j=0; j<uniqueString.size(); j++){
                if(uniqueString.get(j).equals(currString)){
                    found=j;
                    break;
                }
            }
            
            if(found != -1){
                ans.get(found).add(strs[i]);
            }else{
                uniqueString.add(currString);
                
                ArrayList<String> str = new ArrayList();
                str.add(strs[i]);
                ans.add(str);
            }
        }
        return ans;
    }
}
