/*
In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition. Now, given the Teemo's attacking ascending time series towards Ashe and the poisoning time duration per Teemo's attacking, you need to output the total time that Ashe is in poisoned condition.

You may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be in poisoned condition immediately.
*/


/**
 * @param {number[]} timeSeries
 * @param {number} duration
 * @return {number}
 */
var findPoisonedDuration = function(timeSeries, duration) {
    if(timeSeries.length>0){
        let length = timeSeries.length;
        let ans = duration;
        
        for(let i=1;i<length;i++){
            let diff = timeSeries[i]-timeSeries[i-1];
            ans = ans+(duration>diff?diff:duration);
        }
        return ans;
    }else{
        return 0;
    }
};
