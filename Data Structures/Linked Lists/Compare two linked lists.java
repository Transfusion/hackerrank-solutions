/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    if (headA == null && headB == null){
        return 1;
    }
    while (headA.data == headB.data){
        if(headA.next == null){
            if(headB.next == null){
                return 1;
            }
            else {
                return 0;
            }
        }
        headA = headA.next;
        headB = headB.next;
    }
    return 0;
}

