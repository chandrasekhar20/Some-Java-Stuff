public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10,20,33,45,67,87,99};
        int[] arr2 = {96,92,87,84,76,64,54,43,32,31,21,12,7};
        int ans1 = search(arr1,99);
        int ans2 = search(arr2,92);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static int search(int[] arr, int element){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;
            if(isAsc){
                if (element > arr[mid]){
                    start = mid + 1;
                }
                else if (element < arr[mid]){
                    end = mid -1;
                }else return mid;
            }
            else {
                if (element > arr[mid]){
                    end = mid - 1;
                }
                else if(element < arr[mid]){
                    start = mid + 1;
                }else return mid;
            }
        }
        return -1;
    }
}
