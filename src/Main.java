public class Author {
    public static void main(String[] args) {

        String name;
        String surname;
public Author(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public String getName (String name){

            return name;
        }
        public String getSurname (String surname){

            return surname;
        }

        public String fullName () {

            return name + " " + surname;
        }
    }

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

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");

            Author author1 = new Author("Виктор", "Пелевин");
            Book book1 = new Book("Generation П", author1, 1999);
            Author author2 = new Author("Виктор", "Пелевин");
            Book book2 = new Book("Чапаев и Пустота", author2, 1996);


            System.out.println(book1.getBookName());
            System.out.println(book1.getAuthor().fullName());
            System.out.println(book1.getPublished());

            book1.setPublished(2001);
            System.out.println(book1.getPublished());
        }
    }
}

