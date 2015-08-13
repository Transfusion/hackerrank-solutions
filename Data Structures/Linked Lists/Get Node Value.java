/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int nodes = 0;
    Node i = head;
    while(i != null){
        i = i.next;
        nodes++;
    }
    nodes -= n;
    while(--nodes > 0){
        head = head.next;
    }
    return head.data;
}
