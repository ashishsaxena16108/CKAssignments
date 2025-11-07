import java.util.*;

public class Q20{
    public static void main(String[] args){

    }
}
class Product{
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) throws InvalidPriceException{
        setId(id);
        setName(name);
        setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws InvalidPriceException{
        if(price<0)
            throw new InvalidPriceException("Negative price is not allowed");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class InvalidPriceException extends Exception{
    InvalidPriceException(String msg){
        super(msg);
    }
}