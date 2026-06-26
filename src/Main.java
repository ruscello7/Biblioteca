import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        BookRepository bookRepository = new BookRepository();
        UserRepository userRepository = new UserRepository();
        LoanRepository loanRepository = new LoanRepository();

        BookService bookService = new BookService(bookRepository);
        UserService userService = new UserService(userRepository);
        LoanService loanService = new LoanService(bookRepository, userRepository, loanRepository);

        Scanner scanner = new Scanner(System.in);


        int option;
        do {
            System.out.println("\n===  LIBRARY MENU  ===");
            System.out.println("1 - Register boo k");
            System.out.println("2 - List books");
            System.out.println("3 - Register user");
            System.out.println("4 - Create loan");
            System.out.println("5 - Return book");
            System.out.println("6 - List open loans");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    bookService.registerBook(title, author, isbn);
                    break;

                case 2:
                    bookService.listBooks();
                    break;

                case 3:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Cpf: ");
                    String cpf = scanner.nextLine();

                    userService.registerUser(name, email, cpf);
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("User ID: ");
                    int userId = scanner.nextInt();

                    loanService.createLoan(bookId, userId);
                    break;

                case 5:
                    System.out.print("Loan Return: ");
                    int loanId = scanner.nextInt();

                    loanService.returnBook(loanId);
                    break;

                case 6:
                    loanService.listOpenLoans();
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }
        }
            while (option != 0) ;
    }
}

