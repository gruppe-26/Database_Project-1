package DAL.DAO;

public interface IIngredientDAO {

    void createIngredient(IIngredientDTO ingredientDTO);
    void getIngredient(int ID);
    void updateIngredient(IIngredientDTO ingredientDTO);
    void deleteIngredient(int ID);
}
