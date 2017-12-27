import java.util.*;

class FlodWarshall{
 int size = 5;
 public static int max = Integer.MAX_VALUE;
 public void findShortAll(int[][] graph){
   int dist[][] = new int[5][5];
   System.out.println(Integer.MAX_VALUE);
   for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
     dist[i][j] = graph[i][j];
   }
  }
 for(int k=0;k<size;k++){
  for(int i=0;i<size;i++){
   for(int j=0;j<size;j++){
     if(dist[i][k]+dist[k][j]<dist[i][j]){
      dist[i][j] = dist[i][k]+dist[k][j];
     }
    }
   }
  }
 for(int i=0;i<size;i++){
  for(int j=0;j<size;j++){
     System.out.println("from "+i+"to "+j+"shortest distanc "+dist[i][j]);
   }
  }
 }
 public static void main(String[] args){
  int graph[][] = {{max,5,6,10,max},{max,max,max,max,4},{max,max,max,3,max},{max,max,max,max,max},{max,max,2,max,max}};
  FlodWarshall fd = new FlodWarshall();
  fd.findShortAll(graph);
 }
}
