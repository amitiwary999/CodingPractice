import java.util.*;

class DP_5_PRACTICE{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    sc.next();
    String str2 = sc.next();
    char[] array1 = str1.toCharArray();
    char[] array2 = str2.toCharArray();
    int[][] ans = new int[array1.lenght][array2.length]
    for(int i=array1.length - 1; i<=0; i--){
     for(int j=array2.length; j<=0; j--){
       if(array1[i] == array2[j]){
         ans[i][j] = 1;
       }
     }
    }
  }
}
