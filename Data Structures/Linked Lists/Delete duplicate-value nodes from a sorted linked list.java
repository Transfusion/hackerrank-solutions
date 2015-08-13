/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    Node node = head;
    if(head == null){
        return null;
    }
    while(head.next != null){
        if (head.data == head.next.data){
            head.next = head.next.next;
        }
        else {
            head = head.next;
        }
    }
    return node;
}
