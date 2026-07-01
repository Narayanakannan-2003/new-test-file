import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class find__dipress_missing_numbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(find_De(arr));

    }

    public static List<Integer> find_De(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i))

            {
                res.add(i);
            }
        }
        return res;

    }
}


