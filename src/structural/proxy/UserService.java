package structural.proxy;

import structural.proxy.models.User;

public interface UserService {
    void getUser(User caller, User target);
    void deleteUser(User caller, User target);
}
