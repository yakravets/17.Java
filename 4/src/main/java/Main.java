import models.User;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        User masha = new User("Masha","Petrova", "masha@petrova.com");
        userService.saveUser(masha);

        System.out.println(masha);

        masha.setEmail("maria@petrova.com");
        userService.saveUser(masha);

        System.out.println(masha);
        List<User> users = userService.findAllUsers();

        for (User user:
             users) {

            System.out.println(user);

        }


    }
}
