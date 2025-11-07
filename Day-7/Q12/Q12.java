import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for division:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Division by zero not allowed.");
        }
        finally{
            System.out.println("Division completed");
        }
    }
}