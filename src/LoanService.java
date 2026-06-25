import java.util.List;

public class LoanService {

    private BookRepository bookRepository;
    private UserRepository userRepository;
    private LoanRepository loanRepository;

    public LoanService(BookRepository bookRepository, UserRepository userRepository, LoanRepository loanRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.loanRepository = loanRepository;
    }


    public void createLoan(int bookId, int userId) {
        Book book = bookRepository.findById(bookId);
        if (book.isAvailable()) {
            User user = userRepository.findById(userId);

            Loan loan = new Loan(book, user, 0, "2026-06-20", "", false);
            book.setAvailable(false);
            loanRepository.add(loan);
            }
        else {
            System.out.println("Book is not available!");
        }
    }

    public void returnBook(int loanId) {
        Loan loan = loanRepository.findById(loanId);
        loan.setReturned(true);
        Book book = loan.getBook();
        book.setAvailable(true);
    }

    public void listOpenLoans(){
        List<Loan> openLoans = loanRepository.findOpenLoans();
        for (Loan loan : openLoans) {
            System.out.println(loan);
        }
    }
}
