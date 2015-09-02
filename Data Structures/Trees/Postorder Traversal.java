/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void Postorder(Node node){
    if (node == null){
        return;
    }
    Postorder(node.left);
    Postorder(node.right);
    System.out.print(node.data+" ");
}
