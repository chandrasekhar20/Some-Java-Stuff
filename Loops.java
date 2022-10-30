package allClasses;

import java.util.Scanner;

public class Loops {
    // Q1 Print the first 10 numbers....
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        *//*for (int i = 1; i <=10;i++){
            System.out.println(i);
        }*//*
        // Q2 Print the table of a number user given....
        int j = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(j +" * "+i+" = "+j*i);
        }*/
        //fibo();
        //countNum();
        //reaverseNum();
        calC();
        //checkPrime();
        //checkArmstrong();
        //check();
        factorial();
    }

    public static void fibo(){
        int a = 1;
        int b = 1;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(a + " " + b + " ");

        while (flag < count){
            flag = a + b;
            System.out.print(flag + " ");
            a = b;
            b = flag;
        }
    }

    public static void countNum(){
        int n = 44554354;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

    public static void reaverseNum(){
        int n = 123456789;
        while (n > 0){
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }

    public static void calC(){
        Scanner sc = new Scanner(System.in);
        int res = 0;
        while (true){
            System.out.println("Enter the operation to be performed");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter the numbers");

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    res = num1 + num2;
                }
                if (op == '-'){
                    res = num1 - num2;
                }
                if (op == '*'){
                    res = num1 * num2;
                }
                if (op == '/'){
                    res = num1 / num2;
                }
            }
            else if (op == 'X' || op == 'x'){
                break;
            }
            else {
                System.out.println("Invalid operation....");
            }
            System.out.println(res);
        }
    }

    public static void checkPrime(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean checkArmstrong(int num){
        int original = num;
        int sum = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
            if (sum == original){
               // System.out.println("Its an armstrong number");
                return true;
            }
        }
        return false;
    }
    public static void check(){
        for (int i = 100; i<1000;i++){
            if (checkArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        while (num >= 1){
            fact  = fact * num;
            num--;
        }
        System.out.println(fact);
    }
}
