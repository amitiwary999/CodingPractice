import java.util.*;

class Node {
 int key;
 Node left, right;

 Node(int key){
   this.key = key;
   left = right = null;
  }
 }

class BinaryTraversal{
 static Node root;
 
 BinaryTraversal(){
  root = null;
 }

 public void preOrderTraversal(Node node){
  if(node == null){
    return;
  }
  System.out.print(node.key+" ");
  preOrderTraversal(node.left);
  preOrderTraversal(node.right);
 }

 public void inOrder(Node node){
  if(node == null){
    return;
  }
  inOrder(node.left);
  System.out.print(node.key+" ");
  inOrder(node.right);
 }
 public void postOrder(Node node){
 if(node == null){
    return;
  }
  postOrder(node.left);
  postOrder(node.right);
  System.out.print(node.key+" ");
 }

 public static void main(String[] args){
  BinaryTraversal bt = new BinaryTraversal();
  bt.root = new Node(1);
  bt.root.left = new Node(2);
  bt.root.right = new Node(3);
  bt.root.left.left = new Node(4);
  bt.root.left.right = new Node(5);
  System.out.println("Pre Order");
  bt.preOrderTraversal(root);
  System.out.println(" ");
  System.out.println("Post Order");
  bt.postOrder(root);
  System.out.println(" ");
  System.out.println("InOrder");
  bt.inOrder(root);
 }
}
