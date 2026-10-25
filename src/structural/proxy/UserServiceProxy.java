package structural.proxy;

import structural.proxy.models.Role;
import structural.proxy.models.User;

public class UserServiceProxy implements UserService {
    private final UserService realService;

    public UserServiceProxy(UserService realService) {
        this.realService = realService;
    }
    @Override
    public void getUser(User caller, User target) {
        //Allow all roles to get employee info
        realService.getUser(caller, target);
    }

    @Override
    public void deleteUser(User caller, User target) {
        if(caller.getRole() == Role.ADMIN || caller.getName().equalsIgnoreCase(target.getName())) {
            realService.deleteUser(caller, target);
        } else {
            System.out.println(caller.getName()+ " is not allowed to delete user: "+target.getName());
        }
    }
}
