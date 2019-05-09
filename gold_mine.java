import java.util.*;

class GoldMine{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int nor = sc.nextInt();
    
    System.out.println("Enter number of columns");
    int noc = sc.nextInt();
    
    int mine[][] = new int[nor][noc] 
    for(int i=0; i<nor; i++){
     for(int j=0; j<noc; j++){
       mine[i][j] = sc.nextInt();
     }
    }
    
    for(int[] rows:mine){ 
      Arrays.fill(rows, 0); 
    }

    for(int col=0; col<noc; col++){
      for(int row=0;row<nor;row++){
        if(col<noc-1){
         if(row<nor-1){
           
         }
      }
    }
  }
} 
