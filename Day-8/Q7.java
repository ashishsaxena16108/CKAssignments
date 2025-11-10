//Q7.Write above program using ExecutorService

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q7 {
    private static boolean isTwo = true;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exs = Executors.newFixedThreadPool(2);

        exs.submit(()->{
            synchronized (Q7.class) {
                try {
                    for (int i = 1; i <= 10; i++) {
                        while (!isTwo) {
                            Q7.class.wait();
                        }
                        System.out.printf("2 * %d = %d\n", i, 2 * i);
                        isTwo = false;
                        Q7.class.notifyAll();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        exs.submit(()->{
            synchronized (Q7.class) {
                try {
                    for (int i = 1; i <= 10; i++) {
                        while (isTwo) {
                            Q7.class.wait();
                        }
                        System.out.printf("4 * %d = %d\n", i, 4 * i);
                        isTwo = true;
                        Q7.class.notifyAll();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
