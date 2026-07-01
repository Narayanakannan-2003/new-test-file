import java.util.HashSet;

public class prime {
    public static void main(String[] args) {
        int num[] = {1,1,2,2,3,3};
        HashSet<Integer> set = new HashSet<>();
        for (int nu : num) {
            set.add(nu);
        }
        int find = Math.min(set.size(), num.length / 2);
        System.out.println(find);
    }
}

