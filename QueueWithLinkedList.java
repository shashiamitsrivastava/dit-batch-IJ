class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
class QueueLL{
    Node<Integer> front;  // head
    Node<Integer> rear; // tail
    void enqueue(int value){
        Node<Integer> newNode = new Node<>(value);
        if(front == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    int dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        front = front.next;
        if(front == null){
            rear=null;
        }
        return front.data;

    }
    void print(){
        Node<Integer> temp  = front;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
}
public class QueueWithLinkedList {
    
}
