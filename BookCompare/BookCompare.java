import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * BookCompare
 */
public class BookCompare {
    
    public static void main(String[] args) {
        Book b1 = new Book("Küçük Ağa", "Tarık Buğra", 1928, 100);   
        Book b3 = new Book("Yaban", "Yakup Kadri", 1929, 300);
        Book b2 = new Book("Kaşağı", "Ömer Seyfettin", 1889, 200);
        Book b4 = new Book("Araba Sevdası", "Recaizade", 1887, 360);
        Book b5 = new Book("İntibah", "Namık Kemal", 1880, 120);
        Set<Book> set = new TreeSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);
        for (Book book : set) {
            System.out.println(book.name);
        }
        Set<Book> set2 = new TreeSet<>((book0, book1) -> Integer.compare(book0.pageCount,book1.pageCount));
        set2.add(b1);
        set2.add(b2);
        set2.add(b3);
        set2.add(b4);
        set2.add(b5);
        for (Book book : set2) {
            System.out.println(book.name);
        }
    }
}