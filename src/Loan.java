public class Loan {
    private Book book;
    private User user;
    private int id;
    private String loanDate;
    private String returnDate;
    private boolean returned;

    public Loan(Book book, User user, int id, String loanDate, String returnDate, boolean returned) {
        this.book = book;
        this.user = user;
        this.id = id;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "book=" + book +
                ", user=" + user +
                ", id=" + id +
                ", loanDate='" + loanDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", returned=" + returned +
                '}';
    }
}
