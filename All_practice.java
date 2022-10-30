package allClasses;

import javax.sound.midi.Soundbank;

class All_practice{
    //public static int a = 10;
    public static void main(String[] args) {
        int a = 10;
        numIncrement(a);
        System.out.println(a);
        AnotherOne ao = new AnotherOne();
        System.out.println(ao.ab);
    }

    public static void numIncrement(int num){
        num = num + 1;

    }
}
class AnotherOne{
    public static int ab =20;
    public AnotherOne(){
        method2();
        method1(ab);
    }
    public static void method1(int aa){
        ab = ab+ 10;
    }
    public static void method2(){
        System.out.println("Method 2 is called");
    }
}