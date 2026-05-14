package hu.nje.kalandjatekmobil.domain;

public class Character {
    /*
    Name : karakter neve (talán mentésálláshoz)
    Skill : Ügyesség (harchoz ez adódik hozzá)
    Stamina : Életerő (Ha 0-hoz ér, a játék véget ér)
    Luck : Szerencse
    Gold : Arany mennyisége
    Provisions : élelmiszer mennyisége
    Potion : Milyen ital volt kiválasztva.
        1. Ügyesség
        2. Erő
        3. Szerencse
        0. Üres, meg lett ivva.
     */
    private String name;
    private int skill;
    private int stamina;
    private int luck;
    private int gold;
    private int provision;
    private int potion;

    public Character(String name, int skill, int stamina, int luck, int gold, int provision, int potion) {
        this.name = name;
        this.skill = skill;
        this.stamina = stamina;
        this.luck = luck;
        this.gold = gold;
        this.provision = provision;
        this.potion = potion;
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

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getProvision() {
        return provision;
    }

    public void setProvision(int provision) {
        this.provision = provision;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }
}
