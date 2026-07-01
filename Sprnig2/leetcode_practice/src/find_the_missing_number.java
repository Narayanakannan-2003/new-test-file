import java.util.Arrays;

public class find_the_missing_number {
    public static void main(String[] args) {
        int []arr={0,1,3,4,5,6};
        System.out.println(find_missing_number(arr));

    }
    public static int find_missing_number(int[]arr){
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length;
        int sumation=n*(n+1)/2;
        for(int num:arr){
            sum=sum+num;
        }
        return sumation-sum;
    }
}
