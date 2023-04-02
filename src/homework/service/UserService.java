package homework.service;

import homework.model.User;
import homework.model.Saver;

public class UserService {
    private final User user;
    private final Saver saver;

    public UserService(User user) {
        this.user = user;
        this.saver = new Saver();
    }

    public void save() {
        saver.save(user);
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}