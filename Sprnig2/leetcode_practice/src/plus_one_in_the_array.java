import java.util.Arrays;

public class plus_one_in_the_array {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.print(Arrays.toString(plusone(arr)));

    }

    public static int[] plusone(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } else {
                arr[i] = 0;
            }
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
}


