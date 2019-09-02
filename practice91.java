import java.util.*;

class PalindromeSubSeqLong{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String input = sc.next();
   char[] array = input.toCharArray();
   int size = array.length;
   int[][] temp = new int[size][size];
   for(int i=0;i<size;i++){
    temp[i][i]=1;
   }
   for(int i=2;i<=size;i++){
     for(int j=0;j<=size-i;j++){
       int end = (j+i-1);
       if(array[j]==array[end]){
         temp[j][end]=temp[j+1][end-1]+2;
       }else{
         temp[j][end]=max(temp[j+1][end], temp[j][end-1]);
       }
     }
   }
  System.out.println(temp[0][size-1]);
 }

 static int max(int a, int b){
  return a<b?b:a;
 }
}
