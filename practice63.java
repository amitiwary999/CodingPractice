/*
N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.
*/

public class Solution {
    public int bulbs(int[] A) {
        int size = A.length;
        if(size>0){
            int num = A[0]==0?1:0;
        for(int i=1; i<size; i++){
            int flag = switchB(num, A[i]);
            if(flag ==0){
                num++;
            }
        }
        return num;
        }else{
            return 0;
        }
    }
    
    static int switchB(int num, int state){
        if(num%2==0){
           return state;
        }else{
            if(state==0){
                return 1;
            }else{
               return 0; 
            }
        }
    }
}

