/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

// http://stackoverflow.com/questions/31409989/what-is-the-best-approach-binary-search-tree-lowest-common-ancestor-using-onl
static Node lca(Node root, int v1, int v2) {
    if (root == null) return null;
    if (v1 > v2) {          
        int temp = v2;
        v2 = v1;
        v1 = temp;
    }
    while (root.data < v1 || root.data > v2) {
        if (root.data < v1) root = root.right;
        else if (root.data > v2) root = root.left;
    }       
    return root;
}
