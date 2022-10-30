public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,11,23,44,55,67,77,89,99,100,120};
        int target = 44;
        System.out.println(search(arr,target));

    }

    public static int search(int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (element < arr[mid]){
                end = mid-1;
            }
            else if (element > arr[mid]){
                start = mid + 1;
            }
            else return mid;
        }
        return -1;
    }
}
