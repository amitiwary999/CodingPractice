import java.util.*;

class DP_6_PRACTICE{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String str1 = sc.next();
   String str2 = sc.next();

   char[] str1Array = str1.toCharArray();
   char[] str2Array = str2.toCharArray();

   int[][] ans = new int[str1Array.length+1][str2Array.length+1];

   for(int i=1; i<=str1Array.length; i++){
    for(int j=1; j<=str2Array.length; j++){
      if(str1Array[i-1] == str2Array[j-1]){
        ans[i][j] = ans[i-1][j-1];
      }else{
        ans[i][j] = 1+(min(ans[i][j-1],ans[i-1][j],ans[i-1][j-1]));
     }
    }
   }
   System.out.println(ans[str1Array.length][str2Array.length]);
 }

public static int min(int a1, int a2, int a3){
   if(a1 <= a2 && a1 <= a3){
     return a1;
   }else if(a2<=a1 && a2<=a3){
     return a2;
   }else{
     return a3;
   }
 }
}
