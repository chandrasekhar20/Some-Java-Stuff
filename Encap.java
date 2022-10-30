package allClasses;

import java.util.Scanner;

public class Encap {
    public static void main(String[] args) {
        Balance ba = new Balance();
        Scanner sc = new Scanner(System.in);
        int depositeAmount = sc.nextInt();
        ba.deposit(depositeAmount);
        int currentBalance = ba.getBalance();
        System.out.println("Current bank balance is :"+ currentBalance);
    }
}

class Balance{
    private int balance = 0;

    public void deposit(int amount){
        this.balance = balance + amount;
    }
    public int getBalance(){
        return balance;
    }
}