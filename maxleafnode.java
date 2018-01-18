import java.util.*;

class MaxLeafNode{
 
 class Node{
  int data;
  Node left, right;
  Node(int data){
   this.data = data;
   left = right = null;
  }
 }
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
 
 int leftLeaf, rightLeaf;
 public int sumLeafToLeaf(Node root){
  if(root == null)
   return 0;
  leftLeaf = max(0, sumLeafToLeaf(root.left));
  rightLeaf = max(0, sumLeafToLeaf(root.right));
  count = max(count, root.data+leftLeaf+rightLeaf);
  return root.data+(max(leftLeaf, rightLeaf));
 }
 
 public int max(int left, int right){
   return left>right?left:right;
 }

 public void printMaxSum(){
  System.out.println(count);
 }

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   MaxLeafNode iit = new MaxLeafNode();
   MaxLeafNode.Node node = iit.new Node(20);
   for(int i=0;i<10;i++){
     System.out.println("Enter data in tree");
     int data = sc.nextInt();
     iit.insert(node, data);
    }
   System.out.println("Data are");
   iit.print(node);
   iit.sumLeafToLeaf(node);
   System.out.println("sum is");
   iit.printMaxSum();
 }
}
