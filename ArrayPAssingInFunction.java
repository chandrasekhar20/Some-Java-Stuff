package allClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPAssingInFunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(nums));
        change(nums);                     //Arrays are mutable we can change the value....
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr){
        arr[0] = 84;
        arr[3] = 33;
    }
}
