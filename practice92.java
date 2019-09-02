import java.util.*;

class PalindromeSubStrLong{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String input = sc.next();
   char[] array = input.toCharArray();
   int size = array.length;
   int[][] temp = new int[size][size];
   for(int i=0;i<size;i++){
    temp[i][i]=1;
   }
   int max=0;
   for(int i=2;i<=size;i++){
     for(int j=0;j<=size-i;j++){
       int end = (j+i-1);
       if(array[j]==array[end]){
         max = max(temp[j+1][end-1]+2,max);
         temp[j][end]=temp[j+1][end-1]+2;
       }else{
         temp[j][end]=0;
       }
     }
   }
  System.out.println(max);
 }

 static int max(int a, int b){
  return a<b?b:a;
 }
}
