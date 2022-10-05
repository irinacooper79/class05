public class Author {
    String name;
    String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName(String name) {

        return name;
    }


    public String getSurname(String surname) {

        return surname;
    }


    public String fullName() {

        return name + " " + surname;
    }
}
