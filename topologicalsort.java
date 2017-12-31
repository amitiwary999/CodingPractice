import java.util.*;

class TopologicalSort{
 static LinkedList<Integer> arr[];
 static boolean visited[];
 static Stack<Integer> stack;
 TopologicalSort(int v){
  arr = new LinkedList[v];
  visited = new boolean[v];
  stack = new Stack<>();
  for(int i=0;i<v;i++){
   arr[i] = new LinkedList();
   visited[i] = false;
  }
 }
 public void addEdge(int src, int dest){
  arr[src].add(dest);
 }
 public void sort(int i){
  visited[i] = true;
  Iterator<Integer> ite = arr[i].listIterator();
  while(ite.hasNext()){
   int item = ite.next();
   if(!visited[item]){
     sort(item);
   }
  }
  stack.push(i);
 }
 public static void main(String[] args){
  TopologicalSort ts = new TopologicalSort(6);
  ts.addEdge(5,0);
  ts.addEdge(4,0);
  ts.addEdge(4,1);
  ts.addEdge(5,2);
  ts.addEdge(1,3);
  ts.addEdge(2,3); 
  Iterator<Integer> ite;
 for(int i=0;i<6;i++){
  ite = arr[i].listIterator();
  if(!visited[i]){
    ts.sort(i);
   }
  }
 while(!stack.isEmpty()){
    System.out.println(stack.pop());
  }
 }
}
