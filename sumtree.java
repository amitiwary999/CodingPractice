/*
 find number of paths having sum k 
*/
import java.util.*;

class SumTree{
 
 class Node{
  int data;
  Node left, right;
  Node(int data){
   this.data = data;
   left = right = null;
  }
 }
 
 ArrayList<Node> arr = new ArrayList<Node>();
 int count = 0;

 public void insert(Node root, int data){
  if(data>root.data){
   if(root.right == null){
      root.right = new Node(data);
   }else{
     insert(root.right, data);
   }
  }else if(data<root.data){
    if(root.left == null){
      root.left = new Node(data);
   }else{
     insert(root.left, data);
   }
  }
 }

 public void print(Node root){
   if(root != null){
     print(root.left); 
     System.out.println(root.data);
     print(root.right);
  }
 }
 
 public void routecount(Node root, int k){
  if(root !=null){
   arr.add(root);
   routecount(root.left, k);
   routecount(root.right, k);

   int sum = 0;
   for(int i=arr.size()-1; i>=0; i--){
    sum += arr.get(i).data;
    if(sum == k){
      count++;
    } 
   }
  arr.remove(root);
  }
 }

 public void printCount(){
     System.out.println(count);
 }

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   SumTree iit = new SumTree();
   SumTree.Node node = iit.new Node(10);
   for(int i=0;i<10;i++){
     System.out.println("Enter data in tree");
     int data = sc.nextInt();
     iit.insert(node, data);
   }
   int k;
   System.out.println("Enter sum required");
   k = sc.nextInt();
   System.out.println("Data are");
   iit.print(node);
   System.out.println("paths having node sum "+k);
   iit.routecount(node, k);
   iit.printCount();
 }
}
