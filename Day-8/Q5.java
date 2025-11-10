//Q5.You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list.
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> arr1 = List.of(1,3,5,23,47);
        List<Integer> arr2 = new ArrayList<>(List.of(13,17,20,49));
        arr2.addAll(arr1);
        arr2.sort(null);
        System.out.println(arr2);
    }
}
