import java.util.*;

class LinkedListInsertionBefore{
 Node head;
 static class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    next = null;
  }
 }

 public void print(){
  Node node = head;
  if(node != null){
    System.out.println(node.data);
    while(node.next != null){
     node = node.next;
     System.out.println(node.data);
   }
  }
 }

 public void insertionBefore(Node nextNode){
   Node node = head;
  if(node != null){
   if(nextNode != null){
       while(node.next == nextNode){
         node = node.next;
      }
     Node newNode = new Node(121);
     newNode.next = node.next;
     node.next = newNode;
     }
    }else{
     Node newNode = new Node(121);
     head = newNode;
   }
 }

 public static void main(String args[]){
   LinkedListInsertionBefore llib = new LinkedListInsertionBefore();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enetr number of items in linked list");
   int size = sc.nextInt();
   System.out.println("Enter items");
   llib.head = new Node(sc.nextInt());
   Node[] node = new Node[size-1];
   node[0] = new Node(sc.nextInt());
   llib.head.next = node[0];
   for(int i=1;i<size-1;i++){
    node[i] = new Node(sc.nextInt());
    node[i-1].next = node[i];
   }
   llib.print();
   llib.insertionBefore(llib.head.next.next);
   llib.print();
 }
}
