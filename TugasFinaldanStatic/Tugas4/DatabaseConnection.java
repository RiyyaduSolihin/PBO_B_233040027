package Tugas4;

public class DatabaseConnection {
    public static String connectionString;

    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Database connection initialized.");
    }
}
