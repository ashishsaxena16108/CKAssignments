import java.io.*;
import java.util.*;
import java.lang.Override;

public class Q10{
    public static void main(String[] args) {
        Book book1 = new Book("New Age","Gordon",200);
        System.out.println(book1);
    }
}
class Book{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}