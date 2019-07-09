public class Solution {
    public int pow(int x, int n, int d) {
    long ans = 1;
        long a = x;
        if(x == 0 && n == 0){
            return 0;
        }
        
        if(n == 0 && x!=0){
            return 1;
        }
        
        if(x<0 && n%2 != 0){
            return d-(Math.abs(x));
        }
        while(n>0){
            if(n%2 == 1){
                ans = (ans*a)%d;
            }
            
            n = n/2;
            a = (a*a)%d;
        }
        return (int)ans;
    }
}
