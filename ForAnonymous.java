package allClasses;

public class ForAnonymous {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void start(){
                System.out.println("Overrided method");
            }
        };
        a.start();
        A b = new A();
        b.start();
    }
}

class A{
    public void start(){
        System.out.println("A class start method");
    }
}