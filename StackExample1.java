import java.util.Stack;

class StackExample{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.peek());
        stack.push(400);
        System.out.println(stack.peek());
        int ele = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}