class CircularQueue{
    int data[];
    int front;
    int rear;
    
    CircularQueue(int len){
        data = new int[len];
        front = rear = 0;
    }
    int getSize(){
        return rear;
    }
    boolean isEmpty(){
        return rear == 0;
    }
    void enqueue(int value){
        if(rear == data.length){
            throw new RuntimeException("Queue is Full");
        }
        int index = (front + rear ) % data.length;
        data[index] = value;
        rear++;
        
    }

    int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        int value = data[front];
        data[front] = 0;
        front = (front + 1) % data.length;
        rear--;
        return value;
    }
    int getFront(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return data[front];
    }
    void print(){
        for(int i = 0; i<rear; i++){
            System.out.println(data[i]);
        }
    }
}
public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.dequeue();
        cq.dequeue();
        cq.print();
        cq.enqueue(90);
        cq.enqueue(1000);
        cq.print();


    }
}
