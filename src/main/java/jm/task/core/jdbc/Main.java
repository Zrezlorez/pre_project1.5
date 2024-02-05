package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 15);
        printName("Ivan");
        userService.saveUser("Nikita", "Nikitov", (byte) 16);
        printName("Nikita");
        userService.saveUser("Moroz", "Morozov", (byte) 17);
        printName("Moroz");
        userService.saveUser("Clown", "clownov", (byte) 18);
        printName("Clown");
        for (User user : userService.getAllUsers()) {
            System.out.println(user.toString());
        }
        userService.dropUsersTable();
    }

    public static void printName(String name) {
        System.out.printf("User с именем — %s добавлен в базу данных", name);
    }
}
