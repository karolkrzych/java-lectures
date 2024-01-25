package com.company;

import java.util.Scanner;

public class User {

    private String login;
    private String password;
    private Role role;

    public User(String user) {
        String[] splited = user.split(";");
        this.login = splited[0];
        this.password = splited[1];
        this.role = Role.valueOf(splited[2]);
    }

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public boolean correctingLogIn(String login, String password) {
        return login.equals(this.login) && password.equals(this.password);
    }

    public String saveString() {
        return this.login + ";" + this.password + ";" + this.role;
    }

    public static User build() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Role: ");
        Role role = Role.valueOf(scanner.nextLine());

        return new User(login, password, role);
    }

    public String getLogin() {
        return login;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return this.login + " " + this.role;
    }
}
