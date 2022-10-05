public class Book {
    String bookName;
    Author author;
    int published;



    public Book(String bookName, Author author, int published) {
        this.bookName = bookName;
        this.author = author;
        this.published = published;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }
}