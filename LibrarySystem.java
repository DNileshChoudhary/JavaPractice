import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private LocalDate dueDate;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}

class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }
}

class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Book management
    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Member management
    public void addMember(Member member) {
        members.add(member);
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Checkout system
    public boolean checkoutBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null && book.isAvailable()) {
            book.setAvailable(false);
            book.setDueDate(LocalDate.now().plus(14, ChronoUnit.DAYS));
            member.getBorrowedBooks().add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null && !book.isAvailable()) {
            book.setAvailable(true);
            book.setDueDate(null);
            member.getBorrowedBooks().remove(book);
            return true;
        }
        return false;
    }

    // Display methods
    public void displayAllBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", ISBN: " + book.getIsbn() +
                    ", Available: " + (book.isAvailable() ? "Yes" : "No") +
                    (book.getDueDate() != null ? ", Due Date: " + book.getDueDate() : ""));
        }
    }

    public void displayAllMembers() {
        System.out.println("\nLibrary Members:");
        for (Member member : members) {
            System.out.println("Name: " + member.getName() +
                    ", ID: " + member.getMemberId() +
                    ", Books Borrowed: " + member.getBorrowedBooks().size());
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Checkout Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    library.addMember(new Member(name, memberId));
                    break;

                case 3:
                    System.out.print("Enter ISBN of book to checkout: ");
                    String checkoutIsbn = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String checkoutMemberId = scanner.nextLine();
                    if (library.checkoutBook(checkoutIsbn, checkoutMemberId)) {
                        System.out.println("Book checked out successfully!");
                    } else {
                        System.out.println("Checkout failed. Please check availability and member ID.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ISBN of book to return: ");
                    String returnIsbn = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String returnMemberId = scanner.nextLine();
                    if (library.returnBook(returnIsbn, returnMemberId)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Return failed. Please check details and try again.");
                    }
                    break;

                case 5:
                    library.displayAllBooks();
                    break;

                case 6:
                    library.displayAllMembers();
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}