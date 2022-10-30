package allClasses;

public class Abstraction extends Ab1 {

    public void m1(){
        System.out.println("Methos 1");
    }
    public void m2(){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.m1();
        ab.m2();
        ab.name = "HUHU";
        System.out.println(ab.name);
    }
    static{
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        Abstraction abs = new Abstraction();
        abs.m2();
    }
}

abstract class Ab1{
    public String name;
    public abstract void m1();
    public abstract void m2();

}

