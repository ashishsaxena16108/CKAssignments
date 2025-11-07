import java.io.*;
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find sum of digits:");
        int n = sc.nextInt();
        System.out.printf("Sum of Digits:%d\n",sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}