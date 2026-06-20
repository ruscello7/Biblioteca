import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    private int nextId = 1;

    public void add(User user) {
        user.setId(nextId);
        nextId++;
        users.add(user);
    }

    public List<User> listAll() {
        return users;
    }

    public User findById(int id) {
        for (User user : users)
            if (user.getId() == id) {
                return user;
            }
        return null;
    }

    public void update (User user) {
        User existing = findById(user.getId());

        existing.setCpf(user.getCpf());
        existing.setEmail(user.getEmail());
        existing.setName(user.getName());
    }

    public void remove (int id){
        User existing = findById(id);
        if (existing != null){
            users.remove(existing);
        }

    }

}
