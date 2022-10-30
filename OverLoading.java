package allClasses;

public class OverLoading {
    int a = 10;
    int b = 20;
    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        ol.add();
        ol.add(20,30);
        ol.add(30,40,10);
    }
    public void add(){
        int c = a + b;
        System.out.println(c);
    }
    public void add(int a2, int b2){
        System.out.println(a2 + b2);
    }
    public void add(int a3, int b3, int c3){
        System.out.println(a3 + b3 + c3);
    }

}
