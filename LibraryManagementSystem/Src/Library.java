import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayAllBooks() {
        System.out.println("\n=== ALL BOOKS ===");
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book b : books) {
            b.displayInfo();
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\n=== AVAILABLE BOOKS ===");
        boolean found = false;

        for (Book b : books) {
            if (b.isAvailable()) {
                b.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No available books.");
        }
    }

    public void searchBooks(String keyword) {
        System.out.println("\n=== SEARCH RESULTS ===");
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                b.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {

                b.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found.");
        }
    }

    public Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public Member findMember(String id) {
        for (Member m : members) {
            if (m.getMemberId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public void borrowBook(String memberId, String isbn) {
        Member m = findMember(memberId);
        Book b = findBook(isbn);

        if (m != null && b != null) {
            if (m.borrowBook(b)) {
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book not available.");
            }
        } else {
            System.out.println("Invalid member or book.");
        }
    }

    public void returnBook(String memberId, String isbn) {
        Member m = findMember(memberId);
        Book b = findBook(isbn);

        if (m != null && b != null) {
            if (m.returnBook(b)) {
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Return failed.");
            }
        } else {
            System.out.println("Invalid member or book.");
        }
    }
}