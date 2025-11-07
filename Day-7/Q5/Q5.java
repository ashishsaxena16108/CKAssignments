import java.io.*;
import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2+3 = "+calc.add(2,3));
        System.out.println("4-3 = "+calc.subtract(4,3));
        System.out.println("20*30 = "+calc.multiply(20,30));
        System.out.println("3/2 = "+calc.divide(3,2));
    }
}
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}