import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void add(Book book) {
        book.setId(nextId);
        nextId++;
        books.add(book);

    }

}
