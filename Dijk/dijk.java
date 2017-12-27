import java.util.*;


class Dijkstra {
 int size = 10;
 public int findMinVir(int dist[], int sptSet[]){
   int min = Integer.MAX_VALUE;
   int min_index = -1;
   for(int i =0; i<size; i++){
     if(sptSet[i] == 0 && dist[i] <= min){
       min = dist[i];
       min_index = i;
     }
   }
  return min_index;
 }
 public void solveGraph(int[][] graph, int src){
  int dist[] = new int[size];
  int sptSet[] = new int[size];
  for(int i =0; i<size; i++){
    dist[i] = Integer.MAX_VALUE;
    sptSet[i] = 0;
   }
  dist[src] = 0;
  for(int i = 0; i<size-1; i++){
  int min = findMinVir(dist, sptSet);
  sptSet[min] = 1;
  for(int j =0; j<size; j++){
  if(sptSet[j] == 0 && graph[min][j]!= 0 && dist[min] != Integer.MAX_VALUE && dist[min]+graph[min][j]<dist[j]){
     dist[j] = dist[min]+graph[min][j];
    }  
   }
  }
  for(int i = 0; i<size; i++){
  System.out.println("for "+i+"dist "+dist[i]);
  }
 }

 public static void main(String[] args){
  int graph[][] = {{0,5,0,0,0,0,0,3,0,0},{5,0,3,0,0,0,0,0,1,0},{0,3,0,0,0,0,0,6,0,4},
                    {0,0,0,0,0,0,4,0,0,6},{0,0,0,0,0,5,3,0,0,0},{0,0,0,0,5,0,9,0,5,0},
                    {0,0,0,4,3,9,0,0,0,0},{3,0,6,0,0,0,0,0,0,0},{0,1,0,0,0,5,0,0,0,0},
                    {0,0,4,6,0,0,0,0,0,0}};
  Dijkstra dij = new Dijkstra();
  dij.solveGraph(graph, 0);
 }
}
