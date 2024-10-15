package org.example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Метод для внесения денег на счет
    public void deposit(double amount, String date) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Пополнение", amount, date));
            System.out.println("Успешное пополнение на сумму: " + amount);
        } else {
            System.out.println("Неверная сумма для пополнения.");
        }
    }

    // Метод для снятия денег со счета
    public void withdraw(double amount, String date) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Снятие", amount, date));
            System.out.println("Успешное снятие на сумму: " + amount);
        } else {
            System.out.println("Неверная сумма или недостаточно средств.");
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для вывода всех транзакций
    public void printTransactions() {
        System.out.println("Транзакции для счета: " + accountNumber);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

