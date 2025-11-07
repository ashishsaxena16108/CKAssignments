import java.util.*;
public class Q17{
    public static void main(String[] args){
         List<Customer> list = new ArrayList<>();
         list.add(new Customer(1,"John Doe","john.doe@gmail.com"));
         list.add(new Customer(2,"Michael","michael@gmail.com"));
         list.add(new Customer(3,"Santa Claus","santa@gmail.com"));
         list.forEach(System.out::println);
    }
}
class Customer{
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}