import java.util.*;

class InsertInTree{

 class Node{
  int data;
  Node left, right;
  Node(int data){
   this.data = data;
   left = right = null;
  }
 }
 
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

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   InsertInTree iit = new InsertInTree();
   InsertInTree.Node node = iit.new Node(10);
   for(int i=0;i<5;i++){
     System.out.println("Enter data in tree");
     int data = sc.nextInt();
     iit.insert(node, data);
   }
   System.out.println("Data are");
   iit.print(node);
 }
}
