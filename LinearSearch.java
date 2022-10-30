import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        //int[] arr = {10,20,30,40,50,60};
        //int ans = lSearch(arr,40);
        //System.out.println(ans);
        //String name = "Chandu";
        //char element = 'a';
        //System.out.println(stringSearch2(name,element));
        int[][] arr = {
                {2,3,4,43},
                {5,6,7},
                {8,9}
        };
        int[] ans = searchIn2DArray(arr,7);
        System.out.println(Arrays.toString(ans));
    }

    public static int lSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    public static boolean stringSearch(String str, char element){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (element == str.charAt(i)){
                return true;
            }
        }return false;
    }
    public static boolean stringSearch2(String str, char element){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if (element == ch){
                return true;
            }
        }return false;
    }

    public static int[] searchIn2DArray(int[][] arr, int element){
        for (int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                if (arr[row][col] == element){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
