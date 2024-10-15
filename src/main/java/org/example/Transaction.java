package org.example;

public class Transaction {
    private String type;
    private double amount;
    private String date;

    public Transaction(String type, double amount, String date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Транзакция{" +
                "Тип='" + type + '\'' +
                ", Сумма=" + amount +
                ", Дата='" + date + '\'' +
                '}';
    }
}

