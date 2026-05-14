package hu.nje.kalandjatekmobil.domain;

public class CurrentPage {
    /*
    PageID : Oldal száma
    Description : Jelenlegi oldal leírása

    Type : Milyen típus ez az oldal :
    0 : normális útválasztós oldal
    1 : harc!
    2 : tedd próbára szerencséd!
    3 : tedd próbára ügyességed!
    4 : egyedi ( dobj egy d6-ot, annyi életet veszítesz )

    Decision1_ID : Első választás oldalszáma, hova fog lapozni
    Decision1_Flavortext : Első választás mini leírása " Ha ide akarsz lapozni... "
    Decision2_ID : lásd fentebb
    Decision2_Flavortext : lásd fentebb
    Decision3_ID : lásd fentebb
    Decision3_Flavortext : lásd fentebb

    Van oldal, ahol lehet szerezni vagy veszíteni értékeket és tárgyakat
    StaminaChange :  mennyi életet kapsz/veszítesz
    SkillChange :  ugyanaz, ügyességgel
    LuckChange : ugyanaz, szerencsével
    ItemIDGetLoss : megkapod vagy elveszíted/elhasználod a tárgyat (amit az ID-je fog jelezni)
     */

    private int pageID;
    private String description;
    private int type;
    private int decision1_ID;
    private String decision1_Flavortext;
    private int decision2_ID;
    private String decision2_Flavortext;
    private int decision3_ID;
    private String decision3_Flavortext;
    private String staminaChange;
    private String skillChange;
    private String luckChange;
    private String ItemIDGetLoss;

    // Constructor

    public CurrentPage(int pageID, String description, int type, int decision1_ID, String decision1_Flavortext, int decision2_ID, String decision2_Flavortext, int decision3_ID, String decision3_Flavortext, String staminaChange, String skillChange, String luckChange, String itemIDGetLoss) {
        this.pageID = pageID;
        this.description = description;
        this.type = type;
        this.decision1_ID = decision1_ID;
        this.decision1_Flavortext = decision1_Flavortext;
        this.decision2_ID = decision2_ID;
        this.decision2_Flavortext = decision2_Flavortext;
        this.decision3_ID = decision3_ID;
        this.decision3_Flavortext = decision3_Flavortext;
        this.staminaChange = staminaChange;
        this.skillChange = skillChange;
        this.luckChange = luckChange;
        ItemIDGetLoss = itemIDGetLoss;
    }

    // --- Getter és Setter

    public String getItemIDGetLoss() {
        return ItemIDGetLoss;
    }

    public void setItemIDGetLoss(String itemIDGetLoss) {
        ItemIDGetLoss = itemIDGetLoss;
    }

    public String getLuckChange() {
        return luckChange;
    }

    public void setLuckChange(String luckChange) {
        this.luckChange = luckChange;
    }

    public String getSkillChange() {
        return skillChange;
    }

    public void setSkillChange(String skillChange) {
        this.skillChange = skillChange;
    }

    public String getStaminaChange() {
        return staminaChange;
    }

    public void setStaminaChange(String staminaChange) {
        this.staminaChange = staminaChange;
    }

    public String getDecision3_Flavortext() {
        return decision3_Flavortext;
    }

    public void setDecision3_Flavortext(String decision3_Flavortext) {
        this.decision3_Flavortext = decision3_Flavortext;
    }

    public int getDecision3_ID() {
        return decision3_ID;
    }

    public void setDecision3_ID(int decision3_ID) {
        this.decision3_ID = decision3_ID;
    }

    public String getDecision2_Flavortext() {
        return decision2_Flavortext;
    }

    public void setDecision2_Flavortext(String decision2_Flavortext) {
        this.decision2_Flavortext = decision2_Flavortext;
    }

    public int getDecision2_ID() {
        return decision2_ID;
    }

    public void setDecision2_ID(int decision2_ID) {
        this.decision2_ID = decision2_ID;
    }

    public String getDecision1_Flavortext() {
        return decision1_Flavortext;
    }

    public void setDecision1_Flavortext(String decision1_Flavortext) {
        this.decision1_Flavortext = decision1_Flavortext;
    }

    public int getDecision1_ID() {
        return decision1_ID;
    }

    public void setDecision1_ID(int decision1_ID) {
        this.decision1_ID = decision1_ID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPageID() {
        return pageID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }
}
