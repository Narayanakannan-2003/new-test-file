import java.util.Arrays;
public class count_no_of_strins {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1};

        for (int i = 0; i < arr.length-2; i++) {
            if(arr.length<=2){
                System.out.println("false");
            }
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }

    }
}
