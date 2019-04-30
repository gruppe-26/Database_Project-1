package DAL.DAO;

public interface IOpskriftDAO {

    void createOpskrift(IOpskriftDTO opskriftDTO);
    void getOpskrift(int ID);
    void updateOpskrift(IOpskriftDTO opskriftDTO);
    void deleteOpskrift(int ID);
}
