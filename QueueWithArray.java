class Queue{
    int data[];
    int front ;
    int rear;
    int size;
    Queue(int len){
        data = new int[len];
        front = rear = -1; 
        size = 0;
    }
    int getSize(){
        return size;
    }
    boolean isEmpty(){
        System.out.println("Size is "+size);
        return size == 0;
    }
    int getFront(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty , Can't get the Front");
        }
        return data[front];
    }
    //add in queue
    void enqueue(int value){
        if(size == data.length){
            throw new RuntimeException("Queue is Full....");
        }
        if(isEmpty()){
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length){
            rear = 0;
        }
       
        data[rear] = value;
    }
    // delete
    int dequeue(){
        if(isEmpty() ){
            throw new RuntimeException("Queue is Empty So can't Dequeue");
        }
        int temp = data[front];
        front++;
        if(front == data.length){
            front = 0;
        }
        size--;
        if(size ==0){
            front = rear = -1;
        }
        return temp;
    }
    void print(){
        while(!isEmpty()){
            System.out.println(dequeue());
        }
    }
}
public class QueueWithArray {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getSize());
        System.out.println("*****************");
        queue.print();
    }
}
