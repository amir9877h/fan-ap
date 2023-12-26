public class Book {
    public static int saleCount;
    static {
        saleCount = 0;
        System.out.println("sale count => " + saleCount);
    }
    public Book(){
        this.title = "";
        this.author = "";
        this.releaseDate = 0;
        this.press = -1;
        increaseSaleCount();
    }
    public Book(String title, String author, int releaseDate, int press){
        increaseSaleCount();
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.press = press;
    }
    public String title;
    public String author;
    public int releaseDate;
    public int press;
    public void displayInfo(){
        System.out.println("title => " + title);
        System.out.println("author => " + author);
        System.out.println("release date => " + releaseDate);
        System.out.println("press => " + press);
    }
    public void check(String title){
        if(this.title == title)
            System.out.println("کتاب موردنظر یافت شد");
        else
            System.out.println("کتاب موردنظر یافت نشد");
    }
    public void increaseSaleCount(){
        saleCount++;
    }
}
