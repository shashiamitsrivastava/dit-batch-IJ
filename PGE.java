import java.util.Stack;
class PGE{
    public static void main(String[] args) {
        int arr[] = {10,5,100,90,88,99};
        System.out.println();
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.print(-1+" ");
        for(int i = 1; i<arr.length; i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            int previousGreaterElement = stack.isEmpty()?-1:stack.peek();
            System.out.print(previousGreaterElement+" ");
            stack.push(arr[i]);
        }
        System.out.println();

    }
}