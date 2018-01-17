import java.util.*;

class RightLeft{
 
 class Node{
  int data;
  Node left, right;
  Node(int data){
   this.data = data;
   left = right = null;
  }
 }
 
 Queue<Node> arr = new LinkedList<Node>();
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
 
 public void printLeftRightMost(Node root){
   if(root != null){
    arr.add(root);
    while(!arr.isEmpty()){
      int size = arr.size();
      int i;
      for(i=0;i<size;i++){
      Node nod = arr.peek();
      arr.poll();
      if(i == 0 || i == size-1){
      System.out.println(nod.data);
      }
      if(nod.left != null){
       arr.add(nod.left);
     }
     if(nod.right != null){
       arr.add(nod.right);
     }
    }
    }
   }
 }
 
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   RightLeft iit = new RightLeft();
   RightLeft.Node node = iit.new Node(10);
   for(int i=0;i<10;i++){
     System.out.println("Enter data in tree");
     int data = sc.nextInt();
     iit.insert(node, data);
    }
   System.out.println("Data are");
   iit.print(node);
   System.out.println("Left and right most element of each level");
   iit.printLeftRightMost(node); 
 }
}
