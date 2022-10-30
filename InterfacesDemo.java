package allClasses;

interface Animals3{
    public void swim();
    public void play();
}
class dsgs implements Animals3{
    public void swim(){
        System.out.println("Another one");
    }
    public void play(){
        System.out.println("Another two");
    }
}

public class InterfacesDemo {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2();
        Cat2 c2 = new Cat2();
        dsgs ds = new dsgs();

        d2.swim();
        c2.swim();
        d2.play();
        c2.play();
        ds.play();
        ds.swim();

    }
}

abstract class Animals4 implements Animals3{}

class Dog2 extends Animals4{
    public void swim(){
        System.out.println("Dog is swimming");
    }
    public void play(){
        System.out.println("Dog is playing");
    }
}

class Cat2 extends Animals4{
    public void swim(){
        System.out.println("Cat is swimming");
    }
    public void play(){
        System.out.println("Cat is playing");
    }
}