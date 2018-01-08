import java.util.*;

class LeftFlipMatrix{

  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of rows, no of columns and number of time left flip");
   int row = sc.nextInt();
   int column = sc.nextInt();
   int flip = sc.nextInt();
   int[][] mat = new int[row][column];
   System.out.println("Enter elements of matrix");
   for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
     mat[i][j] = sc.nextInt();
    }  
   }
   flip = flip%column;
  for(int i=0;i<row;i++){
   for(int j=flip;j<column;j++){
    System.out.print(mat[i][j]+" ");
   } 
   for(int k=0;k<flip;k++){
    System.out.print(mat[i][k]+" ");
   }
  }
 }
}
