public class TestInvoice {
    public static void main(String[] args) {
        Invoice i1 = new Invoice(1,"John Doe",300);
        System.out.println(i1.getID());
        System.out.println(i1.getCustomer());
        System.out.println(i1.getAmount());
        System.out.println(i1.getCustomerName());
        System.out.println(i1.getAmountAfterDiscount());
    }
}
