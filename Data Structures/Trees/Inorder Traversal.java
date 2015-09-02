/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Inorder(Node node){
    if (node == null){
        return;
    }
    Inorder(node.left);
    System.out.print(node.data+" ");
    Inorder(node.right);
}
