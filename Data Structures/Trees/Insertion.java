 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root, int value){
    Node node = root;
    if (node == null){
        node = new Node();
        node.data = value;
        return node;
    }
    while (true){
        if (value > node.data){
            if (node.right != null){
                node = node.right;
            }
            else {
                node.right = new Node();
                node.right.data = value;
                break;
            }

        }

        else {
            if (node.left != null){
                node = node.left;
            }
            else {
                node.left = new Node();
                node.left.data = value;
                break;
            }
        }

    }
    return root;

}
