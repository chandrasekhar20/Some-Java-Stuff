package allClasses;

public class Inheritance {
    public static void main(String[] args) {
        Animal aa = new Animal();
        Dog da = new Dog();
        Pig pp = new Pig();
        aa.animalSound();
        da.animalSoumnd();
        pp.animalSound();
    }

}
class Vehicle{
    public String brand;
    public String color;
    public int price;

    public void race(int speed){
        System.out.println("The car is moving on a speed of "+speed);
    }
    public void features(){
        System.out.println("The brand is "+brand+" and the color is "+color);
    }
}

class Cars extends Vehicle{
    public static void main(String[] args) {
        Cars cc = new Cars();
        cc.brand = "Benz";
        cc.color = "Black";
        cc.race(250);
        cc.features();
    }
}

class Animal{
    public void animalSound(){
        System.out.println("allClasses.Animal sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("allClasses.Pig sound");
    }
}
class  Dog extends Animal{
    public void animalSoumnd(){
        System.out.println("allClasses.Dog sound");
    }
}