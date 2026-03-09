class Book {
    int id;
    String name;
    String author;
    boolean issued;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.issued = false;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Author: " + author + " | Issued: " + issued);
    }
}