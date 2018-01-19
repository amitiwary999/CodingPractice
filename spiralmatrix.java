import java.util.*;

class SpiralMatrix{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of rows in matrix");
  int row = sc.nextInt();
  System.out.println("Enter number of columns in matrix");
  int column = sc.nextInt();
  int count;
  if(row>column){
   count = 2*column;
  }else{
   count = 2*row-1; 
  }
  int[][] matrix = new int[row][column];
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    matrix[i][j] = sc.nextInt();
   }
  }
  int loop = 0;
  int left=0,right=0,top=0,bottom=0;
  while(loop<count){
  switch(loop%4){
   case 0:
    for(int i=left; i<column-right; i++){
     System.out.print(matrix[left][i]+" ");
    }
    top++;
   break;

   case 1:
     for(int i=top; i<row-bottom;i++){
      System.out.print(matrix[i][column-right-1]+" "); 
     }
     right++;
   break;

   case 2:
    for(int i=(column-right)-1;i>=left;i--){
      System.out.print(matrix[row-bottom-1][i]+" ");
    }
    bottom++;
   break;

   case 3:
    for(int i=row-bottom-1;i>=top;i--){
      System.out.print(matrix[i][left]+" ");
     }
    left++;
   break;
  }
 loop++;
 }
 }
}
