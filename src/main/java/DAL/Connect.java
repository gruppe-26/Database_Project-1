package DAL;

import java.sql.*;

public class Connect implements IConnect {

    private String databaseURL = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/jenje?user=jenje&password=lWTVmppL0fSKIItQthPJa";
    private Connection connection;

    public void createConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(databaseURL);
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
