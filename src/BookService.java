import java.util.List;

public class BookService {

private BookRepository repository = new BookRepository();

public void registerBook(String title, String author, String isbn) {
    Book book = new Book(author, isbn, true, title, 0);
    repository.add(book);
}
public Book findBook(int id) {
    return repository.findById(id);
}

public void removeBook(int id) {
    repository.remove(id);
}

public void listBooks() {
    List<Book> books = repository.listAll();
    for (Book book : books) {
        System.out.println(book);

        }
    }
}
