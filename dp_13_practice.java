import java.util.*;

class DP_PRACTICE_13{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  int size = sc.nextInt();
  int ans[] =new int[size];
  for(int i=0; i<size; i++){
    ans[i] = sc.nextInt();
  }

int max_val = 0;
  int[] val = new int[n+1];
  for(int i=1; i<=size; i++){
    for(int j=0; j<i; j++){
     max_val = max(max_val, ans[i-j-1]+val[j]);
    }
  val[i] = max_val;
  }
 }

 public static int max(int v1, int v2){
   if(v1>v2){
    return v1;
   }else{
    return v2;
   }
 }
}
