import java.io.*;
import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial:");
        int n = sc.nextInt();
        System.out.printf("Factorial of %d : %d\n",n,factorial(n));
    }
    static int factorial(int n){
        int result=1;
        for(int i=n;i>0;i--){
            result*=i;
        }
        return result;
    }
}