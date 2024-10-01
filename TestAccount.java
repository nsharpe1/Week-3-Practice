import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1, "John Doe", 500, 200);

        Currency currency = Currency.getInstance(Locale.CANADA);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);

        System.out.println(a1.getID());
        System.out.println(a1.getCustomer());
        System.out.println(currencyFormatter.format(a1.getBalance()));
        System.out.println(currencyFormatter.format(a1.getAmount()));
        System.out.println(a1);
        System.out.println(a1.getCustomerName());
        System.out.println(currencyFormatter.format(a1.deposit(0)));
    }
}
