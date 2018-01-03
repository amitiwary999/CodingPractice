import java.util.*;

class IsBstOrNot{
 ArrayList<Integer> list = new ArrayList<>();

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

 public void isBst(Node root){
  if(root != null){
     isBst(root.left);
     list.add(root.data);
     isBst(root.right);
   }
 }
 
 public boolean isSortedItem(){
  boolean flag = true;
  for(int i=1;i<list.size();i++){
   if(list.get(i)<list.get(i-1)){
      flag = false;
      break;
   }
  }
 return flag;
 }

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   IsBstOrNot ibot = new IsBstOrNot();
   IsBstOrNot.Node node = ibot.new Node(10);
   for(int i=0;i<5;i++){
     System.out.println("Enter data in tree");
     int data = sc.nextInt();
     ibot.insert(node, data);
  }
  ibot.isBst(node);
  System.out.println(ibot.isSortedItem());
 }
}
