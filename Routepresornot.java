import java.util.*;
import java.util.LinkedList;

class RouteFind{
 
 LinkedList<Integer> adeg[];
 int vert;
 RouteFind(int v){
  vert = v;
  adeg = new LinkedList[vert];
  for(int i=0;i<vert;i++){
   adeg[i] = new LinkedList();
  }
 }
 public void addEdge(int src, int dest){
  adeg[src].add(dest);
 }

 public boolean isRoute(int src, int dest){
   boolean[] visited = new boolean[vert];
   LinkedList<Integer> queue = new LinkedList<Integer>();
   queue.add(src);
   visited[src] = true;
   Iterator<Integer> itelist;
   while(!queue.isEmpty()){
    int flag = queue.poll();
    itelist = adeg[flag].listIterator();
    while(itelist.hasNext()){
     int check = itelist.next();
     if(check == dest){
      return true;
     }else if(!visited[check]){
      queue.add(check); 
     }
   }
  } 
 return false;
 }
 public static void main(String[] args){
  RouteFind route = new RouteFind(5);
  route.addEdge(0, 1);
  route.addEdge(0, 3);
  route.addEdge(2, 3); 
  route.addEdge(1, 4);
  route.addEdge(2, 1);
  route.addEdge(3, 4);
  route.addEdge(4, 1);
  if(route.isRoute(3, 1)){
    System.out.println("route present between 3" + "and "+"1");
 }else{
   System.out.println("route not present between 3" + "and "+"1");
 }
 if(route.isRoute(0, 4)){
    System.out.println("route present between 0" + "and "+"4");
 }else{
   System.out.println("route not present between 0" + "and "+"4");
 }
 }
}
