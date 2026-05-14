package hu.nje.kalandjatekmobil.domain;

public class Enemy {
    /*
    PageID - Melyik oldalon fordul elő
    Order - Milyen sorrendben jönnek
    Name - Lény neve
    Skill - Lény ügyessége
    Stamina - Lény életereje
    EscapePossible - El lehet szökni? 1 ha igen
    EscapeWhere - Hova lehet elszökni
     */
    private int pageID;
    private int order;
    private String name;
    private int skill;
    private int stamina;
    private int escapePossible;
    private int escapeWhere;

    //Constructor

    public Enemy(int pageID, int order, String name, int skill, int stamina, int escapePossible, int escapeWhere) {
        this.pageID = pageID;
        this.order = order;
        this.name = name;
        this.skill = skill;
        this.stamina = stamina;
        this.escapePossible = escapePossible;
        this.escapeWhere = escapeWhere;
    }

    // Getter és Setter

    public int getPageID() {
        return pageID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getEscapePossible() {
        return escapePossible;
    }

    public void setEscapePossible(int escapePossible) {
        this.escapePossible = escapePossible;
    }

    public int getEscapeWhere() {
        return escapeWhere;
    }

    public void setEscapeWhere(int escapeWhere) {
        this.escapeWhere = escapeWhere;
    }
}
