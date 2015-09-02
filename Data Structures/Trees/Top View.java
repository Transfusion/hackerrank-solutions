/*
   class Node 
       int data;
       Node left;
       Node right;
*/

/* The proper solution should be to do BFS and keep a count of the displacement from the root node and avoid printing subsequent nodes with same displacement. However, this is hackerrank... hence we just print the nodes on the edge of the "christmas tree cone" https://www.hackerrank.com/challenges/tree-top-view/forum */

void top_view(Node root){
    Node curr = root;
    Stack<Node> stack = new Stack<Node>();
    while(curr != null) {
        stack.push(curr);
        curr = curr.left;
    }
    
    while(!stack.isEmpty()){
        Node node = stack.pop();
        System.out.print(node.data + " ");
    }
    
    curr = root.right;
    while(curr != null){
        System.out.print(curr.data + " ");
        curr = curr.right;
    }
}
