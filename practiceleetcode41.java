class Solution {
public List<List<Integer>> minimumAbsDifference(int[] A) {
	Arrays.sort(A);
	int diff = A[1] - A[0];
	int length = A.length;
	for (int i = 2; i < length; ++i)
		diff = Math.min(diff, A[i] - A[i - 1]);
	List<List<Integer>> ans = new ArrayList<>();
	for (int i = 1; i < length; ++i)
		if (A[i] - A[i - 1] == diff)
			ans.add(Arrays.asList(A[i - 1], A[i]));
	return ans;
 }
}
