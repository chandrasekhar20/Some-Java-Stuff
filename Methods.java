package allClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        //fun(1,2,3,4,5,6,7,8,9,10);
        //multiple(2,3,"a","b");
        int a = 200;
        int b = 300;
        first(a);
        first("Chandu");
    }
    public static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    public static void multiple(int a, int b, String ...s){
        System.out.println(a + " "+ b +" "+ Arrays.toString(s));
    }
    public static void first(int a){
        a = 15;
        System.out.println(a);
    }
    public static void first(String a){
        System.out.println(a);
    }
}
