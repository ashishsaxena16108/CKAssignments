import java.util.*;

public class Q2{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);
        NumberRule isEven = (n)->n%2==0;
        NumberRule isPrime = (n)->{
            for (int i = 2; i*i < n; i++) {
                if(n%i==0)
                    return false;
            }
            return true;
        };
        nums.stream().filter((i)->isEven.apply(i)&&isPrime.apply(i))
                .map((i)->i*i).toList()
                .stream().findFirst()
                .ifPresentOrElse(System.out::println,()->System.out.println("No matching number found"));
    }
}

@FunctionalInterface
interface NumberRule{
    boolean apply(int n);
}