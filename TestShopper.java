public class TestShopper {
    public static void main(String[] args) {
        Shopper s1 = new Shopper(1,"John Doe",30);
        System.out.println(s1);
        System.out.println(s1.getID());
        System.out.println(s1.getName());
        System.out.println(s1.getGender());
    }
}
