import java.util.*;

class DP_7_PRACTICe{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the matrix size");
   int size = sc.nextInt();
   System.out.println("ENTER the matrix numbers"); 
   int[][] matrix = new int[size][size];
   for(int i=0; i<size; i++){
    for(int j=0; j<size; j++){
     matrix[i][j] = sc.nextInt();
    }
   }
   System.out.println("Enter the destination i index");
   int dsti = sc.nextInt();
 
   System.out.println("Enter the destination j index");
   int dstj = sc.nextInt();
   int ans[][] = new int[size+1][size+1];
   int temp=0, tempLeft = 1000000, tempTop =1000000, tempDiagonalUp=1000000;
   for(int i=1; i<=dsti; i++){
    for(int j=1; j<=dstj; j++){
      temp = matrix[i-1][j-1];
      if(i==1 || j==1){
       ans[i][j] = temp+ans[i][j-1];
      }else if(j==1){
        ans[i][j]= temp+ans[i-1][j];
      }else{
       tempLeft = ans[i][j-1];
       tempTop = ans[i-1][j];
       tempDiagonalUp = ans[i-1][j-1];
       ans[i][j] = temp+ min(tempLeft, tempTop, tempDiagonalUp);
      }
    }
   }
   System.out.println(ans[dsti][dstj]);
  }

  public static int min(int a1, int a2, int a3){
   if(a1<=a2 && a1<=a3){
    return a1;
   }else if(a2<=a1 && a2<=a3){
     return a2;
   }else{
     return a3;
   }
  }
}
