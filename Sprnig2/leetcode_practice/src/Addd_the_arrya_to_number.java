import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Addd_the_arrya_to_number {
    public static void main(String[] args) {


        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int target = 1;
        System.out.println(find_Add(num,target));
    }

    public static List<Integer> find_Add(int[] num, int target) {
        LinkedList<Integer> res = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int result=0;
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i]);
        }
         result = Integer.parseInt(String.valueOf(sb));
        int add=result+target;
        while (add!=0){
            int dig=add%10;

            res.add(dig);
            add=add/10;
        }
        return res.reversed();
    }
}



