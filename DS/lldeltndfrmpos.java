import java.util.*;

class DeleteNodeFromPos {
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

 public void deletefrompos(int pos){
  Node temp;
  temp = head;
  if(temp == null){
   return;
  }
  if(pos == 0){
    head = temp.next;
    return;
  }
  for(int i=0; temp!= null && i<pos-1;i++){
    temp = temp.next;
  }
 if(temp!=null && temp.next != null){
    Node prev = temp.next.next; 
    temp.next = prev;
  }else{
    return;
  }
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
  DeleteNodeFromPos obj = new DeleteNodeFromPos();
  System.out.println("How many numbers you want to enter");
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  System.out.println("Enetr numbers");
  for (int i=0; i<no; i++){
   int number = sc.nextInt();
   obj.push(number);
  }
  System.out.println("Enter position from where you want to delete data");
  int position = sc.nextInt();
  obj.deletefrompos(position);
  obj.printList();
 }
}
