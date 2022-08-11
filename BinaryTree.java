public class BinaryTree {
    Node2 root;

    public void add(int data){
        Node2 n = new Node2(data);
        if (root == null)
            root = n;
        else{
            Node2 current = root;
            Node2 previous = root;
            boolean left = false;
            while (current != null){
                previous = current;
                if (data < current.data){
                    current = current.left;
                    left = true;
                }
                else{
                    current = current.right;
                    left = false;
                }
            }
            
            if (left)
                previous.left = n;
            else
                previous.right = n;

        }
    }
    
    public Node2 search(int data) {
    	if (root != null) {
    		Node2 current = root;
    		
    		while (current != null && current.data != data) {
    			if (data < current.data)
                    current = current.left;
    			else
    				current = current.right;
    		}
    		return current;
    	}
    	return null;
    }
    
    public void delete(int data) {
    	if (root != null) {
    		Node2 current = root;
    		Node2 previous = root;
    		boolean left = false;
    		while (current != null && current.data != data) {
    			previous = current;
    			if (data < current.data){
                    current = current.left;
                    left = true;
                }
                else{
                    current = current.right;
                    left = false;
                }
    			
    		}
    		
    		if (left)
    			previous.left = current.left;
    		else
    			previous.right = current.right;
    	}
    }
    
    public void traverse(){
        traverse(root);
    }

    public void traverse(Node2 current){
        if (current != null)
            System.out.println(current);
        if(current.left != null)
            traverse(current.left);
        if(current.right != null)
            traverse(current.right);
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(9);
        bt.add(3);
        bt.add(1);
        bt.add(7);
        bt.delete(3);
        bt.traverse();
    }
}
