public class LinkedList {
    Node head,free;
    public void add(String data){
        if (head == null){
            Node n = new Node(data);
            head = n;
            free = n;
        }else{
            Node n = new Node(data);
            free.pointer = n;
            free = n;
            n.pointer = null;
        }
    }

    public void remove(String data){
        if(head != null){
            if (head.data == data)
                head = head.pointer;
            else{
                Node current = head;
                Node previous = current;
                while (current != null && current.data != data){
                    previous = current;
                    
                    current = current.pointer;
                    
                }
                previous.pointer = current.getPointer();
                
            }
        }
    }

    public String toString(){
        Node current = head;
        String out = "";
        while (current != null){
            out += current + "\n";
            current = current.pointer;
        }
        return out;
    }

    public static void main(String[] args){
        
        LinkedList LL  = new LinkedList();
        LL.add("1");
        LL.add("2");
        LL.add("3");
        LL.add("4");
        LL.remove("3");
        System.out.println(LL);
    }
    
}
