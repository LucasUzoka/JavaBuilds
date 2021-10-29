package com.company;

abstract class Bank{
   int amount;
    abstract void getBalance();
}

class BankA extends Bank{

    private int balance = 0;
    public Boolean deposit(int amount){
        balance += amount;
        System.out.println("$" + amount +" Successfully Deposited...");
        return true;
    }

    @Override
    void getBalance() {

        System.out.println("Your BANK A Balance is: $" + balance);

    }

}

class BankB extends Bank{
    private int balance = 0;
    public Boolean deposit(int amount){
        balance += amount;
        System.out.println("$" + amount +" Successfully Deposited...");
        return true;
    }

    @Override
    void getBalance(){
        System.out.println("Your BANK B Balance is: $" + balance);
    }
}

class BankC extends Bank{
    private int balance = 0;
    public Boolean deposit(int amount){
        balance += amount;
        System.out.println("$" + amount +" Successfully Deposited...");
        return true;
    }

    @Override
    void getBalance(){
        System.out.println("Your BANK C Balance is: $" + balance);
    }
}
class BankGetBalance {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        bankA.deposit(100);
        bankA.getBalance();

        BankB bankB = new BankB();
        bankB.deposit(150);
        bankB.getBalance();

        BankC bankC = new BankC();
        bankC.deposit(200);
        bankC.getBalance();






    }
}
