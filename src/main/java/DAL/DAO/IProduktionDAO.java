package DAL.DAO;

import java.sql.Connection;

public interface IProduktionDAO {

    void createProduktion(Connection connection, IProduktionDTO produktionDTO);
    void getProduktion(Connection connection, int ID);
    void updateProduktion(Connection connection, IProduktionDTO produktionDTO);
    void endProduktion(Connection connection, int ID);
}
