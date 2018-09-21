import java.util.*;

class AddTwoLinkedList{

  Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
    this.data = data;
    next = null;
   }
  }


  public void pushInList(int data){

  }
  public static void main(String[] args){
   AddTwoLinkedList add = new AddTwoLinkedList();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number length");
   int length1 = sc.nextInt();
   System.out.println("Enter single digits");
   for(int i=0; i<length1; i++){
    add.pushInList(sc.nextInt());
   }
   System.out.println("Enter second number length");
   int length2 = sc.nextInt();
   System.out.println("Enter single digits"); 
   for(int i=0;i<length2;i++){
    add.pushInList(sc.netInt());

   }
  }
}
