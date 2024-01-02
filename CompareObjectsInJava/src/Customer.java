public class Customer {
    private String name;
    private String nationalCode;
    Customer(String name, String nationalCode){
        this.name = name;
        this.nationalCode = nationalCode;
    }
    public String getName() {
        return name;
    }

    public String getNationalCode() {
        return nationalCode;
    }
    @Override
    public String toString() {
        return String.format("%s%s", this.getName(), this.getNationalCode());
    }

    @Override
    public boolean equals(Object other) {
        if ((other == null) || (this.getClass() != other.getClass()))
            return false;
        return this.hashCode() == other.hashCode();
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
