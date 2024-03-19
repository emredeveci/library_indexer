import java.util.*;

public class Main {
    public static void main(String[] args) {

        //create the books
        Book book1 = new Book("Order of the Phoenix", "J.K. Rowling", 650, 2005);
        Book book2 = new Book("Guilty Pleasures", "Laurell K. Hamilton", 400, 1998);
        Book book3 = new Book("Earthsea", "Ursula K. Le Guin", 340, 1980);
        Book book4 = new Book("The Magicians", "Lev Grossman", 440, 2003);
        Book book5 = new Book("The Subtle Knife", "Philip Pullman", 450, 1997);

        Set<Book> bookSet = new TreeSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        //print the books with the alphabetical order
        System.out.println("Books ordered alphabetically:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
        System.out.println("==============================");

        //adding previously created Book set to a new Set using an anonymous method
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageCount() - b2.getPageCount();
            }
        });

        bookSetByPageCount.addAll(bookSet);

        System.out.println("Books ordered by the number of pages:");
        for(Book book : bookSetByPageCount){
            System.out.println(book);
        }
    }
}