package JDBC_Work_学生图书管理系统;


public class Book {
    // 图书ID（主键）
    int id;
    // 书名
    String title;
    // 作者
    String author;
    // 出版社
    String publisher;
    // 价格
    double price;
    // 是否被借出
    boolean is_borrowed;
    // 借阅者ID（如果已借出）
    int borrower_id;
    // 构造函数

    public Book(int id, String title, String author, String publisher, double price, boolean is_borrowed, int borrower_id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.is_borrowed = is_borrowed;
        this.borrower_id = borrower_id;
    }

    // Getter方法

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIs_borrowed() {
        return is_borrowed;
    }

    public int getBorrower_id() {
        return borrower_id;
    }

    // Setter方法

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIs_borrowed(boolean is_borrowed) {
        this.is_borrowed = is_borrowed;
    }

    public void setBorrower_id(int borrower_id) {
        this.borrower_id = borrower_id;
    }

    // 重写toString方法，用于调试和打印

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", is_borrowed=" + is_borrowed +
                ", borrower_id=" + borrower_id +
                '}';
    }
}