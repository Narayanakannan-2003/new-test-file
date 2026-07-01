import java.util.Arrays;
import java.util.LinkedList;

public class arry_exam {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(incendiary(arr)));
    }

    public static int[] incendiary(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }
        for (int num : arr) {
            list.add(num);
        }
        int[] dup = new int[list.size()];
        int k = 0;
        for (int num : list) {
            dup[k++] = num;
        }
        return dup;

    }
}

