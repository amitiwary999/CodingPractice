import java.util.*;

class ReverseList {
 Node head;
 class Node{
  int data;
  Node next;
  Node(int data){
   this.data = data;
   next = null;
  }
 }

 public void push(int data){
  Node nd = new Node(data);
  nd.next = head;
  head = nd;
 }

 public void reverseList(){
  Node temp;
  temp = head;
  Node nxt = null;
  Node prev = null;
  if(temp == null){
   return;
  }
  while(temp != null){
  nxt = temp.next;
  temp.next = prev;
  prev = temp;
  temp = nxt;
 }
 head = prev;
 }

 public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

 public static void main(String aregs[]){
  ReverseList obj = new ReverseList();
  System.out.println("How many numbers you want to enter");
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  System.out.println("Enetr numbers");
  for (int i=0; i<no; i++){
   int number = sc.nextInt();
   obj.push(number);
  }
  System.out.println("Original list");
  obj.printList();
  obj.reverseList();
  System.out.println("");
  System.out.println("Reversed list");
  obj.printList();
 }
}
