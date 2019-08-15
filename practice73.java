/*
Given two integer arrays A and B of size N.
There are N gas stations along a circular route, where the amount of gas at station i is A[i].

You have a car with an unlimited gas tank and it costs B[i] of gas to travel from station i 
to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the minimum starting gas station’s index if you can travel around the circuit once, otherwise return -1.

You can only travel in one direction. i to i+1, i+2, … n-1, 0, 1, 2.. Completing the circuit means starting at i and 
ending up at i again.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        int sizeA = A.size();
        int sizeB = B.size();
        int total=0;
        int max=0;
        
        HashMap<Integer, Integer> map = new HashMap();
        int ans = -1;
        int negC = 0;
        
        for(int i=0; i<sizeA; i++){
            int a = A.get(i);
            int b = B.get(i);
            int temp = a-b;
            if(ans == -1){
                ans=i;
            }
            total = total+temp;
            if(total<0){
               negC = negC+total;
               total=0;
               ans=-1;
            }
        }
        int posC = negC*-1;
        if(total>=posC){
            return ans;
        }
        return -1;
    }
}
