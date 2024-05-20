import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int arr[][] = new int[2][];
        arr[0] = new int[] {1,2,3};
        arr[1] = new int[] {4,5};
        System.out.println(arr[1][1]);

        int arr1[] = new int[2];
        int arr2[] = new int[] {1,2};        
        int arr3[] = {1,2};        
        int arr4[] = {1,2};     
        System.out.println(arr2==arr3);
        System.out.println(arr3.equals(arr4));
        System.out.println(Arrays.equals(arr3,arr4));

        int arrM[][][] = new int [2][][];
        arrM[0] = new int[][] {{2,3}, {4,5,6}};
        arrM[1] = new int[][] {{4,4,4,4}, {5,5,5,5,5},{6,6,6,6,6,6}};
        System.out.println(arrM[1][2][5]);

        StringBuffer sb = new StringBuffer("Java");
    }
}
