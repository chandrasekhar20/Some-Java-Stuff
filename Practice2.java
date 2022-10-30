package allClasses;

public class Practice2 {
    int num = 23456;
    public double getNum(){
        System.out.println("Phone is found");
        return num;
    }

    public static void main(String[] args) {
        Practice2 p2 = new Practice2();
        System.out.println(p2.getNum());
    }
}
