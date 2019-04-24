package DAL;

import java.sql.*;

public class Connect implements IConnect {

    private String databaseURL = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s185143?";
    private String username = "user=s185143";
    private String password = "password=hYfJLbbto4EHaStuKJn1m";
    private Connection connection;

    public void createConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(databaseURL, username, password);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
