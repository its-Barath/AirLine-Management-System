package AirLine_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private String url = "jdbc:mysql://127.0.0.1:3306/airlinemanagementsys?user=root";
    private String user = "root";
    private String pass = "barath07";
    private Statement statement;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(this.url, this.user, this.pass);
            this.statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return this.statement;
    }

    public void closeConnection() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
