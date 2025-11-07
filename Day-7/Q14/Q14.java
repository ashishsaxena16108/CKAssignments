import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q14{
    public static void main(String[] args) {
       method1();
    }
    static void method1(){
        try{
            method2();
        }
        catch(Exception e){
            System.out.println("Catched in method 1");
        }
    }
    static void method2() throws Exception{
        try{
            method3();
        }
        catch(Exception e){
            System.out.println("Catched in method 2");
            throw new Exception();
        }
    }
    static void method3() throws Exception{
        try{
            System.out.println(4/0);
        }
        catch(Exception e){
            System.out.println("Catched in method 3");
            throw new Exception();
        }
    }
}