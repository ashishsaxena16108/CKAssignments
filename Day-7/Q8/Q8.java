import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q8{
    public static void main(String[] args) {
       Counter counter1 = new Counter();
       Counter counter2 = new Counter();
       Counter counter3 = new Counter();
       Counter counter4 = new Counter();
       System.out.println(Counter.getCounter());
    }
}
class Counter{
    static int counter=0;
    Counter(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}