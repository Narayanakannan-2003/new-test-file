import java.util.Arrays;

public class retuen_the_one_non_repeting_element_in_array {
    public static void main(String[] args) {
    int []arr={1,2,1,2,4};
        System.out.println(give_one_non_repenig_emement(arr));




}
public static int give_one_non_repenig_emement( int[]arr){
        int result;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count ==1){
                 result=arr[i];
               return result;
            }
        }
        return-1;
    }
}
