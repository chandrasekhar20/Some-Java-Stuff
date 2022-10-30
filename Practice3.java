package allClasses;

public class Practice3 {
    String name = "Iron man";

    public void sound(){
        System.out.println("Ohhhh");
    }

    public static void main(String[] args) {

        int a = 10;
        double d = a;  //Implicit casting....
        float f = 3.4f;
        int b = (int) f;  //Explicit casting....
        System.out.println(d + " "+ b);

        Practice3 p3 = new Hulk();  //UpCasting....
        p3.sound();
        Hulk h = (Hulk) p3;  //DownCasting....
        h.color();
    }
}

class Hulk extends Practice3{
    @Override
    public void sound(){
        System.out.println("Awwww");
    }
    public void color(){
        System.out.println("Color is green");
    }
}