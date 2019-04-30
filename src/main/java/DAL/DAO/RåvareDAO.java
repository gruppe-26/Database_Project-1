package DAL.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RåvareDAO implements IRåvareDAO {

    public void createRåvare(Connection connection, IRåvareDTO råvareDTO) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into Råvare values(?,?,?,?,?);");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void getRåvare(Connection connection, int ID) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Råvare WHERE ID = ?;");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateRåvare(Connection connection, IRåvareDTO råvareDTO) {

    }

    public void deleteRåvare(Connection connection, int ID) {

    }
}
