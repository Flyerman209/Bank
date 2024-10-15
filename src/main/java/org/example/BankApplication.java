package org.example;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount("12345678");

        int choice;
        do {
            System.out.println("\nГлавное меню:");
            System.out.println("1: Просмотреть баланс");
            System.out.println("2: Снять деньги со счета");
            System.out.println("3: Внести деньги на счет");
            System.out.println("4: Показать все транзакции");
            System.out.println("5: Выйти");

            System.out.print("Выберите пункт меню: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Просмотр баланса
                    System.out.println("Текущий баланс: " + account.getBalance() + " руб.");
                    break;
                case 2:
                    // Снятие денег со счета
                    System.out.print("Введите сумму для снятия: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount, "2024-10-15"); // Для примера используется текущая дата
                    break;
                case 3:
                    // Внесение денег на счет
                    System.out.print("Введите сумму для внесения: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount, "2024-10-15"); // Для примера используется текущая дата
                    break;
                case 4:
                    // Показать все транзакции
                    account.printTransactions();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 5);

        input.close();
    }
}
