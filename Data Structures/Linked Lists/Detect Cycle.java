/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    if (head == null){
        return 0;
    }
    Node tortoise = head;
    Node hare = head;

    while(tortoise != null && tortoise.next != null) {        
        tortoise = tortoise.next;
        hare = hare.next.next;
        
        if(hare == null || tortoise == null) {
            return 0;
        }
        if(hare == tortoise){
            return 1;
        }
    }
    return 0;  
}

