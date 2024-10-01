public class Shopper {
    private int ID;
    private String name;
    private char gender = 'm';
    private int discount;

    public Shopper(int ID, String name, int discount)
    {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }
    public int getID()
    {
        return this.ID;
    }
    public String getName()
    {
        return this.name;
    }
    public char getGender()
    {
        return this.gender;
    }
    public String toString()
    {
        return ("name(" + this.ID + ")");
    }
}
