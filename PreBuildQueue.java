import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class PreBuildQueue{
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>(); // Upcasting
        Queue<Integer> queue = new ArrayDeque<>(); // Upcasting
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.add(555);
        System.out.println(queue);
        System.out.println(queue.peek()); //getFront
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.poll();
        System.out.println(queue);
        queue.offer(88);
        System.out.println(queue);


    }
}