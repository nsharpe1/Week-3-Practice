public class Invoice {
    private int ID;
    private String customer;
    private double amount;

    public Invoice(int ID, String customer, double amount)
    {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }
    public int getID()
    {
        return this.ID;
    }
    public String getCustomer()
    {
        return this.customer;
    }
    public void setCustomer(String customer)
    {
        this.customer = customer;
    }
    public double getAmount()
    {
        return this.amount;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public String getCustomerName()
    {
        return this.customer;
    }
    public double getAmountAfterDiscount ()
    {
        double ratediscount = (24/this.amount) * 100;
        double sellprice = (100-ratediscount) / 100;
        double listprice = (sellprice*100) / (100-ratediscount);
        return listprice;
    }
}
