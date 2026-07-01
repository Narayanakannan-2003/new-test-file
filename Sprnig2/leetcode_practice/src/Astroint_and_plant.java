import java.util.Arrays;

public class Astroint_and_plant {
    public static void main(String[] args) {
        int []arr={3,9,19,5,21};
        int mass=9;
        System.out.println(The_plant_is_alive(arr,mass));
    }
    public static boolean The_plant_is_alive(int []arr,int mass){
        Arrays.sort(arr);
        long m=mass;
        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                return false;
            }
            m=m+arr[i];
        }
return true;
    }
}



//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] == nums[j]) {
//
//                    int distance = j - i;
//
//                    if (distance <= k) {
//                        return true;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }
//}
