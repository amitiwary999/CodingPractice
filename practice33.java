/*
Write a function that takes aa number and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.


*/

public class Solution {
    public int numSetBits(long a) {
        long num = a;
        int counter = 0;
        while(num !=0){
            num = (num&num-1);
            counter++;
        }
        return counter;
    }
}
