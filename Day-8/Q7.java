//Q7.Write above program using ExecutorService

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q7 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exs = Executors.newFixedThreadPool(2);
        exs.submit(()->{
            try {
                for(int i=1;i<=10;i++){
                    System.out.printf("2 * %d = %d\n",i,2*i);
                    Thread.sleep(1);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        exs.submit(()->{
            try {
                for(int i=1;i<=10;i++){
                    System.out.printf("4 * %d = %d\n",i,4*i);
                    Thread.sleep(1);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
