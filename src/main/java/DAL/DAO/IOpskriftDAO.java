package DAL.DAO;

import java.sql.Connection;

public interface IOpskriftDAO {

    void createOpskrift(Connection connection, IOpskriftDTO opskriftDTO);
    void getOpskrift(Connection connection, int ID);
    void updateOpskrift(Connection connection, IOpskriftDTO opskriftDTO);
    void deleteOpskrift(Connection connection, int ID);
}
