import java.util.Scanner;

// Book class
class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " (ISBN: " + isbn + ")");
    }
}

// Member class
class Member {
    String name;
    String membershipId;

    public Member(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public void displayInfo() {
        System.out.println("Member: " + name + " (ID: " + membershipId + ")");
    }
}

// Loan class
class Loan {
    Book book;
    Member member;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public void issueBook() {
        System.out.println(member.name + " has borrowed the book: " + book.title);
    }

    public void returnBook() {
        System.out.println(member.name + " has returned the book: " + book.title);
    }
}

// Main class (Dynamic Input)
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Book details
        System.out.println("Enter book details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        Book book = new Book(title, author, isbn);

        // Input for Member details
        System.out.println("\nEnter member details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Membership ID: ");
        String membershipId = scanner.nextLine();
        Member member = new Member(name, membershipId);

        // Create Loan instance
        Loan loan = new Loan(book, member);

        // Issue and return book
        System.out.println("\nBook Loan Actions:");
        loan.issueBook();
        loan.returnBook();

        scanner.close();
    }
}
