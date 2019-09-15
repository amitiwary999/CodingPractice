/*
In a country popular for train travel, you have planned some train travelling one year in advance.  The days of the year that you will travel is given as an array days.  Each day is an integer from 1 to 365.

Train tickets are sold in 3 different ways:

a 1-day pass is sold for costs[0] dollars;
a 7-day pass is sold for costs[1] dollars;
a 30-day pass is sold for costs[2] dollars.
The passes allow that many days of consecutive travel.  For example, if we get a 7-day pass on day 2, then we can travel for 7 days: day 2, 3, 4, 5, 6, 7, and 8.

Return the minimum number of dollars you need to travel every day in the given list of days.
*/

/**
 * @param {number[]} days
 * @param {number[]} costs
 * @return {number}
 */
var mincostTickets = function(days, cost) {
    let size = days.length;
    var temp = [];
    var minOfAllCost = min(min(cost[0],cost[1]), cost[2]);
    for(let i=0;i<size;i++){
        temp[i]=minOfAllCost;
    }
    
    for(let i=1;i<size;i++){
        temp[i]=temp[i-1]+minOfAllCost;
        for(let j=0;j<i;j++){
            var diff = (days[i]-days[j])+1;
            let minN = 4000000;
            
            if(diff<=7){
                if(j!=0){
                    minN=temp[j-1]+cost[1];
                }else{
                    minN=cost[1];
                }
            }
            
            if(diff<=30){
                if(j!=0){
                    minN=min(minN,temp[j-1]+cost[2]);
                }else{
                    minN=min(minN,cost[2]);
                }
            }
            temp[i]=min(minN, temp[i]);
        }
    }
    return temp[size-1];
};

function min(num1, num2){
    return num1>num2?num2:num1;
}
