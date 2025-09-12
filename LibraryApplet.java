import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

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

    public void addBook(Book book) { books.add(book); }
    public void addMember(Member member) { members.add(member); }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

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
}

public class LibraryApplet extends Applet implements ActionListener {
    private TextField titleField, authorField, isbnField, memberNameField, memberIdField;
    private TextArea outputArea;
    private Button addBookButton, addMemberButton, checkoutButton, returnButton;
    private Library library;

    public void init() {
        library = new Library();

        // Set up input fields
        setLayout(new GridLayout(10, 2));
        add(new Label("Book Title:"));
        titleField = new TextField(20);
        add(titleField);

        add(new Label("Author:"));
        authorField = new TextField(20);
        add(authorField);

        add(new Label("ISBN:"));
        isbnField = new TextField(20);
        add(isbnField);

        add(new Label("Member Name:"));
        memberNameField = new TextField(20);
        add(memberNameField);

        add(new Label("Member ID:"));
        memberIdField = new TextField(20);
        add(memberIdField);

        // Set up buttons
        addBookButton = new Button("Add Book");
        addBookButton.addActionListener(this);
        add(addBookButton);

        addMemberButton = new Button("Add Member");
        addMemberButton.addActionListener(this);
        add(addMemberButton);

        checkoutButton = new Button("Checkout Book");
        checkoutButton.addActionListener(this);
        add(checkoutButton);

        returnButton = new Button("Return Book");
        returnButton.addActionListener(this);
        add(returnButton);

        // Set up output area
        outputArea = new TextArea(10, 40);
        outputArea.setEditable(false);
        add(outputArea);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBookButton) {
            String title = titleField.getText();
            String author = authorField.getText();
            String isbn = isbnField.getText();
            library.addBook(new Book(title, author, isbn));
            outputArea.append("Book added: " + title + " by " + author + "\n");
        } else if (e.getSource() == addMemberButton) {
            String name = memberNameField.getText();
            String memberId = memberIdField.getText();
            library.addMember(new Member(name, memberId));
            outputArea.append("Member added: " + name + " (ID: " + memberId + ")\n");
        } else if (e.getSource() == checkoutButton) {
            String isbn = isbnField.getText();
            String memberId = memberIdField.getText();
            if (library.checkoutBook(isbn, memberId)) {
                outputArea.append("Book checked out successfully!\n");
            } else {
                outputArea.append("Checkout failed. Please check availability and member ID.\n");
            }
        } else if (e.getSource() == returnButton) {
            String isbn = isbnField.getText();
            String memberId = memberIdField.getText();
            if (library.returnBook(isbn, memberId)) {
                outputArea.append("Book returned successfully!\n");
            } else {
                outputArea.append("Return failed. Please check details and try again.\n");
            }
        }
    }
}