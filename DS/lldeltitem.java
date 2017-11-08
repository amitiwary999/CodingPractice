import java.util.*;

class DeleteNode {
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

 public void deleteItem(int data){
  Node temp;
  temp = head;
  Node prev = null;
  if(temp != null && temp.data == data){
    head = temp.next;
   return;
  }
  while(temp != null && temp.data != data){
    prev = temp;
    temp = temp.next;
  }
 if(temp == null){
    return;
  }
 prev.next = temp.next;
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
  DeleteNode obj = new DeleteNode();
  System.out.println("How many numbers you want to enter");
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  System.out.println("Enetr items");
  for (int i=0; i<no; i++){
   int number = sc.nextInt();
   obj.push(number);
  }
  System.out.println("Enter item you want to delete ");
  int item = sc.nextInt();
  obj.deleteItem(item);
  obj.printList();
 }
}
