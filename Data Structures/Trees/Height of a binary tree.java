   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
int height(Node root){
    int leftHeight = 0;
    int rightHeight = 0;
    if (root != null){
        if (root.left != null){
            leftHeight = height(root.left);
        }
        if (root.right != null){
            rightHeight = height(root.right);
        }
    }

    return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
}
