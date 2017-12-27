import java.util.*;

class BellmanFord{
 int vert, edGe;
 class Edge{
 int src, dest, weight;
  Edge(){
    src = dest = weight = 0;
  }
 }
 Edge edge[];
 BellmanFord(int v, int e){
   vert = v;
   edGe = e;
   edge = new Edge[e];
   for(int i=0; i<e; i++){
     edge[i] = new Edge();
   }
  }
 public void minDist(BellmanFord graph, int src){
 int dist[] = new int[edGe];
 for(int i = 0; i<edGe; i++){
   dist[i] = Integer.MAX_VALUE;
  }
  dist[src] = 0;
for(int j=0; j<vert;j++){
 for(int i=0;i<edGe;i++){
   int srcv = graph.edge[i].src;
   int dest = graph.edge[i].dest;
   int weight = graph.edge[i].weight;
   if(dist[srcv]!= Integer.MAX_VALUE && dist[srcv]+weight<dist[dest]){
      dist[dest] = dist[srcv]+weight;
    }
  }
 }
 for(int i=0;i<edGe;i++){
   int srcv = graph.edge[i].src;
   int dest = graph.edge[i].dest;
   int weight = graph.edge[i].weight;
   if(dist[srcv]!= Integer.MAX_VALUE && dist[srcv]+weight<dist[dest]){
      System.out.println("negative cycle");
    }
  }
 for(int i=0 ;i<edGe;i++){
  System.out.println(dist[i]);
 }
}
 public static void main(String[] arg){
   BellmanFord def = new BellmanFord(7,7);
   def.edge[0].src = 0;
   def.edge[0].dest = 1;
   def.edge[0].weight = 1;

   def.edge[1].src = 1;
   def.edge[1].dest = 3;
   def.edge[1].weight = 5;

   def.edge[2].src = 1;
   def.edge[2].dest =6;
   def.edge[2].weight = 2;

   def.edge[3].src = 2;
   def.edge[3].dest = 6;
   def.edge[3].weight = -2;

   def.edge[4].src = 6;
   def.edge[4].dest = 5;
   def.edge[4].weight = 4;

   def.edge[5].src = 5;
   def.edge[5].dest = 2;
   def.edge[5].weight = 1;

   def.edge[6].src = 2;
   def.edge[6].dest = 4;
   def.edge[6].weight = 3;

  def.minDist(def, 0);
 }
 
}
