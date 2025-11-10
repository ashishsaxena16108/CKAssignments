//Q4.Given an array of integers and a target sum, return the indices of the two numbers that add up to the target

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target=6;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                System.out.printf("\n{%d,%d}\n",map.get(target-arr[i]),i);
                break;
            }
            map.put(arr[i], i);
        }
    }
}
