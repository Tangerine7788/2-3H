package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount account = new BankAccount();
        account.deposit(20000);

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                try {
                    account.withDraw(account.getAmoun());
                    System.out.println("У вас нет средств!");
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            }
        }
    }
}
