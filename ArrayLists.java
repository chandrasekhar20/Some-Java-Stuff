import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);
//        list.set(3,99);
//        System.out.println(list);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i< 3; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i< 3; i++){
            for (int j = 0; j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
