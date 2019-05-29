import java.util.*;

class DP_1_PRACTICE{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int input[] = new int[size];
   int ans[] = new int[size];

   for(int i=0; i<size; i++){
    input[i] = sc.nextInt();
   }

   for(int i=1; i<size; i++){
    for(int j=0; j<i; j++){
     if(input[i] > input[j] && ans[i] < (ans[j]+1)){
      ans[i] = ans[j]+1;
     }
    }
   }
  }
}
