package DAL.DAO;

import DAL.DTO.IRåvareDTO;
import DAL.DTO.RåvareDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RåvareDAO implements IRåvareDAO {

    public void createRåvare(Connection connection, IRåvareDTO råvareDTO) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into Råvare values(?,?,?,?,?);");

            statement.setInt(1, råvareDTO.getProduktionsID());
            statement.setInt(2, råvareDTO.getIngrediensID());
            statement.setString(3, råvareDTO.getRåvarenavn());
            statement.setInt(4, råvareDTO.getmængde());
            statement.setBoolean(5, råvareDTO.getGenbestilling());

            statement.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public RåvareDTO getRåvare(Connection connection, int ID) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Råvare WHERE ID = ?;");

            statement.setInt(1, ID);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                RåvareDTO råvareDTO = new RåvareDTO(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getBoolean(5));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateRåvare(Connection connection, IRåvareDTO råvareDTO) {

    }

    public void deleteRåvare(Connection connection, int ID) {

    }
}
