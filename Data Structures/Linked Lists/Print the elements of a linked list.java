/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 
    
void Print(Node head) {
    if (head == null){
        return;
    }
    Node node = head;
    while(true){
        System.out.println(node.data);
        if (node.next != null){
            node = node.next;
        }
        else {
            break;
        }
    }
  
}
