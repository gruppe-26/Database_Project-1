package DAL.DAO;

import java.sql.Connection;

public interface IBrugerDAO {

    void createBruger(Connection connection, IBrugerDTO brugerDTO);
    void getBruger(Connection connection, int ID);
    void updateBruger(Connection connection, IBrugerDTO brugerDTO);
    void deleteBruger(Connection connection, int ID);
}
