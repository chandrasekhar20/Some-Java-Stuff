package allClasses;

import java.util.Scanner;

public class EncapsuPart2SoloLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Student st = new Student();
        st.setName(name);
        st.setAge(age);
        System.out.println("My name is :" + st.getName());
        System.out.println("And my age is :" + st.getAge());
    }
}

class Student{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public void setAge(int age1){
        this.age = age1;
    }
}
