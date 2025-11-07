import java.io.*;
import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse:");
        int n = sc.nextInt();
        System.out.printf("Reverse of number:%d\n",reverse(n));
    }
    static int reverse(int n){
        int sum=0;
        while(n!=0){
            sum=(sum*10)+n%10;
            n=n/10;
        }
        return sum;
    }
}