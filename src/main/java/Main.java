import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserRepository userRepository = new UserRepository();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to do?");
            String command = scanner.next();
            switch (command) {
                case "add":
                    System.out.println("Enter User name, email, and " +
                            "employment type space separated, and in that order: ");
                    String username = scanner.next();
                    String email = scanner.next();
                    String employment = scanner.next();
                    userService.addRecord(username, email, employment, userRepository);
                    break;
                case "get":
                    System.out.println("Enter email of user you want to search: ");
                    String emailSearch = scanner.next();
                    System.out.println(userService.getByEmail(emailSearch, userRepository));
                    break;
                case "getAll":
                    List<User> allUsers = userService.getAllUsers(userRepository);
                    for(User user : allUsers) {
                        System.out.println(user.getId() + ":" + user.getName() + ":" + user.getEmail() + ":" + user.getEmployment());
                    }
                    break;
            }
        }
    }

}
