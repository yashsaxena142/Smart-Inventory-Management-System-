package com.inventory.main;

public class App {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java -cp \"bin;lib/mysql-connector-j-9.0.0.jar\" com.inventory.main.App <db_url> <db_user> <db_password>");
            return;
        }

        String dbUrl = args[0];
        String dbUser = args[1];
        String dbPassword = args[2];

        // Set database configuration
        DatabaseConnection.setConfig(dbUrl, dbUser, dbPassword);

        // Proceed with your application logic
        // For example, showing the login form
        new LoginForm().setVisible(true);
    }
}
