import java.util.*;

class DP_8_PRACTICE{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int[] inputArray = new int[size];
   for(int i=0; i<size; i++){
    inputArray[i] = sc.nextInt();
   }
  int sum = sc.nextInt();
  int ans[] = new int[sum+1];
  ans[0] = 1;
  for(int i=0; i<size; i++){
   for(int j=inputArray[i]; j<=sum; j++){
    ans[j] = ans[j]+ans[j-inputArray[i]];
   }
  }
  System.out.println(ans[sum]);
 }
}
