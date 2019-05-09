import java.util.*;

class GoldMine{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int nor = sc.nextInt();
    
    System.out.println("Enter number of columns");
    int noc = sc.nextInt();
    
    int mine[][] = new int[nor][noc]; 
    for(int i=0; i<nor; i++){
     for(int j=0; j<noc; j++){
       mine[i][j] = sc.nextInt();
     }
    }
    
 //   for(int[] rows:mine){ 
  //    Arrays.fill(rows, 0); 
  //  }

    int right=0, rightUp=0,rightDown=0;
    for(int col=0; col<noc; col++){
      for(int row=0;row<nor;row++){
           if(col == 0){
             right = 0;
             rightUp=0;
             rightDown=0;  
          }else if(row==nor-1){
             right = mine[row][col-1];
             rightUp=0;
             rightDown = mine[row-1][col-1];
          }else if(row == 0){
           rightDown=0;
           rightUp=mine[row+1][col-1];
           right = mine[row][col-1];
          }else{
             right = mine[row][col-1];  
            rightUp=mine[row+1][col-1];
           right = mine[row][col-1]; 
          }
 
        int max = Math.max(right, Math.max(rightUp, rightDown));
        mine[row][col] = mine[row][col]+max;
        System.out.println("test "+mine[row][col]);
      }
    }
  }
} 
