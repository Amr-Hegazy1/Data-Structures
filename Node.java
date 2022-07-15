public class Node {
    String data;
    Node pointer;

    public Node(String data){
        this.data = data;
        this.pointer = null;
    }

    public Node getPointer(){
        Node n = new Node("");
        n.pointer = pointer;
        return n;
    }

    public String toString(){
        return data;
    }
}
