package allClasses;
/*
import java.util.Locale;

public class allClasses.HelloWorld {
   */
/* public static String name = "Chandu";
    public static int Mynum = 10;
    public static float f1 = 35e2f;
    public static double d1 = 12e3d;
    public static char al = 'D', myVar1 = 65, myVar2 = 66, myVar3 = 67;
    public static int a = 3, b = 5, c = a + b;*//*

    */
/*public static void main(String[] args){

//        double td1 = 3.50d;
//        int ti1 = (int) td1;    // Manually type casting....
//        String lastname = " Rock";
//        int randomNum = (int)(Math.random() * 100);
//
//        System.out.println("Hello World");
//        System.out.println(name);
//        System.out.println(Mynum+10);
//        System.out.println(c);
//        System.out.println(f1);
//        System.out.println(d1);
//        System.out.println(myVar1 +" "+ myVar2 +" "+ myVar3 +" "+al);
//        System.out.println(ti1);
//        System.out.println(name.length() +" "+ name.indexOf('a'));
//        System.out.println(name.toUpperCase() + " " + name.toLowerCase());
//        System.out.println(name.concat(lastname));
//        System.out.println(Math.max(100,20));
//        System.out.println(Math.random());
//        System.out.println(randomNum);

       /* int x = 100;
        int y = 20;
        if (x > y)
        {
            System.out.println("x is greater than y");
        }else {
            System.out.println("y is greater than x");
        }
        int time = 20;
        String result = (time >12)?"Good afternoon":"Good morning";  // Ternary operator....
        System.out.println(result);

        int day = 7;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day on this number");
        }*//*


        //int i = 0;
        */
/*while (i < 5){
            System.out.println(i);
            i++;
        }*//*

       */
/* do {
            System.out.println(i);
            i++;
        }while (i < 2);*//*


        */
/*for (int i = 1;i <= 10;i++){
            System.out.print(i+" ");
            }*//*

        String[] alph = {"a","b","c","d","e","f"};
       */
/* for (String i : alph){
            System.out.println(i);
        }*//*


        */
/*int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums[2]+nums[3]);
        System.out.println("The length of the array is : "+nums.length);
        for (int i:nums){
            System.out.print(i+" ");
        }System.out.println("");
        for (int j = 0; j < nums.length;j++){
            System.out.print(nums[j]+" ");
        }*//*


        */
/*int[][] nums = { {1,2,3,4}, {5,6,7,8} };
        int x = nums[1][0];
        System.out.println(x);
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j<nums[i].length; j++){
                System.out.print(nums[i][j]);
            }
        }*//*




    //}

    public static void main(String[] args){
       */
/* myMethod();
        myMethod2(4);
        int res = sumMehod(4,8);
        System.out.println(res);
        ageVerification(18);*//*

        System.out.println(plusMethod(2.33339,45.93491));
        System.out.println(plusMethod(3,5));
        System.out.println(sumWithRecursion(4));
    }

   */
/* public static void myMethod(){
        System.out.println("Its a method");
    }
    public static void myMethod2(int a){
        System.out.println("Ohh this method has a parameter that is : "+ a);
    }
    public static int sumMehod(int b, int c){
        int d = b + c;
        return d;
    }
    public static void ageVerification(int age){
        if (age >= 18){
            System.out.println("Access granted");
        }else {
            System.out.println("Access denied");
        }
    }*//*

    public static int plusMethod(int a,int b){
        return a+b;
    }
    public static double plusMethod(double x, double y){
        return x + y;
    }
    public static int sumWithRecursion(int a){
        if (a > 0){
            return a + sumWithRecursion(a - 1);
        }else {
            return 0;
        }
    }
}*/


import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //System.out.println(name);
        /*int num = sc.nextInt();
        System.out.println(num);
        String name = sc.next();
        System.out.println(name);
        double dd = sc.nextDouble();
        System.out.println(dd);*/
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);*/
//        int a = 258;
//        byte b = (byte) a;
//        System.out.println(b);
        //char c = sc.next().trim().charAt(1);
        //System.out.println(c);
        swap(10,20);
    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
