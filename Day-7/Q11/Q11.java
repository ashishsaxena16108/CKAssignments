import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q11{
    public static void main(String[] args) {
       Car car1 = new Car("Toyota");
       Car car2 = new Car("BMW",2300000);
       System.out.println(car1);
       System.out.println(car2);
    }
}
class Car{
    String model;
    int price;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}