public class Main {
    public static void main(String[] args) {
        //========================= Part 1 ===========================
        BankAccount ba1 = new BankAccount();
        ba1.setBAN("5555-5555-5555-5555");
        ba1.setEmail("a@b.c");
        ba1.setName("amir hossein");
        ba1.setPhone("09110000000");
        ba1.setValue(0);
        ba1.deposit(9000);
        ba1.withdrawal(10000);
        System.out.println(ba1.getValue());
        System.out.println("====== Part 1 ======");
        //========================= Part 2 ===========================
        System.out.println("====== Part 2 ======");
        //========================= Part 3 ===========================
        System.out.println("====== Part 3 ======");
        //========================= Part 4 ===========================
        System.out.println("====== Part 4 ======");
    }
}