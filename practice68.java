/*
There is a row of seats. Assume that it contains N seats adjacent to each other. There is a group of people who are already seated in that row randomly. i.e. some are sitting together & some are scattered.

An occupied seat is marked with a character 'x' and an unoccupied seat is marked with a dot ('.')

Now your target is to make the whole group sit together i.e. next to each other, without having any vacant seat between them in such a way that the total number of hops or jumps to move them should be minimum.

Return minimum value % MOD where MOD = 10000003
*/

public class Solution {
    public int seats(String A) {
    int i = 0;
    int j = A.length()-1;
    int countXI = 0;
    int countXJ = 0;
    int sumDotI = 0;
    int sumDotJ = 0;
    long total = 0;
    while (i < j) {
        if (A.charAt(i) == '.') {
            i++;
            sumDotI++;
        } else if (A.charAt(j) == '.') {
            j--;
            sumDotJ++;
        } else {
            total += countXI*sumDotI + countXJ*sumDotJ;
            countXI++;
            countXJ++;
            sumDotI = 0;
            sumDotJ = 0;
            i++;
            j--;
        }
    }
    
    if (i == j && A.charAt(i) == '.') {
        sumDotI++;
    }
    total += countXI*sumDotI + countXJ*sumDotJ;
    
    return (int)(total%10000003);
}
}
