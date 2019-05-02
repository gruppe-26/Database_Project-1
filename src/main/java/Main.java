import DAL.Connect;
import DAL.DAO.IIngrediensDAO;
import DAL.DAO.IngrediensDAO;
import DAL.DTO.IIngrediensDTO;
import DAL.DTO.IngrediensDTO;
import DAL.IConnect;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {


        IConnect connect = new Connect();
        IIngrediensDAO ingrediensDAO = new IngrediensDAO();
        IIngrediensDTO ingrediensDTO;

        connect.createConnection();

        ingrediensDAO.createIngrediens(connect.getConnection(),ingrediensDTO = new IngrediensDTO(1,"CarbonDioxid",200,1));


    }
}
