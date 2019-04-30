package DAL.DTO;

import java.util.List;

public class BrugerDTO implements IBrugerDTO {

    int brugerID;
    String brugernavn;
    boolean admin;
    List<String> roller;

    public void BrugerDTO(int brugerID, String brugernavn, boolean admin, List<String> roller){

        this.brugerID = brugerID;
        this.brugernavn = brugernavn;
        this.admin = admin;
        this.roller = roller;

    }

    public int getBrugerID() {
        return this.brugerID;
    }

    public String getBrugernavn() {
        return this.brugernavn;
    }

    public Boolean getAdmin() {
        return this.admin;
    }

    public List getRoller() {
        return this.roller;
    }
}
