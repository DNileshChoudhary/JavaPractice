import java.util.ArrayList;
import java.util.List;

// Loan class to handle loan details
class Loan {
    private double amount;
    private double interestRate;
    private int term;  // in years
    private String borrower;
    private String status; // Pending, Approved, Disbursed
    private double monthlyPayment;
    private double balance;

    // Constructor
    public Loan(double amount, double interestRate, int term, String borrower) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
        this.borrower = borrower;
        this.status = "Pending";
        this.balance = amount;
        this.monthlyPayment = calculateMonthlyPayment();
    }

    // Calculate the monthly payment
    public double calculateMonthlyPayment() {
        double rate = interestRate / 100 / 12;
        int termMonths = term * 12;
        return (amount * rate) / (1 - Math.pow(1 + rate, -termMonths));
    }

    // Approve the loan
    public void approveLoan() {
        this.status = "Approved";
    }

    // Disburse the loan
    public void disburseLoan() {
        this.status = "Disbursed";
    }

    // Generate loan report
    public String generateReport() {
        return "Loan Report for " + borrower + ": Amount: $" + amount + ", Balance: $" + balance + ", Status: " + status;
    }

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public String getBorrower() {
        return borrower;
    }

    public void makePayment(double paymentAmount) {
        this.balance -= paymentAmount;
    }
}

// Loan Management System class to manage the loans
class LoanManagementSystem {
    private List<Loan> loans;

    // Constructor
    public LoanManagementSystem() {
        loans = new ArrayList<>();
    }

    // Method to create a new loan
    public Loan createLoan(double amount, double interestRate, int term, String borrower) {
        Loan loan = new Loan(amount, interestRate, term, borrower);
        loans.add(loan);
        return loan;
    }

    // Method to get all loans
    public List<Loan> getAllLoans() {
        return loans;
    }

    // Method to approve a loan
    public void approveLoan(Loan loan) {
        loan.approveLoan();
        System.out.println("Loan for " + loan.getBorrower() + " is approved.");
    }

    // Method to disburse a loan
    public void disburseLoan(Loan loan) {
        loan.disburseLoan();
        System.out.println("Loan for " + loan.getBorrower() + " is disbursed.");
    }

    // Method to make a repayment
    public void makeRepayment(Loan loan, double amount) {
        loan.makePayment(amount);
        System.out.println("Payment of $" + amount + " made by " + loan.getBorrower());
    }

    // Method to generate a loan report
    public void generateReports() {
        for (Loan loan : loans) {
            System.out.println(loan.generateReport());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Loan Management System instance
        LoanManagementSystem loanSystem = new LoanManagementSystem();

        // Creating loans
        Loan loan1 = loanSystem.createLoan(10000, 5, 5, "John Doe");
        Loan loan2 = loanSystem.createLoan(15000, 6, 3, "Jane Smith");

        // Approve loans
        loanSystem.approveLoan(loan1);
        loanSystem.approveLoan(loan2);

        // Disburse loans
        loanSystem.disburseLoan(loan1);
        loanSystem.disburseLoan(loan2);

        // Make some payments
        loanSystem.makeRepayment(loan1, 2000);
        loanSystem.makeRepayment(loan2, 3000);

        // Generate reports
        loanSystem.generateReports();
    }
}
