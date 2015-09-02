   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
void LevelOrder(Node node){
    Queue<Node> q = new LinkedList<Node>();
    q.add(node);
 
    while (!q.isEmpty()){
        Node n = q.remove();
        if (n.left != null){
            q.add(n.left);
        }

        if (n.right != null){
            q.add(n.right);
        }
        System.out.print(n.data+" ");
    }
}
