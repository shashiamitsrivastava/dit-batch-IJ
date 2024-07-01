// import java.util.ArrayList;

// class Stack<T>{
//     //T arr[]; // int arr[]
//     ArrayList<T> arr;
//     int capacity;
//     int top ; 
//     Stack(int capacity){
//         top  = -1; // Not on any index
//         this.capacity = capacity;
//         arr = new ArrayList<>(capacity);
//         //arr = new T[capacity];
//     }
//     // Stack Operations
//     void push(T element){
//         if(getSize() == capacity){
//             throw new RuntimeException("Stack is Full....");
//         }
//         // Insertion at End
//         top++;
        
//         arr.add(top, element);
//     }
//     T pop(){
//         if(isEmpty()){
//             throw new RuntimeException("Stack is Empty ... ");
//         }
//         // remove at last
//         T element = arr.remove(top);
//         top--;
//         return element;
//     }
//     boolean isEmpty(){
//         return top == -1;
//     }
//     void peek(){
//         // reverse print of array
//         for(int i = top; i>=0; i--){
//             System.out.println(arr.get(i));
//         }
//     }
//     int getSize(){
//         return top + 1;
//     }
// }
// public class StackWithArray {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>(5);
//         stack.push(100);
//         stack.push(200);
//         stack.push(300);
//         stack.peek();
//         stack.pop();
//         stack.peek();
//     }
// }
