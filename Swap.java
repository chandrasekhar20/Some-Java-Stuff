import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6,7,8,9};
       // swap(arr,4,2);
        //System.out.println(Arrays.toString(arr));
        //int a = maxValue(arr);
      // int b = maxInRange(arr,2,5);
        //System.out.println(a);
        //System.out.println(b);
       // System.out.println(arr.length);
        //reverseTheArray(arr);
        //System.out.println(Arrays.toString(arr));
        //int[] arr = {12,345,446,3,57,3993,45};
        //System.out.println(min(arr));

        int[][] arr = {{134,2,343},{443,54,64},{743,8,9}};
        int ans = searchMaxIn2DArray(arr);
        System.out.println(ans);

    }
    public static void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int maxValue(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static int maxInRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }return maxVal;
    }

    public static void reverseTheArray(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while (start < end){
                swap(arr, start,end);
                start++;
                end--;
            }
    }

    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }return min;
    }
    public static int searchMaxIn2DArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }return max;
    }
}
