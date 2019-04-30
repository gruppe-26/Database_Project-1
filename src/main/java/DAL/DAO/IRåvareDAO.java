package DAL.DAO;

public interface IRåvareDAO {

    void createRåvare(IRåvareDTO råvareDTO);
    void getRåvare(int ID);
    void updateRåvare(IRåvareDTO råvareDTO);
    void deleteRåvare(int ID);
}
