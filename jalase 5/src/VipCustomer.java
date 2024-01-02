public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer() {
        this("name", 0, "unknown@gmail.com");
    }

    public VipCustomer(String name, long creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
