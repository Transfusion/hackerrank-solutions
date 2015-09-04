import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SwapNodesSet {
	private static class Node{
		int data;
		Node left;
		Node right;
	}

	public static void Inorder(Node node){
		if (node == null){
	        return;
	    }
	    Inorder(node.left);
	    if (node.data != -1){
	    	System.out.print(node.data+" ");
	    }
	    Inorder(node.right);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int nodecount = Integer.parseInt(reader.readLine());
//		0 is the first element; or the node with value 1
		Node[] nodes = new Node[nodecount];
		nodes[0] = new Node();
		nodes[0].data = 1;
		
		Map<Node, Integer> depth = new HashMap<Node, Integer>();
		Map<Integer, List<Node>> lookup = new HashMap<Integer, List<Node>>();
		
		depth.put(nodes[0], 1);
        lookup.put(1, new ArrayList<Node>());
		lookup.get(1).add(nodes[0]);
        
		for (int i = 0; i < nodecount; i++){
			int currDepth = depth.get(nodes[i]);
//			nodes[i] = new Node();
			String[] split = reader.readLine().split(" ");
			Node left = new Node(), right = new Node();
			left.data = Integer.parseInt(split[0]);
			right.data = Integer.parseInt(split[1]);
			
			if (left.data != -1 ){
				nodes[i].left = left;
				nodes[left.data-1] = left;
				depth.put(left, currDepth + 1);
				if (lookup.get(currDepth+1) == null){
					lookup.put(currDepth+1, new ArrayList<Node>());
				}
				lookup.get(currDepth+1).add(left);
			}
			if (right.data != -1){
				nodes[i].right = right;	
				nodes[right.data-1] = right;
				depth.put(right, currDepth + 1);
				if (lookup.get(currDepth+1) == null){
					lookup.put(currDepth+1, new ArrayList<Node>());
				}
				lookup.get(currDepth+1).add(right);
			}			
			
		}
		
		int swaps = Integer.parseInt(reader.readLine());
		for (int i = 0; i < swaps; i++){
			int k = Integer.parseInt(reader.readLine());
			for (int j = 1; lookup.get(j*k) != null; j++){
				for (Node b : lookup.get(j*k)){
					Node c = b.left;
					b.left = b.right;
					b.right = c;
				}
			}
			Inorder(nodes[0]);
			System.out.println();
		}
		
	}

}
