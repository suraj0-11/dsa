import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("F");
        queue.offer("D");
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println(queue);
    }
}
