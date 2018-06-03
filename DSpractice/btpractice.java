import java.util.*;

class BTpractice{
 
 Node root;
 static class Node{
  int data;
  Node left, right;
  Node(int data){
   this.data = data;
   left = right = null;
  }
 }
 
 public void print(Node root){
   if(root != null){
     print(root.left);
     System.out.println(root.data);
     print(root.right);
   }
 }

 public void insertTree(Node root, int number){
    if(root.data > number){
       if(root.left == null){
          root.left = new Node(number);
        }else{
         insertTree(root.left, number);
       }
    }else if(root.data < number){
       if(root.right == null){
         root.right = new Node(number);
       }else{
         insertTree(root.right, number);
      }
    } 
   }

 public static void main(String[] args){
  BTpractice bt = new BTpractice();
  Scanner sc = new Scanner(System.in);
  System.out.println("Print number of elements in tree");
  int size = sc.nextInt();
  bt.root = new Node(sc.nextInt());
  for(int i=1;i<size;i++){
   bt.insertTree(bt.root, sc.nextInt());
  } 
  bt.print(bt.root);
 }
}
