import java.util.Arrays;
import java.util.LinkedList;

public class tow_sum {
    public static void main(String[] args) {
        int[]arr={1,8,11,15};
        int target=9;
        System.out.println(Arrays.toString(tow(arr,target)));

    }

    public static int[] tow(int[]arr,int target){

       int first=0;
       int sf=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    first=i;
                    sf=j;


                }

            }
        }
        return new int[]{first,sf};

    }
}
