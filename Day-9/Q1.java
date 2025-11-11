import java.util.concurrent.*;
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        ExecutorService exs = Executors.newFixedThreadPool(2);
        Queue<Integer> queue = new LinkedList<>();
        exs.submit(()->{
            try {
                for (int i = 1; i <= 50 ; i++) {
                    synchronized (Q1.class) {
                        while (queue.size() == 5) {
                            Q1.class.wait();
                        }
                        queue.add(i);
                        Q1.class.notifyAll();
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        exs.submit(()->{

            try {
                while(true) {
                    synchronized (Q1.class) {
                        while (queue.isEmpty()) {
                            Q1.class.wait();
                        }
                        int value = queue.poll();
                        System.out.println(value);
                        Q1.class.notifyAll();
                        if (value == 50) break;
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });
        exs.shutdown();
    }
}