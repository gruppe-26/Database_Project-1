package DAL.DAO;

import java.sql.Connection;

public interface IIngredientDAO {

    void createIngredient(Connection connection, IIngredientDTO ingredientDTO);
    void getIngredient(Connection connection, int ID);
    void updateIngredient(Connection connection, IIngredientDTO ingredientDTO);
    void deleteIngredient(Connection connection, int ID);
}
