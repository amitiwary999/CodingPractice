/*
A conveyor belt has packages that must be shipped from one port to another within D days.

The i-th package on the conveyor belt has a weight of weights[i].  Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within D days.
*/

class Solution {
  public int shipWithinDays(int[] weights, int D) {
      int max=0;
      for(int i=0;i<weights.length;i++){
          max = max(max, weights[i]);
      }
      int l = 1, r=max*weights.length;
	while (l < r) {
		int m = (l + r) / 2;
		if (possible(weights, D, m)) {
			r = m;
		} else {
			l = m + 1;
		}
	}
	return l;
}

private boolean possible(int[] weights, int d, int c) {
	int day = 0;
	int load = c;
	for (int weight : weights) {
		if (weight > c) return false;
		load += weight;
		if (load > c) {
			load = weight;
			day++;
		}
		if (day > d) return false;
	}
	return true;
}
    
    private int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
