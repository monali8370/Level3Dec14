////Java Program to Create a class Bank Account and the Inner Class Interest in it
////Explanation:We declare the Outer class as BankAcct and the inner class as Interest. Now we
//// use the variables declared in the outer class to get the output in the inner class.
public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void display() {
        System.out.println("Balance: " + balance);
        System.out.println("Account Holder Name: " + accountHolderName);
    }

    public class Interest {
        private double interestRate;
        private double balance;

        public Interest(double interestRate, double balance) {
            this.interestRate = interestRate;
            this.balance = balance;
        }

        public void calculateInterest() {
            double interestAmount = balance * (interestRate / 100);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Interest Amount: " + interestAmount);
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0, "monali");
        account.display();

        BankAccount.Interest interest = account.new Interest(5.0,2000);
        interest.calculateInterest();
    }
}
