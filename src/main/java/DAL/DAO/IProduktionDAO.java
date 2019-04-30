package DAL.DAO;

public interface IProduktionDAO {

    void createProduktion(IProduktionDTO produktionDTO);
    void getProduktion(int ID);
    void updateProduktion(IProduktionDTO produktionDTO);
    void endProduktion(int ID);
}
