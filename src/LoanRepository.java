import java.util.ArrayList;
import java.util.List;

public class LoanRepository {

    private List<Loan> loans = new ArrayList<>();
    private int nextId = 1;

    public void add(Loan loan) {
        loan.setId(nextId);
        nextId++;
        loans.add(loan);

    }

    public List<Loan> listAll(){
        return loans;
    }

    public Loan findById(int id){
        for (Loan loan: loans)
            if (loan.getId() == id) {
                return loan;
            }
        return null;
    }

    public void update (Loan loan) {
        Loan existing = findById(loan.getId());

        existing.setReturned(loan.isReturned());
        existing.setReturnDate(loan.getReturnDate());
    }

    public void remove (int id){
        Loan existing = findById(id);
        if (existing != null) {
            loans.remove(existing);
        }
    }

    public List<Loan> findByUser(int userId) {
        List<Loan> result = new ArrayList<>();

        for (Loan loan: loans) {
            if (loan.getUser().getId() == userId) {
                result.add(loan);
            }
        }
        return result;
    }

    public List<Loan> findOpenLoans() {
        List<Loan> open = new ArrayList<>();

        for (Loan loan: loans) {
            if (!loan.isReturned()) {
                open.add(loan);
            }
        }
        return  open;
    }


}
