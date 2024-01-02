import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try(FileInputStream f = new FileInputStream("D:\\Learning\\Fanap\\Java\\Code\\fan-ap\\jalase 6\\src\\a.txt")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            File myObj = new File("D:\\Learning\\Fanap\\Java\\Code\\fan-ap\\jalase 6\\src\\a.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File myObj = new File("D:\\Learning\\Fanap\\Java\\Code\\fan-ap\\jalase 6\\src\\a.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
//        ObjectOutputStream o = null;
//        try {
//            o = new ObjectOutputStream();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(o instanceof Serializable);
    }
}