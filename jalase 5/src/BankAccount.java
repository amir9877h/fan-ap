public class BankAccount {
    private String BAN;
    private long value;
    private String name;
    private String email;
    private String phone;

    public String getBAN() {
        return BAN;
    }

    public void setBAN(String BAN) {
        this.BAN = BAN;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(long val){
        this.value += val;
    }
    public void withdrawal(long value){
        if(this.value - value >= 0)
            this.value -= value;
    }
}
