/*
A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
*/

class Solution {
    public List<Integer> partitionLabels(String S) {
        char[] charArray = S.toCharArray();
        int size = charArray.length;
        int[] count = new int[size];
        HashMap<Character, Integer> charMap= new HashMap();
        HashMap<Integer, Integer> posMap = new HashMap();
        charMap.put(charArray[0], 0);
        count[0]=1;
        posMap.put(1, 0);
        int max=0;
        for(int i=1;i<size;i++){
            if(charMap.get(charArray[i]) != null){
                int pos = charMap.get(charArray[i]);
                for(int j=1;j<=count[pos];j++){
                    if(posMap.get(j) != null &&(posMap.get(j)>=pos && posMap.get(j)<i)){
                        count[i]=j;
                        break;
                    }
                }
            }else{
                charMap.put(charArray[i], i);
                count[i]=count[i-1]+1;
            }
            posMap.put(count[i], i);
            max = max>count[i]?max:count[i];
        }
        
        int flag=-1;
        List<Integer> ans = new ArrayList();
        for(int i=1;i<=max;i++){
            if(flag>=size-1)
                break;
            int pos = posMap.get(i);
            if(pos>flag){
                ans.add(pos-flag);
                flag=pos;
            }
        }
        return ans;
    }
}
/*
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;
        
        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}
*/
