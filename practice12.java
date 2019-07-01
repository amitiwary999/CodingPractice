public class Solution {
    public int romanToInt(String A) {
        char[] roman = A.toCharArray();
        int size = roman.length;
        int ans = 0;
        String flag = "";
        Map<Character, Integer> maps = new HashMap();
        maps.put("X".charAt(0), 10);
        maps.put("C".charAt(0),100);
        maps.put("L".charAt(0),50);
        maps.put("V".charAt(0), 5);
        maps.put("D".charAt(0), 500);
        maps.put("M".charAt(0), 1000);
        maps.put("I".charAt(0), 1);
        for(int i=0; i<size; i++){
            char num = roman[i];
            if(i<size-1){
                char num1 = roman[i+1];
                
                int v1 = maps.get(num);
                int v2 = maps.get(num1);
                if(v1>=v2){
                    ans = ans+v1;
                }else{
                    ans = ans+(v2-v1);
                    i++;
                }
            }else{
               ans = ans+maps.get(num);  
            }
        }
        return ans;
    }
}
