import java.util.Queue;
import java.util.LinkedList;

public class Queue_DSA {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Minecraft");
        queue.offer("game");
        queue.offer("suraj");
        queue.offer("haha");  

        // queue.poll();
        // queue.poll();
        // queue.poll();
        // queue.poll();
        
        System.out.println(queue);
        System.out.println(queue.contains("game"));
    }
}