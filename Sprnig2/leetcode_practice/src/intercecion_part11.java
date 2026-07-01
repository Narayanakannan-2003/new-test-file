import java.util.Arrays;
import java.util.LinkedList;

public class intercecion_part11 {
    public static void main(String[] args) {
        int []arr1={4,9,5};
        int []arr2={9,4,9,8,4};
        System.out.println((Arrays.toString(inter(arr1,arr2))));

    }

    public static int[] inter(int []arr1,int []arr2){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                    arr2[j]=-1;
                    break;
                }
            }
        }
        int[]res=new int[list.size()];
        int p=0;
        for(int num:list){
            res[p++]=num;
        }
        return res;
    }
}
