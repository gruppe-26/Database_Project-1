package DAL.DTO;

import java.util.List;

public interface IBrugerDTO {
    int getBrugerID();
    String getBrugernavn();
    Boolean getAdmin();
    List getRoller();
}
