import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Account {
    Currency currency = Currency.getInstance(Locale.CANADA);
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);

    private int id;
    private String customer;
    private double balance = 0.0;
    private double amount;

    public Account(int id, String customer, double balance, double amount)
    {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
        this.amount = amount;
    }
    public Account(int id, String customer)
    {
        this.id = id;
        this.customer = customer;
    }
    public int getID()
    {
        return this.id;
    }
    public String getCustomer()
    {
        return this.customer;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getAmount()
    {
        return this.amount;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public String toString()
    {
        return ("name(" + this.id + ") balance=" + currencyFormatter.format(this.balance));
    }
    public String getCustomerName()
    {
        return this.customer;
    }
    public double deposit(double amount)
    {
        double total = this.balance + this.amount;
        return total;
    }
    // public double withdraw(double amount)
    // {
        // if (balance >= amount) 
        // {
            // double re = this.balance - this.amount;
            // return re;
        // }
        // else 
        // {
            // return ("amount withdrawn exceeds the current balance!")
        // }
    // }
}
