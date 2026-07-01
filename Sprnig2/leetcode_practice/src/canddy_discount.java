import java.util.Arrays;

public class canddy_discount {
    public static void main(String[] args) {
        int []cost={5,5};
        System.out.println(give_addofnum(cost));
    }

    public static int give_addofnum( int [] cost){
        Arrays.sort(cost);
        int result=0;
        for(int i=cost.length-1;i>=0;i--){
            if(cost.length-1-i %3 !=2){
                result=result+cost[i];
            }
        }
        return result;
    }
}
