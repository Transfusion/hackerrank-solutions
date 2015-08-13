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

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node node = head;
    StringBuilder s = new StringBuilder();
    while (node != null){
        s.insert(0, Integer.toString(node.data)+'\n');
        node = node.next;
    }
    System.out.print(s);
}

