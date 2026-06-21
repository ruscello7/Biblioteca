public class LoanService {

    private BookRepository bookRepository = new BookRepository();
    private UserRepository userRepository = new UserRepository();
    private LoanRepository loanRepository = new LoanRepository();

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
}
