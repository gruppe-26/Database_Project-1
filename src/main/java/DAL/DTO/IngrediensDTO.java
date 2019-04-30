package DAL.DTO;

public class IngrediensDTO implements IIngredientDTO{

    int opskriftID;
    String ingrediensnavn;
    int mængde;
    int ingrediensID;

    public void IngrediensDTO(int opskriftID, String ingrediensnavn, int mængde, int ingrediensID){

        this.opskriftID = opskriftID;
        this.ingrediensnavn = ingrediensnavn;
        this.mængde = mængde;
        this.ingrediensID = ingrediensID;

    }

    public int getOpskriftID() {
        return this.opskriftID;
    }

    public String getIngrediensNavn() {
        return this.ingrediensnavn;
    }

    public int getMængde() {
        return this.mængde;
    }

    public int getIngrediensID() {
        return this.ingrediensID;
    }
}
