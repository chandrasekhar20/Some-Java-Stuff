public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,8,12,15,24,26,34,56,67,78,79,100};
        int element = 25;
        int ans = ceilingSearch(arr,element);
        System.out.println(ans);
    }

    public static int ceilingSearch(int[] arr, int element){
        int start = arr[0];
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (element > arr[mid]){
                start = mid +1;
            }
            else if (element < arr[mid]){
                end = mid -1;
            }
            else return mid;
        }
        return start;
    }
}
