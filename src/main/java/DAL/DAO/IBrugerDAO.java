package DAL.DAO;

public interface IBrugerDAO {

    void createBruger(IBrugerDTO brugerDTO);
    void getBruger(int ID);
    void updateBruger(IBrugerDTO brugerDTO);
    void deleteBruger(int ID);
}
