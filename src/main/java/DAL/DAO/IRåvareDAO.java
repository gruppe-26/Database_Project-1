package DAL.DAO;

import java.sql.Connection;

public interface IRåvareDAO {

    void createRåvare(Connection connection, IRåvareDTO råvareDTO);
    void getRåvare(Connection connection, int ID);
    void updateRåvare(Connection connection, IRåvareDTO råvareDTO);
    void deleteRåvare(Connection connection, int ID);
}
