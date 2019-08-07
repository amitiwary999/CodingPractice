/*
Find shortest unique prefix to represent each word in the list.

Example:

Input: [zebra, dog, duck, dove]
Output: {z, dog, du, dov}
where we can see that
zebra = z
dog = dog
duck = du
dove = dov
*/

public class Solution {
    public String[] prefix(String[] A) {
        int size = A.length;
        String[] ans = new String[size];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            String tempString = A[i];
            int tempLength = tempString.length();
            String tempChar = "";
            for(int j=0; j<tempLength; j++){
                tempChar = tempChar+Character.toString(tempString.charAt(j));
                if(map.get(tempChar) != null){
                    int pos = map.get(tempChar);
                    String oS = A[pos];
                    String posS = ans[pos];
                    if(oS.length()>j+1 && posS != null && posS.length()<=tempChar.length()){
                        posS = posS+oS.charAt(j+1);
                        ans[pos] = posS;
                        map.put(posS, pos);
                    }
                }else{
                   ans[i]=tempChar;
                   map.put(tempChar, i);
                   break;
                }
            }
        }
        return ans;
    }
}

/*
public class Solution {
    public String[] prefix(String[] A) {
        int size = A.size();
        String[] ans = new String[size];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            String tempString = A[i];
            int tempLength = tempString.length();
            for(int j=0; j<tempLength; j++){
                String tempChar = Character.toString(tempString.charAt(j));
                if(map.get(tempChar) != null){
                    
                }else{
                   ans.
                }
            }
        }
    }
}
*/
