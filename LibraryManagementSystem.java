import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, name, author));
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    boolean foundIssue = false;

                    for (Book b : books) {
                        if (b.id == issueId) {
                            if (!b.issued) {
                                b.issued = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book already issued.");
                            }
                            foundIssue = true;
                        }
                    }

                    if (!foundIssue) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    boolean foundReturn = false;

                    for (Book b : books) {
                        if (b.id == returnId) {
                            if (b.issued) {
                                b.issued = false;
                                System.out.println("Book Returned Successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            foundReturn = true;
                        }
                    }

                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}