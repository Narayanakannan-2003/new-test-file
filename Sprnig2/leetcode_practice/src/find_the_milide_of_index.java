public class find_the_milide_of_index {
    public static void main(String[] args) {

        String s1= "narayanakannan";
        if(s1.isEmpty()){

        }
        int[] arr = {2, 3, -1, 8, 4};
        int total =0;
        for (int i = 0; i <= arr.length/2;i++){
            total =total+arr[i];
        }
        System.out.println(total);
    }
}

