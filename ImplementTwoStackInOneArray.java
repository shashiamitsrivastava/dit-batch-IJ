class TwoStack{
    int arr[];
    int capacity;
    int top1; // start from 0th
    int top2; // start from len-1
    TwoStack(int capacity){
        this.capacity = capacity;
        arr = new int[this.capacity];
        top1  = -1; // Left to Right Array
        top2= capacity; // Right to Left

    }
    void push1(int val){
        if(top1<top2-1){
        // Left to Right Push
        top1++; 
        arr[top1] = val;
        }
    }
    void push2(int val){
        // Right to Left Push
        if(top1<top2-1){
            top2--;
            arr[top2] = val;
        }
    }
    int pop1(){
        if(top1>=0){
            int val = arr[top1];
            top1--;
            return val;
        }
        else{
            throw new RuntimeException("Stack1 is Empty");
        }
    }
    int pop2(){
        //System.out.println(top2);
        if(top2<capacity){
            int val = arr[top2];
            top2++;
            return val;
        }
        else{
            throw new RuntimeException("Stack2 is Empty");
        }
    }
    void peek1(){
        for(int i =top1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    void peek2(){
        for(int i=top2; i<capacity; i++){
            System.out.println(arr[i]);
        }
    }
}
public class ImplementTwoStackInOneArray {
    public static void main(String[] args) {
        TwoStack obj = new TwoStack(10);
        obj.push1(10);
        obj.push1(20);
        obj.push1(30);
        obj.push2(100);
        obj.push2(200);
        obj.push2(300);
        obj.pop1();
        obj.pop2();
        obj.peek1();
        System.out.println("*******************************");
        obj.peek2();
    }
}
