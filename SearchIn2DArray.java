import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {11,21,31,42},
                {13,24,32,45},
                {17,28,37,49}
        };
        int target = 37;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length -1;

        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
