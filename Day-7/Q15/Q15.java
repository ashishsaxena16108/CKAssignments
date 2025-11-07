import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q15{
    public static void main(String[] args) throws ArithmeticException{
        try{
            int[] arr = new int[2];
            arr[0]=10;
            try{
                System.out.println(arr[0]/arr[1]);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception occured");
                throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}