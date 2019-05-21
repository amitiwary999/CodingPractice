import java.util.*;

class RatMaze{
 
static int width = 0;
static int height = 0;
 public static void main(String[] args){
  RatMaze ratMaze = new RatMaze();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the maze width");
  width = sc.nextInt();

  System.out.println("Enter the maze height");
  height = sc.nextInt();

  int maze[][] = new int[height][width];
  int sol[][] = new int[height][width];

  System.out.println("Enter the maze");
  for(int i=0; i<height; i++){
   for(int j=0; j<width; j++){
     maze[i][j] = sc.nextInt();
   }
  }
  
  if(ratMaze.solve(maze, 0, 0, sol)){
    for(int i=0; i<height; i++){
     for(int j=0; j<width; j++){
     System.out.print(sol[i][j]);
    }
    System.out.println();
   }
  }else{
    System.out.println("Can't go to end");
  }
 }

 public boolean solve(int[][] maze, int x, int y, int[][] sol){
   if(x == width-1 && y == height-1){
     sol[x][y] = 1;
     return true;
    }

    if(x>=0 && y>=0 && x<width && y< height && maze[x][y] == 1){
      sol[x][y] = 1;
      
      if(solve(maze, x+1, y, sol)){
        return true;
      }

     if(solve(maze, x, y+1, sol)){
       return true;
     }
    return false;
    }
 return false;
   } 
}
