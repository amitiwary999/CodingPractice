import java.util.*;

class DP_PRACTICE{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter size");
   int size = sc.nextInt();
   int val[] = new int[size];
   int wt[] = new int[size];
   System.out.println("Enter the requred weight");
   int reqWT = sc.nextInt();

  for(int i=0; i<size; i++){
    val[i] = sc.nextInt();
    wt[i] = sc.nextInt();
  } 

  int[][] ans = new int[size+1][reqWT+1];

  for(int i=0; i<=size; i++){
   for(int weight = 0; weight<=reqWT; weight++){
     if(i==0 || weight == 0){
       ans[i][weight]= 0;
    }else if(wt[i-1] <= weight){
       ans[i][weight] = max(val[i-1]+ans[i-1][weight-wt[i-1]], ans[i-1][weight]);
    }else{
       ans[i][weight] = ans[i-1][weight];
    }
   }
  }

  int answer = ans[size][reqWT];
  System.out.println(answer);
 }

 public static int max(int v1, int v2){
   if(v1>v2){
     return v1;
   }else{
     return v2;
   }
 }
}
