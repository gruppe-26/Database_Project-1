package DAL.DAO;

import DAL.DTO.IProduktionDTO;

import java.sql.Connection;
import java.sql.Date;

public interface IProduktionDAO {

    void createProduktion(Connection connection, IProduktionDTO produktionDTO);
    IProduktionDTO getProduktion(Connection connection, int ID);
    void updateProduktion(Connection connection, IProduktionDTO produktionDTO);
    void endProduktion(Connection connection, IProduktionDTO produktionDTO);
    void deleteProduktion(Connection connection, int ID);
}
