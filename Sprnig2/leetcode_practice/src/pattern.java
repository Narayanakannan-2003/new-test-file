import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int[] arr = {41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            count = count * arr[i];
        }
        int total=Integer.signum(count);
        System.out.println(count);
        if(total==0){
            System.out.println(-1);
        }

        System.out.println(total);
    }
}
