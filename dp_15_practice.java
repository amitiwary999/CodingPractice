import java.util.*;

class DP_15_PRACTICE{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int[size];
    for(int i=0; i<size; i++){
      array[i] = sc.nextInt();
    }

   int ans[][] = new int[size+1][size+1];
   for(int i=1;i<=size; i++){
    for(int j=1;j<=size;j++){
      if(i<j){
       int aj = array[j];
       int ai = array[i];

       if(a[j]
     }else if(i == j){
       ans[i][j] = (array[j]>ans[i-1][j])?array[j]:ans[i-1][j];
      }else{
       ans[i][j] = ans[i-1][j];
     }  
    }
   }
  }
}
