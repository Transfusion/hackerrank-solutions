/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S, Node root){

	/*A - 1
	B - 00
	C - 01*/
	StringBuilder output = new StringBuilder();
	Node base = root;
  while (!S.isEmpty()){
    if (S.charAt(0) == '1'){
    	base = base.right;
    	S = S.substring(1);
    }
    else {
    	base = base.left;
    	S = S.substring(1);
    }
    if (base.left == null && base.right == null){
  		output.append(base.data);
  		base = root;
  	}

  }
  System.out.println(output.toString());
}

