public class Main {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        //=========== 1 =========================
        Book bookObj = new Book();
        bookObj.title = "abc";
        bookObj.releaseDate = 1402;
        bookObj.author = "amir hossein";
        bookObj.press = 4;
        bookObj.displayInfo();
        System.out.println("=========== 1 =========================");
        //=========== 2 =========================
        Book b2 = new Book();
        Book b3 = new Book("my title", "author name", 2024, 999);
        b2.displayInfo();
        b3.displayInfo();
        System.out.println("=========== 2 =========================");
        //=========== 3 =========================
        b3.check("my title");
        System.out.println("=========== 3 =========================");
        //=========== 4 =========================
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println("=========== 4 =========================");
        //=========== 5 =========================
        Book b4 = new Book();
        Book b5 = new Book();
        System.out.println(Book.saleCount);
        System.out.println(b5.saleCount);
        System.out.println("=========== 5 =========================");
        //=========== 6 =========================
        Book paperBook = new Book("paper book", "auth", 1402, 50);
        AudioBook digital = new AudioBook();
        paperBook.displayInfo();
        digital.displayInfo();
        System.out.println("=========== 6 =========================");
    }
}