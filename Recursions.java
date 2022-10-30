package allClasses;

public class Recursions {
    public static int n = 1;
    public static void main(String[] args) {
        numbers();
    }
    public static void numbers(){
        if (n <= 10){
            System.out.println("10 * "+ n +" = "+ 10*n);
            System.out.println("Karthik");
            n++;
            numbers();
        }
    }
}
