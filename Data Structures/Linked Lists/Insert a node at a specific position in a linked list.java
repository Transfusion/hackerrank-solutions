/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node InsertNth(Node head, int data, int position) {
    Node node = head;
    if (position == 0){
        node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
    else {
        while(--position > 0){
            node = node.next;
        }
        Node i = node.next;
        node.next = new Node();
        node.next.data = data;
        node.next.next = i;
        return head;
    }
}
