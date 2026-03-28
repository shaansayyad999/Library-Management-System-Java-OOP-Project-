import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. View All Books");
            System.out.println("4. View Available Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    lib.addBook(new Book(isbn, title, author, genre));
                    System.out.println("Added successfully!");
                    break;

                case 2:
                    System.out.print("Member ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();

                    lib.addMember(new Member(id, name, contact));
                    System.out.println("Member added!");
                    break;

                case 3:
                    lib.displayAllBooks();
                    break;

                case 4:
                    lib.displayAvailableBooks();
                    break;

                case 5:
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    lib.searchBooks(keyword);
                    break;

                case 6:
                    System.out.print("Member ID: ");
                    String mId = sc.nextLine();
                    System.out.print("ISBN: ");
                    String bId = sc.nextLine();
                    lib.borrowBook(mId, bId);
                    break;

                case 7:
                    System.out.print("Member ID: ");
                    String rmId = sc.nextLine();
                    System.out.print("ISBN: ");
                    String rbId = sc.nextLine();
                    lib.returnBook(rmId, rbId);
                    break;

                case 8:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}