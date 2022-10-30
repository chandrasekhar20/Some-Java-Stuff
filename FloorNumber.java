public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,15};
        int element = 4;
        int ans = findingFloor(arr, element);
        System.out.println(ans);
    }
    public static int findingFloor(int[] arr, int element){
        int start = arr[0];
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(element > arr[mid]){
                start = mid +1;
            }
            else if (element < arr[mid]){
                end = mid -1;
            }
            else return mid;
        }
        return end;
    }
}
