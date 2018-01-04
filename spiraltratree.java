import java.util.*;

class SpiralTraTree{

 Stack<Node> stack1 = new Stack<>();
 Stack<Node> stack2 = new Stack<>();
 int i=0;
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

 public void printSpiral(Node root){
  stack1.add(root);
  while(!stack1.isEmpty() || !stack2.isEmpty()){
    if(i%2 == 0){
       while(!stack1.empty()){
        Node node = stack1.pop();
        System.out.print(node.data+" ");
        if(node.right != null)
         stack2.add(node.right);
        if(node.left != null)
         stack2.add(node.left);
      }
     }else{
       while(!stack2.empty()){
        Node nd = stack2.pop(); 
        System.out.print(nd.data+" ");
        if(nd.left != null)
         stack1.add(nd.left);
        if(nd.right != null)
         stack1.add(nd.right);
     }
    }
   i++;
  }
 }
 
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   SpiralTraTree iit = new SpiralTraTree();
   SpiralTraTree.Node node = iit.new Node(10);
   for(int i=0;i<5;i++){
     System.out.println("Enter data in tree");
     int data = sc.nextInt();
     iit.insert(node, data);
   }
 iit.printSpiral(node);
 }
}
