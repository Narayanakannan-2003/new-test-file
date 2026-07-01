import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1={4,9,5};
        int[] arr2={9,4,9,8,4};
        System.out.print(insertion(arr1,arr2));

    }
    public static String insertion(int []arr1, int[] arr2){
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for(int num:arr1) {
            set.add(num);

        }
        for(int num:arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int []num3=new int[result.size()];
        int i=0;
        for(int nums:result){
            num3[i++]=nums;
        }


        return (Arrays.toString(num3));
    }
}
