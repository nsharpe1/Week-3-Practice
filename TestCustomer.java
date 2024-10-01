
public class TestCustomer {
    public static void main(String[] args){
        Customer C1 = new Customer(1,"Nicholas",24);
        System.out.println(C1.getID());
        System.out.println(C1.getName());
        System.out.println(C1.getDiscount() + "%");
        System.out.println(C1);
    }
}