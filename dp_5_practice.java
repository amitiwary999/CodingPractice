import java.util.*;

class DP_5_PRACTICE{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    char[] array1 = str1.toCharArray();
    char[] array2 = str2.toCharArray();
    int[][] ans = new int[array1.length+1][array2.length+1];
    for(int i=0; i<=array1.length; i++){
     for(int j=0; j<=array2.length; j++){
       if(i==0 || j==0){
         ans[i][j] = 0;
       }else if(array1[i-1] == array2[j-1]){
         ans[i][j] = ans[i-1][j-1]+1;
       }else{
         ans[i][j] = (ans[i-1][j] > ans[i][j-1])? ans[i-1][j] : ans[i][j-1];
       }
     }
    }

   System.out.println(ans[array1.length][array2.length]);
  }
}
