package structural.proxy;

import structural.proxy.models.Role;
import structural.proxy.models.User;

public class Main {
    public static void main(String[] args) {
        User admin = new User("Anant", Role.ADMIN);
        User user = new User("Prakhar", Role.USER);
        User targetUser = new User("John Doe", Role.USER);

        //real employee service
        UserService realService = new UserServiceImpl();

        //proxy
        UserServiceProxy proxy = new UserServiceProxy(realService);

        //admin trying to get and delete employee
        proxy.getUser(admin, targetUser);
        proxy.deleteUser(admin, targetUser);

        //Employee trying to get and delete another employee
        proxy.getUser(user, targetUser);
        proxy.deleteUser(user, targetUser);

    }
}
