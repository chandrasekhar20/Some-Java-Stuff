package allClasses;

public class Main {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cats c = new Cats();
        d.legs = 4;
        c.legs = 4;
        d.color = "White";
        c.color ="Black";
        d.setName("Parker");
        c.setName("Kitty");
        d.walk();
        c.walk();
        d.color();
        c.color();
    }
}
class Animals{
    public Animals(){
        System.out.println("Oww this animal is cute");
    }
    private String name;
    public String color;
    int legs;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Dogs extends Animals {
    public void walk(){
        System.out.println("A dog can walk with "+legs+" legs");
    }
    public void color(){
        System.out.println("The name of dog is "+getName()+" and the color is "+color);
    }
}
class Cats extends Animals {
    public void walk(){
        System.out.println("A cat has "+legs+" legs");
    }
    public void color(){
        System.out.println("The name of the cat is "+getName()+" And the color is "+color);
    }
}
