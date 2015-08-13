/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if (head == null){
        return null;
    }
    while(head != null){
        Node i = head.prev;
        head.prev = head.next;
        head.next = i;
        if (head.prev == null){
            return head;
        }
        head = head.prev;
    }
    return head;
}
