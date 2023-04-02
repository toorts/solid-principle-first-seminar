package homework;

import homework.model.User;
import homework.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new User("Bob"));
        userService.report();
        userService.save();
    }
}