import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void add(Book book) {
        book.setId(nextId); // sets the book's ID with the next available ID
        nextId++; // increments the counter (1 becomes 2, 2 becomes 3, etc.)
        books.add(book); // adds the book to the list

    }

}
