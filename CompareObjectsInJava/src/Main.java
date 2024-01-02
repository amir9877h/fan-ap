public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("ali", "1234567890");
        Customer c2 = new Customer("javad", "1234567891");
        Customer c3 = new Customer("javad", "1234567891");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
    }
}