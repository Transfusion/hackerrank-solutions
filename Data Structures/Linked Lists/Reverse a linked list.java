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
Node Reverse(Node head) {
    if (head == null){
        return null;
    }
    Node node = null;
    while(head != null){
        Node i = node;
        node = new Node();
        node.data = head.data;
        node.next = i;
        head = head.next;
    }
    return node;
}

