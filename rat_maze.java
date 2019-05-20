import java.util.*;

class RatMaze{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the maze width");
  int width = sc.nextInt();

  System.out.println("Enter the maze height");
  int height = sc.nextInt();

  int maze[][] = new int[height][width]

  System.out.println("Enter the maze");
  for(int i=0; i<height; i++){
   for(int j=0; j<width; j++){
     maze[i][j] = sc.nextInt();
   }
  }
  
  
 }
}
