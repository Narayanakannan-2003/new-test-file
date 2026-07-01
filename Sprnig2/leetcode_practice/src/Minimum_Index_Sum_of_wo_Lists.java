import java.util.Arrays;
import java.util.HashSet;

public class Minimum_Index_Sum_of_wo_Lists {
    public static void main(String[] args) {
String[]s1={"Shogun","Tapioca Express","Burger King","KFC"};
        String[]s2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(find_the_new(s1, s2)));
    }
    public static String[] find_the_new(String[]s1,String[]s2){
        String []s3=new String[1];
        HashSet<String>set=new HashSet<>();
        for(String num:s1){
            set.add(num);
        }
        for(String num:s2){
            if(set.contains(num)){
                s3[0]=num;
            }

        }
        return s3;
    }
}
