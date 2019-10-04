/*
We have a set of items: the i-th item has value values[i] and label labels[i].

Then, we choose a subset S of these items, such that:

|S| <= num_wanted
For every label L, the number of items in S with label L is <= use_limit.
Return the largest possible sum of the subset S.
*/

class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        int length = values.length;
     for(int i=0;i<length;i++){
         int tempVal = values[i];
         int tempLabel = labels[i];
         int maxPos = i;
	   for(int j=i+1;j<length;j++){
           if(tempVal<values[j]){
               tempVal = values[j];
               tempLabel = labels[j];
               maxPos = j;
           }
       }
         values[maxPos]=values[i];
         labels[maxPos]=labels[i];
         
         values[i]=tempVal;
         labels[i]=tempLabel;
}
Map<Integer, Integer> map = new HashMap<>();
int sum=0;
int count=0;
	for(int i=0;i<length;i++)
	{
		
			if(map.containsKey(labels[i]) && map.get(labels[i])!=use_limit)
			{
				int labelCount=map.get(labels[i]);
				labelCount++;
				map.put(labels[i], labelCount);
				sum=sum+values[i];
				count++;
			}
			else if(!map.containsKey(labels[i]))
			{	map.put(labels[i], 1);
				sum=sum+values[i];
				count++;
			}
			
		if(count==num_wanted)
			break;
	}
	return sum;
}
}
