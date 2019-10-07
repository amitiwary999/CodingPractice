/*
In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition. Now, given the Teemo's attacking ascending time series towards Ashe and the poisoning time duration per Teemo's attacking, you need to output the total time that Ashe is in poisoned condition.

You may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be in poisoned condition immediately.
*/


class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length>0){
        int length = timeSeries.length;
        int ans=duration;
        for(int i=1; i<length;i++){
            int diff = timeSeries[i]-timeSeries[i-1];
            int temp = duration>diff?diff:duration;
            ans = ans+temp;
        }
        return ans;
    }else{
        return 0;
    }
    }
}
