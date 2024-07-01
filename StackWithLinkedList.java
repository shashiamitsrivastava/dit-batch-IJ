// Stack implementation using LinkedList
class Node<T>{
    T data;
    Node<T> next; // default value null
    Node(T data){
        this.data = data;
    }
}
class Stack<T>{
    Node<T> top;
    int size;
    // Insertion at End
    void push( Node<T> newNode){
         newNode.next = top;
         top = newNode;
         size++;
    }
    void peek(){
        if(top == null){
            return ;
        }
        Node<T> temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    T pop(){
        if(top == null){
            throw new RuntimeException("Stack is Empty...");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
}
public class StackWithLinkedList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(new Node<Integer>(100));
        stack.push(new Node<Integer>(200));
        stack.push(new Node<Integer>(300));
        stack.peek();
        stack.pop();
        System.out.println("****************************");
        stack.peek();

    }
}
