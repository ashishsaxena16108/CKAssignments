//Q6.Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4.
//Threads should be synced to print output one by one.


public class Q6 {
    private static boolean isTwo=true;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            synchronized (Q6.class) {
                try {
                    for (int i = 1; i <= 10; i++) {
                        while (!isTwo) {
                            Q6.class.wait();
                        }
                        System.out.printf("2 * %d = %d\n", i, 2 * i);
                        isTwo=false;
                        Q6.class.notifyAll();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (Q6.class) {
                try {
                    for (int i = 1; i <= 10; i++) {
                        while(isTwo){
                            Q6.class.wait();
                        }
                        System.out.printf("4 * %d = %d\n", i, 4 * i);
                        isTwo=true;
                        Q6.class.notifyAll();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}