package allClasses;

import java.util.Locale;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //HelloWorld.swap(10, 20);
        Scanner sc = new Scanner(System.in);
        /*int salary = sc.nextInt();
        if(salary > 20000 && salary <30000){
            salary = salary + 2000;
            System.out.println("Total salary with bonus is : " + salary);
        } else if (salary >= 30000) {
            salary = salary + 5000;
            System.out.println("Total salary with bonus is : " + salary);

        } else {
            salary = salary + 1000;
            System.out.println("Total salary with bonus is : " + salary);
        }*/

        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();

        //checkMaxNum(a, b, c);
        char c = sc.next().trim().charAt(0);
        checkLetter(c);
    }
    public static void checkMaxNum(int a , int b, int c){
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();*/

        if (a > b && a > c){
            System.out.println(a + " is the lagest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest number");
        } else if (c > a && c > b) {
            System.out.println(c + " is largest number");
        }else {
            System.out.println("Invalid number");
        }
    }

    public static void checkLetter(char c){

        if(c >= 'a' && c <= 'z'){
            System.out.println("Lower case");
        }else {
            System.out.println("Upper case");
        }

    }
}
