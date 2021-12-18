package com.company;

public class BankAccount {
    private double amoun;

    public double getAmoun() {
        return amoun;
    }
    void deposit(double sum){
        System.out.println(amoun += sum);
    }

    void withDraw(double sum) throws LimitException {
        if (sum > amoun) {
            throw new LimitException("У вас не достаточно средств!", getAmoun());
        }
        System.out.println(amoun = amoun - sum);
    }
}
