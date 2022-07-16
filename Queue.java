public class Queue {
    Node head,tail;

    public void enqueue(String data){
        Node n = new Node(data);
        if (head == null){
            head = n;
            tail = n;
            
        }else{
            tail.pointer = n;
            tail = n;
            
        }
    }

    public void dequeue(){
        if (tail != null && head != null){
            if(tail == head){
                tail = null;
                head = null;
            }else{
                head = head.pointer;
            }
        }
    }

    public String toString(){
        String out = "";
        Node current = head;
        while (current != null){ 
            out += current + "\n";
            current = current.pointer;
        }
        
        return out;
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.enqueue("4");
        
        System.out.println(q);
    }
}
