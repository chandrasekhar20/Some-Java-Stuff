package allClasses;

public class EncapsuPart {
    private String name;
    private String color = "Black";
    private int age = 10;

    public void setAge(int newAge){
        this.age = newAge;
    }
    public int getAge(){
        return age;
    }

    public String getColor(){ return color;}
    public void setColor(String Color){
        this.color = Color;
    }
}
