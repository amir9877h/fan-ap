public class Main {
    public static void main(String[] args) {
        String fullName = "AmirHossein Jahankheir Amlashi";
        Byte age = 25;
        String data = String.format("Full Name: %s, Age: %d", fullName, age);
        System.out.println(data);
        System.out.println(data.toUpperCase());
        System.out.println(fullName.replace("", "fanap").substring(0, 5).toLowerCase());
    }
}