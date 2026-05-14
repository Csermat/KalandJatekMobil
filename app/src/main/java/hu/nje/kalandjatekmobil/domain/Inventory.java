package hu.nje.kalandjatekmobil.domain;

public class Inventory {
    /*
    ID : Melyik oldalon fordul elő
    Name : Tárgy neve
    HaveIt : 0 ha nincs meg, 1 ha meglett szerezve.
    Ha 1, akkor megjelenik a karakterlapon.
     */

    private int ID;
    private String Name;
    private int HaveIt;

    public Inventory(int ID, String name, int haveIt) {
        this.ID = ID;
        Name = name;
        HaveIt = haveIt;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHaveIt() {
        return HaveIt;
    }

    public void setHaveIt(int haveIt) {
        HaveIt = haveIt;
    }
}
