package allClasses;

class Encapsulation{
    public static void main(String[] args) {
        EncapsuPart ep = new EncapsuPart();

        ep.setAge(21);
        System.out.println(ep.getAge());
        ep.setColor("Red");
        System.out.println(ep.getColor());
    }
}