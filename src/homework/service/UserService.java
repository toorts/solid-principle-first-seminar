package homework.service;

import homework.model.User;
import homework.model.UserPersister;

public class UserService {
    private final User user;
    private final UserPersister persister;

    public UserService(User user) {
        this.user = user;
        this.persister = new UserPersister();
    }

    public void save() {
        persister.save(user);
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}