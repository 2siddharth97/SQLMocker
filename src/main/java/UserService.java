import java.util.List;

public class UserService {

    public void addRecord(String name, String email, String employment, UserRepository userRepository) {
        User user = new User(null, name, email, employment);
        userRepository.saveUser(user);
        System.out.println("User saved");
    }

    public String getByEmail(String email, UserRepository userRepository) {
        User user = userRepository.getUserByEmail(email);
        if(user != null) {
            return user.toString();
        }
        return "User not found";
    }

    public List<User> getAllUsers(UserRepository userRepository) {
        return userRepository.getAllUsers();
    }


}
