package com.company;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("1234", 0.00, "Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("00000", 1111.11, customerName, email, phoneNumber);
    }

    public void deposit(double amt) {
        this.balance += amt;
        System.out.println("Deposited " + amt + ". New balance: " + amt);
    }

    public void withdrawal(double amt) {
        System.out.println("Withdrawing " + amt);
        if (this.balance - amt < 0) {
            System.out.println("Insufficient funds! Only " + this.balance + " available.");
        } else {
            this.balance -= amt;
            System.out.println("Withdrew " + amt + ". Remaining balance: " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //    public void setAcctNumber(String number) {
//        this.number = number;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getAcctNumber() {
//        return this.number;
//    }
//
//    public double getBalance() {
//        return this.balance;
//    }
//
//    public String getCustomerName() {
//        return this.customerName;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public String getPhoneNumber() {
//        return this.phoneNumber;
//    }
//
//    public double deposit(double amt) {
//        System.out.println("Depositing " + amt);
//        return this.balance += amt;
//    }
//
//    public double withdrawal(double amt) {
//        if (this.balance - amt > 0) {
//            System.out.println("Withdrawing " + amt);
//            return this.balance -= amt;
//        } else {
//            System.out.println("Insufficient funds!");
//            return -1;
//        }
//    }

}
