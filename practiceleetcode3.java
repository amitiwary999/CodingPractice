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
