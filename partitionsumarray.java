import java.util.*;

class PartitionSumArray{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] set = new int[n];
  for(int i = 0; i < n; ++i) {
     set[i] = sc.nextInt();
   }
  int sum = 0;
  for(int i = 0; i < n; ++i) {
    sum += set[i];
   }
  if(sum % 2 != 0) {
   System.out.println("NO");
  }
  boolean[][] dp = new boolean[n + 1][sum + 1];
  for(int i = 0; i <= sum; ++i) {
    dp[0][i] = false;				
  }
  for(int i = 0; i <= n; ++i) {
    dp[i][0] = true;
  }
  for(int i = 1; i <= n; ++i) {
    for(int j = 1; j <= sum; ++j) {
	if(j < set[i-1]) {
	   dp[i][j] = dp[i-1][j];
	}else {
	   dp[i][j] = dp[i-1][j] || dp[i-1][j-set[i-1]];
	  }
        }
     }

  if(dp[n][sum/2]) {
     System.out.println("YES");
  } else {
     System.out.println("NO");
   }
 }
}
