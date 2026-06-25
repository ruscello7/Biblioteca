import java.util.List;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(String name, String email, String cpf) {
        User user = new User(0, cpf, email, name);
        repository.add(user);
    }

    public User findUser(int id) {
        return repository.findById(id);
    }

    public void removeUser(int id) {
        repository.remove(id);
    }

    public void listUsers() {
        List<User> users = repository.listAll();
        for (User user : users) {
            System.out.println(user);

        }
    }
}
