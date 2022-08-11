public class Node2 {
    int data;
    Node2 right,left;

    public Node2(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
    
    public String toString(){
        return "" + data;
    }
}
