import java.util.*;

class DP_PRACTICE{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter size");
   int size = sc.nextInt();
   int val[] = new int[size];
   int wt[] = new int[size];
   Sysetm.out.println("Enter the requred weight");
   int reqWT = sc.nextInt();

  for(int i=0; i<size; i++){
    val[i] = sc.nextInt();
    wt[i] = sc.nextInt();
  } 

  int[][] ans = new int[size+1][reqWt+1];

  for(int i=0; i<size; i++){
   for(int weight = 0; weight<reqWT; weight++){
     if(i==0 || weight == 0){
       ans[i][weight]= 0;
    }else if(wt[i] <= weight){
       ans[i][weight] = max(val[i]+ans[i-1][weight-wt[i]], ans[i-1][weight]);
    }else{
       ans[i][weight] = ans[i-1][weight];
    }
   }
  }

  int answer = ans[size][reqWT];
  System.out.println(answer);
 }
}
