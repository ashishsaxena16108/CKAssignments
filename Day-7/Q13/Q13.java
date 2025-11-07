import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q13{
    public static void main(String[] args) {
        try{
            int[] arr = new int[2];
            arr[0]=10;
           try{
              System.out.println(arr[0]/arr[1]);
           }
           catch(ArithmeticException e){
               System.out.println("Arithmetic Exception occured");
           }
            System.out.println(arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occured");
        }
    }
}