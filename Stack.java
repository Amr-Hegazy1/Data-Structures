public class Stack {
    Node start,free,end;

    public void push(String data){
        Node n = new Node(data);
        if (start == null){
            start = n;
            free = n;
            end = start;
        }else{
            n.pointer = end;
            end = n;
            free = n;

        }
    }

    public void pop(){
        if (end != null){
            end = end.pointer;
        }
    }

    public String toString(){
        String out = "";
        if(end != null){
            Node current = end;
            while (current != null){
                out += current + "\n";
                current = current.pointer;
            }

        }
        return out;
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.pop();
        stack.push("4");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
