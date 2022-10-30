package allClasses;

public class OOPS {
    private String name;
    public void myMethod(){
        System.out.println("Method 1 with public");
    }
    public String getName(){
        return name;
    }
    public void setName(String myName){
        this.name = myName;
    }
    int a = 10;
    public static void main(String[] args){
        OOPS myObj = new OOPS();
        System.out.println(myObj.a);
        myObj.myMethod();
    }
    public void fullThrottle(){
        System.out.println("The car is on full throttle");
    }
    public void speed(int speed){
        System.out.println("The car is going on a speed of : "+ speed);
    }
}
class Second {
    int myAge;
    String myName;
    public Second(int age, String name){
        myAge = age;
        myName = name;
    }
    public static void main(String[] args) {
        OOPS myObj2 = new OOPS();
        System.out.println(myObj2.a + 10);
        myObj2.myMethod();
        Second myObj4 = new Second(20, "Chandu");
        System.out.println("My name is "+myObj4.myName+" and my age is "+myObj4.myAge);
        myObj2.setName("Thor");
        System.out.println(myObj2.getName());
    }
}
class Car{
    public static void main(String[] args) {
        OOPS myObj3 = new OOPS();
        myObj3.fullThrottle();
        myObj3.speed(200);
        myObj3.setName("Hulk");
        System.out.println(myObj3.getName());
    }
}
