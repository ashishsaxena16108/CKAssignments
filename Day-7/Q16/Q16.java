import java.io.*;
import java.util.*;

class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}
public class Q16{
    public static void main(String[] args) throws InvalidEmailException{
        Scanner sc = new Scanner(System.in);
        try{
            String email = sc.next();
            if(email.indexOf("@")==-1)
                throw new InvalidEmailException("@ is not present in email.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
