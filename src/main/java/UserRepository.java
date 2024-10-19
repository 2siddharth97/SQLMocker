import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    private Map<String, User> emailIndex = new HashMap<>();
    private Long currId = 1L;

    public void saveUser(User user){
        users.add(user);
        emailIndex.put(user.getEmail(), user);
        user.setId(currId++);
    }

    public User getUserByEmail(String email){
        return emailIndex.get(email);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}
