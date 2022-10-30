package allClasses;

public class OverRiding {
    public static void main(String[] args) {
        OverRiding or = new Another();
        OverRiding or2 = new OverRiding();
        or2.speak();
        or.speak();
    }
    public void speak(){
        System.out.println("Hii my name is chandu");
    }
}

class Another extends OverRiding{

    @Override
    public void speak(){
        System.out.println("Hii my name is bala");
    }
}
