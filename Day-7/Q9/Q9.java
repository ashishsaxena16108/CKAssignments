import java.io.*;
import java.util.*;
import java.lang.Override;

public class Q9{
    public static void main(String[] args) {
         System.out.println("Max:"+MathUtils.max(new int[]{23,45,46}));
         System.out.println("Max:"+MathUtils.min(23,45));
         System.out.println("Max:"+MathUtils.avg(23,45));
    }
}
class MathUtils{
    static int max(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    static int min(int a,int b){
        return a<b?a:b;
    }
    static int avg(int a,int b){
        return (a+b)/2;
    }
}