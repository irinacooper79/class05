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